package ua.org.gostroy.guestbook.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import ua.org.gostroy.guestbook.model.Entry;
import ua.org.gostroy.guestbook.model.Guestbook;
import ua.org.gostroy.guestbook.service.EntryLocalServiceUtil;
import ua.org.gostroy.guestbook.service.GuestbookLocalServiceUtil;

/**
 * Portlet implementation class GuestBookPortlet
 */
public class GuestBookPortlet extends MVCPortlet {
	
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {

	    try {
	        ServiceContext serviceContext = ServiceContextFactory.getInstance(Guestbook.class.getName(), renderRequest);
	        long groupId = serviceContext.getScopeGroupId();

	        long guestbookId = ParamUtil.getLong(renderRequest, "guestbookId");

	        List<Guestbook> guestbooks = GuestbookLocalServiceUtil.getGuestbooks(groupId);

	        if (guestbooks.size() == 0) {
	            Guestbook guestbook = GuestbookLocalServiceUtil.addGuestbook(serviceContext.getUserId(), "Main", serviceContext);
	            guestbookId = guestbook.getGuestbookId();
	        }

	        if (!(guestbookId > 0)) {
	            guestbookId = guestbooks.get(0).getGuestbookId();
	        }

	        renderRequest.setAttribute("guestbookId", guestbookId);

	    } catch (Exception e) {
	        throw new PortletException(e);
	    }

	    super.render(renderRequest, renderResponse);
	}
	
 
	public void addEntry(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance( Entry.class.getName(), request);

	    String userName = ParamUtil.getString(request, "name");
	    String email = ParamUtil.getString(request, "email");
	    String message = ParamUtil.getString(request, "message");
	    long guestbookId = ParamUtil.getLong(request, "guestbookId");
	    long entryId = ParamUtil.getLong(request, "entryId");

	    if (entryId > 0) {

	       try {
	         EntryLocalServiceUtil.updateEntry(serviceContext.getUserId(), guestbookId, entryId, userName, email, message, serviceContext);
	         SessionMessages.add(request, "entryAdded");
	         response.setRenderParameter("guestbookId", Long.toString(guestbookId));
	       } catch (Exception e) {
	         SessionErrors.add(request, e.getClass().getName());
             PortalUtil.copyRequestParameters(request, response);
	         response.setRenderParameter("mvcPath", "/html/guestbook/edit_entry.jsp");
	       }

	    }
	    else {

	       try {
	         EntryLocalServiceUtil.addEntry(serviceContext.getUserId(), guestbookId, userName, email, message, serviceContext);
	         SessionMessages.add(request, "entryAdded");
	         response.setRenderParameter("guestbookId", Long.toString(guestbookId));
	       } catch (Exception e) {
	         SessionErrors.add(request, e.getClass().getName());
             PortalUtil.copyRequestParameters(request, response);
	         response.setRenderParameter("mvcPath", "/html/guestbook/edit_entry.jsp");
	       }
	    }
	}
	
	public void deleteEntry (ActionRequest request, ActionResponse response) {

	    long entryId = ParamUtil.getLong(request, "entryId");
	    long guestbookId = ParamUtil.getLong(request, "guestbookId");

	    try {
	       ServiceContext serviceContext = ServiceContextFactory.getInstance(Entry.class.getName(), request);
           response.setRenderParameter("guestbookId", Long.toString(guestbookId));
	       EntryLocalServiceUtil.deleteEntry(entryId, serviceContext);
	    } catch (Exception e) {
	       SessionErrors.add(request, e.getClass().getName());
	    }
	}

	public void addGuestbook(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(Guestbook.class.getName(), request);

	    String name = ParamUtil.getString(request, "name");

	    try {
	        GuestbookLocalServiceUtil.addGuestbook(serviceContext.getUserId(), name, serviceContext);
	        SessionMessages.add(request, "guestbookAdded");
	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());
	        response.setRenderParameter("mvcPath", "/html/guestbook/edit_guestbook.jsp");
	    }

	}
	
}
