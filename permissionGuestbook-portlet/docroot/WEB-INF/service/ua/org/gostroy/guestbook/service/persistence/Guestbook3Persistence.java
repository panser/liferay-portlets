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

import ua.org.gostroy.guestbook.model.Guestbook3;

/**
 * The persistence interface for the guestbook3 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sergey
 * @see Guestbook3PersistenceImpl
 * @see Guestbook3Util
 * @generated
 */
public interface Guestbook3Persistence extends BasePersistence<Guestbook3> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Guestbook3Util} to access the guestbook3 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the guestbook3s where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the guestbook3s where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Guestbook3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of guestbook3s
	* @param end the upper bound of the range of guestbook3s (not inclusive)
	* @return the range of matching guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the guestbook3s where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Guestbook3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of guestbook3s
	* @param end the upper bound of the range of guestbook3s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first guestbook3 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching guestbook3
	* @throws ua.org.gostroy.guestbook.NoSuchGuestbook3Exception if a matching guestbook3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Guestbook3 findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchGuestbook3Exception;

	/**
	* Returns the first guestbook3 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching guestbook3, or <code>null</code> if a matching guestbook3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Guestbook3 fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last guestbook3 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching guestbook3
	* @throws ua.org.gostroy.guestbook.NoSuchGuestbook3Exception if a matching guestbook3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Guestbook3 findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchGuestbook3Exception;

	/**
	* Returns the last guestbook3 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching guestbook3, or <code>null</code> if a matching guestbook3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Guestbook3 fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the guestbook3s before and after the current guestbook3 in the ordered set where groupId = &#63;.
	*
	* @param guestbookId the primary key of the current guestbook3
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next guestbook3
	* @throws ua.org.gostroy.guestbook.NoSuchGuestbook3Exception if a guestbook3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Guestbook3[] findByGroupId_PrevAndNext(
		long guestbookId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchGuestbook3Exception;

	/**
	* Removes all the guestbook3s where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of guestbook3s where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the guestbook3 in the entity cache if it is enabled.
	*
	* @param guestbook3 the guestbook3
	*/
	public void cacheResult(
		ua.org.gostroy.guestbook.model.Guestbook3 guestbook3);

	/**
	* Caches the guestbook3s in the entity cache if it is enabled.
	*
	* @param guestbook3s the guestbook3s
	*/
	public void cacheResult(
		java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> guestbook3s);

	/**
	* Creates a new guestbook3 with the primary key. Does not add the guestbook3 to the database.
	*
	* @param guestbookId the primary key for the new guestbook3
	* @return the new guestbook3
	*/
	public ua.org.gostroy.guestbook.model.Guestbook3 create(long guestbookId);

	/**
	* Removes the guestbook3 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the guestbook3
	* @return the guestbook3 that was removed
	* @throws ua.org.gostroy.guestbook.NoSuchGuestbook3Exception if a guestbook3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Guestbook3 remove(long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchGuestbook3Exception;

	public ua.org.gostroy.guestbook.model.Guestbook3 updateImpl(
		ua.org.gostroy.guestbook.model.Guestbook3 guestbook3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the guestbook3 with the primary key or throws a {@link ua.org.gostroy.guestbook.NoSuchGuestbook3Exception} if it could not be found.
	*
	* @param guestbookId the primary key of the guestbook3
	* @return the guestbook3
	* @throws ua.org.gostroy.guestbook.NoSuchGuestbook3Exception if a guestbook3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Guestbook3 findByPrimaryKey(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchGuestbook3Exception;

	/**
	* Returns the guestbook3 with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param guestbookId the primary key of the guestbook3
	* @return the guestbook3, or <code>null</code> if a guestbook3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ua.org.gostroy.guestbook.model.Guestbook3 fetchByPrimaryKey(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the guestbook3s.
	*
	* @return the guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the guestbook3s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Guestbook3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of guestbook3s
	* @param end the upper bound of the range of guestbook3s (not inclusive)
	* @return the range of guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the guestbook3s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Guestbook3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of guestbook3s
	* @param end the upper bound of the range of guestbook3s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the guestbook3s from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of guestbook3s.
	*
	* @return the number of guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}