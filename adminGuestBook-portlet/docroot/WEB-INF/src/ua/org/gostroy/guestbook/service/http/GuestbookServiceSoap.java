/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ua.org.gostroy.guestbook.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import ua.org.gostroy.guestbook.service.GuestbookServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link ua.org.gostroy.guestbook.service.GuestbookServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link ua.org.gostroy.guestbook.model.GuestbookSoap}.
 * If the method in the service utility returns a
 * {@link ua.org.gostroy.guestbook.model.Guestbook}, that is translated to a
 * {@link ua.org.gostroy.guestbook.model.GuestbookSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Sergey
 * @see GuestbookServiceHttp
 * @see ua.org.gostroy.guestbook.model.GuestbookSoap
 * @see ua.org.gostroy.guestbook.service.GuestbookServiceUtil
 * @generated
 */
public class GuestbookServiceSoap {
	public static ua.org.gostroy.guestbook.model.GuestbookSoap addGuestbook(
		long userId, java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			ua.org.gostroy.guestbook.model.Guestbook returnValue = GuestbookServiceUtil.addGuestbook(userId,
					name, serviceContext);

			return ua.org.gostroy.guestbook.model.GuestbookSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static ua.org.gostroy.guestbook.model.GuestbookSoap deleteGuestbook(
		long guestbookId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			ua.org.gostroy.guestbook.model.Guestbook returnValue = GuestbookServiceUtil.deleteGuestbook(guestbookId,
					serviceContext);

			return ua.org.gostroy.guestbook.model.GuestbookSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static ua.org.gostroy.guestbook.model.GuestbookSoap updateGuestbook(
		long userId, long guestbookId, java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			ua.org.gostroy.guestbook.model.Guestbook returnValue = GuestbookServiceUtil.updateGuestbook(userId,
					guestbookId, name, serviceContext);

			return ua.org.gostroy.guestbook.model.GuestbookSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static ua.org.gostroy.guestbook.model.GuestbookSoap[] getGuestbooks(
		long groupId) throws RemoteException {
		try {
			java.util.List<ua.org.gostroy.guestbook.model.Guestbook> returnValue =
				GuestbookServiceUtil.getGuestbooks(groupId);

			return ua.org.gostroy.guestbook.model.GuestbookSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static ua.org.gostroy.guestbook.model.GuestbookSoap[] getGuestbooks(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<ua.org.gostroy.guestbook.model.Guestbook> returnValue =
				GuestbookServiceUtil.getGuestbooks(groupId, start, end);

			return ua.org.gostroy.guestbook.model.GuestbookSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getGuestbooksCount(long groupId)
		throws RemoteException {
		try {
			int returnValue = GuestbookServiceUtil.getGuestbooksCount(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static ua.org.gostroy.guestbook.model.GuestbookSoap getGuestbookByG_N(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws RemoteException {
		try {
			ua.org.gostroy.guestbook.model.Guestbook returnValue = GuestbookServiceUtil.getGuestbookByG_N(groupId,
					name, orderByComparator);

			return ua.org.gostroy.guestbook.model.GuestbookSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(GuestbookServiceSoap.class);
}