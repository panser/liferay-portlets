package ua.org.gostroy.guestbook.asset;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;

import ua.org.gostroy.guestbook.model.Entry;
import ua.org.gostroy.guestbook.service.EntryLocalServiceUtil;
import ua.org.gostroy.guestbook.service.permission.EntryPermission;

public class EntryAssetRendererFactory extends BaseAssetRendererFactory {

	public static final String CLASS_NAME = Entry.class.getName();
	public static final String TYPE = "entry";

	@Override
	public AssetRenderer getAssetRenderer(long classPK, int type) throws PortalException, SystemException {
		Entry entry = EntryLocalServiceUtil.getEntry(classPK);
		return new EntryAssetRenderer(entry);
	}

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public boolean hasPermission(PermissionChecker permissionChecker, long classPK, String actionId) throws Exception {
		return EntryPermission.contains(permissionChecker, classPK, actionId);
	}

	@Override
	public boolean isLinkable() {
		return _LINKABLE;
	}

	private static final boolean _LINKABLE = true;

}