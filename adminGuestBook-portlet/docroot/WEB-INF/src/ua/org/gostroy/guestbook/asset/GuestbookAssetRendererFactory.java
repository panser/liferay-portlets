package ua.org.gostroy.guestbook.asset;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;

import ua.org.gostroy.guestbook.model.Guestbook;
import ua.org.gostroy.guestbook.service.GuestbookLocalServiceUtil;
import ua.org.gostroy.guestbook.service.permission.GuestbookPermission;

public class GuestbookAssetRendererFactory extends BaseAssetRendererFactory {

	public static final String CLASS_NAME = Guestbook.class.getName();
	public static final String TYPE = "guestbook";

	@Override
	public AssetRenderer getAssetRenderer(long classPK, int type) throws PortalException, SystemException {

		Guestbook guestbook = GuestbookLocalServiceUtil.getGuestbook(classPK);
		return new GuestbookAssetRenderer(guestbook);
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
		return GuestbookPermission.contains(permissionChecker, classPK, actionId);
	}

	@Override
	public boolean isLinkable() {
		return _LINKABLE;
	}

	private static final boolean _LINKABLE = true;

}