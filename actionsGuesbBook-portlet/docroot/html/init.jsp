<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="ua.org.gostroy.guestbook.model.Guestbook" %>
<%@ page import="ua.org.gostroy.guestbook.service.EntryLocalServiceUtil" %>
<%@ page import="ua.org.gostroy.guestbook.service.GuestbookLocalServiceUtil" %>

<%@ page import="ua.org.gostroy.guestbook.service.permission.GuestbookModelPermission" %>
<%@ page import="ua.org.gostroy.guestbook.service.permission.GuestbookPermission" %>
<%@ page import="ua.org.gostroy.guestbook.service.permission.EntryPermission" %>

<portlet:defineObjects />
<theme:defineObjects />