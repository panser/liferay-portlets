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

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

import ua.org.gostroy.guestbook.GuestbookNameException;
import ua.org.gostroy.guestbook.model.Entry;
import ua.org.gostroy.guestbook.model.Guestbook;
import ua.org.gostroy.guestbook.service.EntryLocalServiceUtil;
import ua.org.gostroy.guestbook.service.base.GuestbookLocalServiceBaseImpl;

/**
 * The implementation of the guestbook local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ua.org.gostroy.guestbook.service.GuestbookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sergey
 * @see ua.org.gostroy.guestbook.service.base.GuestbookLocalServiceBaseImpl
 * @see ua.org.gostroy.guestbook.service.GuestbookLocalServiceUtil
 */
public class GuestbookLocalServiceImpl extends GuestbookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link ua.org.gostroy.guestbook.service.GuestbookLocalServiceUtil} to access the guestbook local service.
	 */
	
	public List<Guestbook> getGuestbooks (long groupId) throws SystemException {
	    return guestbookPersistence.findByGroupId(groupId);
	}

	public List<Guestbook> getGuestbooks (long groupId, int start, int end) throws SystemException {
	    return guestbookPersistence.findByGroupId(groupId, start, end);
	}
	
	public Guestbook addGuestbook(long userId, String name, ServiceContext serviceContext) throws SystemException, PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(name);

		long guestbookId = counterLocalService.increment();

		Guestbook guestbook = guestbookPersistence.create(guestbookId);

//		guestbook.setUuid(serviceContext.getUuid());
		guestbook.setUserId(userId);
		guestbook.setGroupId(groupId);
		guestbook.setCompanyId(user.getCompanyId());
		guestbook.setUserName(user.getFullName());
		guestbook.setCreateDate(serviceContext.getCreateDate(now));
		guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		guestbook.setName(name);
		guestbook.setExpandoBridgeAttributes(serviceContext);

		guestbookPersistence.update(guestbook);
		
		resourceLocalService.addResources(user.getCompanyId(), groupId, userId, Guestbook.class.getName(), guestbookId, false, true, true);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(Guestbook.class);
		indexer.reindex(guestbook);

		return guestbook;
	}
	
	public Guestbook updateGuestbook(long userId, long guestbookId, String name, ServiceContext serviceContext) throws PortalException, SystemException {

        Date now = new Date();
        validate(name);
        Guestbook guestbook = getGuestbook(guestbookId);
        User user = UserLocalServiceUtil.getUser(userId);

        guestbook.setUserId(userId);
        guestbook.setUserName(user.getFullName());
        guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
        guestbook.setName(name);
        guestbook.setExpandoBridgeAttributes(serviceContext);

        guestbookPersistence.update(guestbook);
        resourceLocalService.updateResources(serviceContext.getCompanyId(),
                        serviceContext.getScopeGroupId(), name, guestbookId,
                        serviceContext.getGroupPermissions(),
                        serviceContext.getGuestPermissions());
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(Guestbook.class);
		indexer.reindex(guestbook);

        return guestbook;
	}

	public Guestbook deleteGuestbook(long guestbookId, ServiceContext serviceContext) throws PortalException, SystemException {

	    Guestbook guestbook = getGuestbook(guestbookId);
	    List<Entry> entries = EntryLocalServiceUtil.getEntries(serviceContext.getScopeGroupId(), guestbookId);
	
	    for (Entry entry : entries) {
	            EntryLocalServiceUtil.deleteEntry(entry.getEntryId(),serviceContext);
	    }
	
	    resourceLocalService.deleteResource(serviceContext.getCompanyId(), Guestbook.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, guestbookId);
	    guestbook = deleteGuestbook(guestbook);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(Guestbook.class);
		indexer.delete(guestbook);

	    return guestbook;
	}
	
	public int getGuestbooksCount(long groupId) throws SystemException {
        return guestbookPersistence.countByGroupId(groupId);
	}
	
	
	protected void validate (String name) throws PortalException {
	    if (Validator.isNull(name)) {
	       throw new GuestbookNameException();
	    }
	}
}