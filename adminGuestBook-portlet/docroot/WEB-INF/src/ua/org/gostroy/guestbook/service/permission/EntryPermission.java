package ua.org.gostroy.guestbook.service.permission;

import ua.org.gostroy.guestbook.model.Entry;
import ua.org.gostroy.guestbook.service.EntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

public class EntryPermission {

	public static void check(PermissionChecker permissionChecker, long entryId, String actionId) throws PortalException, SystemException {

		if (!contains(permissionChecker, entryId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, long entryId, String actionId) throws PortalException, SystemException {

		Entry entry = EntryLocalServiceUtil.getEntry(entryId);
		return permissionChecker.hasPermission(entry.getGroupId(), Entry.class.getName(), entry.getEntryId(), actionId);

	}
}