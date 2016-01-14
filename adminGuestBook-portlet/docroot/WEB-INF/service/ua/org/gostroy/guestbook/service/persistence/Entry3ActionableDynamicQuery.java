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

package ua.org.gostroy.guestbook.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ua.org.gostroy.guestbook.model.Entry3;
import ua.org.gostroy.guestbook.service.Entry3LocalServiceUtil;

/**
 * @author Sergey
 * @generated
 */
public abstract class Entry3ActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public Entry3ActionableDynamicQuery() throws SystemException {
		setBaseLocalService(Entry3LocalServiceUtil.getService());
		setClass(Entry3.class);

		setClassLoader(ua.org.gostroy.guestbook.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("entryId");
	}
}