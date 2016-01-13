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

import ua.org.gostroy.guestbook.model.Entry;
import ua.org.gostroy.guestbook.service.EntryLocalServiceUtil;

/**
 * @author Sergey
 * @generated
 */
public abstract class EntryActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public EntryActionableDynamicQuery() throws SystemException {
		setBaseLocalService(EntryLocalServiceUtil.getService());
		setClass(Entry.class);

		setClassLoader(ua.org.gostroy.guestbook.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("entryId");
	}
}