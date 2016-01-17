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

package ua.org.gostroy.guestbook.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import ua.org.gostroy.guestbook.model.Guestbook;
import ua.org.gostroy.guestbook.service.GuestbookLocalServiceUtil;
import ua.org.gostroy.guestbook.service.base.GuestbookServiceBaseImpl;

/**
 * The implementation of the guestbook remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link ua.org.gostroy.guestbook.service.GuestbookService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Sergey
 * @see ua.org.gostroy.guestbook.service.base.GuestbookServiceBaseImpl
 * @see ua.org.gostroy.guestbook.service.GuestbookServiceUtil
 */
public class GuestbookServiceImpl extends GuestbookServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * ua.org.gostroy.guestbook.service.GuestbookServiceUtil} to access the
	 * guestbook remote service.
	 */

	public Guestbook addGuestbook(long userId, String name, ServiceContext serviceContext) throws SystemException, PortalException {

		return GuestbookLocalServiceUtil.addGuestbook(userId, name, serviceContext);
	}

	public Guestbook deleteGuestbook(long guestbookId, ServiceContext serviceContext) throws PortalException, SystemException {

		return GuestbookLocalServiceUtil.deleteGuestbook(guestbookId);
	}

	public List<Guestbook> getGuestbooks(long groupId) throws SystemException {
		return GuestbookLocalServiceUtil.getGuestbooks(groupId);
	}

	public List<Guestbook> getGuestbooks(long groupId, int start, int end) throws SystemException {
		return GuestbookLocalServiceUtil.getGuestbooks(groupId, start, end);
	}

	public int getGuestbooksCount(long groupId) throws SystemException {
		return GuestbookLocalServiceUtil.getGuestbooksCount();
	}

	public Guestbook updateGuestbook(long userId, long guestbookId, String name, ServiceContext serviceContext) throws PortalException, SystemException {

		return GuestbookLocalServiceUtil.updateGuestbook(userId, guestbookId, name, serviceContext);
	}	
}