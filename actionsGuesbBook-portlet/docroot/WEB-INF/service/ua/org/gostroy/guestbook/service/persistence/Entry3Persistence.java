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

import com.liferay.portal.service.persistence.BasePersistence;

import ua.org.gostroy.guestbook.model.Entry3;

/**
 * The persistence interface for the entry3 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sergey
 * @see Entry3PersistenceImpl
 * @see Entry3Util
 * @generated
 */
public interface Entry3Persistence extends BasePersistence<Entry3> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Entry3Util} to access the entry3 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the entry3s where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the matching entry3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Entry3> findByG_G(
		long groupId, long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the entry3s where groupId = &#63; and guestbookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Entry3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param start the lower bound of the range of entry3s
	* @param end the upper bound of the range of entry3s (not inclusive)
	* @return the range of matching entry3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Entry3> findByG_G(
		long groupId, long guestbookId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the entry3s where groupId = &#63; and guestbookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Entry3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param start the lower bound of the range of entry3s
	* @param end the upper bound of the range of entry3s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching entry3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Entry3> findByG_G(
		long groupId, long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first entry3 in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entry3
	* @throws ua.org.gostroy.guestbook.NoSuchEntry3Exception if a matching entry3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Entry3 findByG_G_First(long groupId,
		long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchEntry3Exception;

	/**
	* Returns the first entry3 in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entry3, or <code>null</code> if a matching entry3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Entry3 fetchByG_G_First(
		long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last entry3 in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entry3
	* @throws ua.org.gostroy.guestbook.NoSuchEntry3Exception if a matching entry3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Entry3 findByG_G_Last(long groupId,
		long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchEntry3Exception;

	/**
	* Returns the last entry3 in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entry3, or <code>null</code> if a matching entry3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Entry3 fetchByG_G_Last(long groupId,
		long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the entry3s before and after the current entry3 in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param entryId the primary key of the current entry3
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next entry3
	* @throws ua.org.gostroy.guestbook.NoSuchEntry3Exception if a entry3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Entry3[] findByG_G_PrevAndNext(
		long entryId, long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchEntry3Exception;

	/**
	* Removes all the entry3s where groupId = &#63; and guestbookId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_G(long groupId, long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of entry3s where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the number of matching entry3s
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_G(long groupId, long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the entry3 in the entity cache if it is enabled.
	*
	* @param entry3 the entry3
	*/
	public void cacheResult(ua.org.gostroy.guestbook.model.Entry3 entry3);

	/**
	* Caches the entry3s in the entity cache if it is enabled.
	*
	* @param entry3s the entry3s
	*/
	public void cacheResult(
		java.util.List<ua.org.gostroy.guestbook.model.Entry3> entry3s);

	/**
	* Creates a new entry3 with the primary key. Does not add the entry3 to the database.
	*
	* @param entryId the primary key for the new entry3
	* @return the new entry3
	*/
	public ua.org.gostroy.guestbook.model.Entry3 create(long entryId);

	/**
	* Removes the entry3 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the entry3
	* @return the entry3 that was removed
	* @throws ua.org.gostroy.guestbook.NoSuchEntry3Exception if a entry3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Entry3 remove(long entryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchEntry3Exception;

	public ua.org.gostroy.guestbook.model.Entry3 updateImpl(
		ua.org.gostroy.guestbook.model.Entry3 entry3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the entry3 with the primary key or throws a {@link ua.org.gostroy.guestbook.NoSuchEntry3Exception} if it could not be found.
	*
	* @param entryId the primary key of the entry3
	* @return the entry3
	* @throws ua.org.gostroy.guestbook.NoSuchEntry3Exception if a entry3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Entry3 findByPrimaryKey(long entryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchEntry3Exception;

	/**
	* Returns the entry3 with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the entry3
	* @return the entry3, or <code>null</code> if a entry3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Entry3 fetchByPrimaryKey(long entryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the entry3s.
	*
	* @return the entry3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Entry3> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the entry3s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Entry3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of entry3s
	* @param end the upper bound of the range of entry3s (not inclusive)
	* @return the range of entry3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Entry3> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the entry3s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Entry3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of entry3s
	* @param end the upper bound of the range of entry3s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of entry3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Entry3> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the entry3s from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of entry3s.
	*
	* @return the number of entry3s
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}