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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ua.org.gostroy.guestbook.model.Entry3;

import java.util.List;

/**
 * The persistence utility for the entry3 service. This utility wraps {@link Entry3PersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sergey
 * @see Entry3Persistence
 * @see Entry3PersistenceImpl
 * @generated
 */
public class Entry3Util {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Entry3 entry3) {
		getPersistence().clearCache(entry3);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Entry3> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Entry3> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Entry3> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Entry3 update(Entry3 entry3) throws SystemException {
		return getPersistence().update(entry3);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Entry3 update(Entry3 entry3, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(entry3, serviceContext);
	}

	/**
	* Returns all the entry3s where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the matching entry3s
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ua.org.gostroy.guestbook.model.Entry3> findByG_G(
		long groupId, long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_G(groupId, guestbookId);
	}

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
	public static java.util.List<ua.org.gostroy.guestbook.model.Entry3> findByG_G(
		long groupId, long guestbookId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_G(groupId, guestbookId, start, end);
	}

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
	public static java.util.List<ua.org.gostroy.guestbook.model.Entry3> findByG_G(
		long groupId, long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_G(groupId, guestbookId, start, end,
			orderByComparator);
	}

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
	public static ua.org.gostroy.guestbook.model.Entry3 findByG_G_First(
		long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchEntry3Exception {
		return getPersistence()
				   .findByG_G_First(groupId, guestbookId, orderByComparator);
	}

	/**
	* Returns the first entry3 in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entry3, or <code>null</code> if a matching entry3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Entry3 fetchByG_G_First(
		long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_G_First(groupId, guestbookId, orderByComparator);
	}

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
	public static ua.org.gostroy.guestbook.model.Entry3 findByG_G_Last(
		long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchEntry3Exception {
		return getPersistence()
				   .findByG_G_Last(groupId, guestbookId, orderByComparator);
	}

	/**
	* Returns the last entry3 in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entry3, or <code>null</code> if a matching entry3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Entry3 fetchByG_G_Last(
		long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_G_Last(groupId, guestbookId, orderByComparator);
	}

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
	public static ua.org.gostroy.guestbook.model.Entry3[] findByG_G_PrevAndNext(
		long entryId, long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchEntry3Exception {
		return getPersistence()
				   .findByG_G_PrevAndNext(entryId, groupId, guestbookId,
			orderByComparator);
	}

	/**
	* Removes all the entry3s where groupId = &#63; and guestbookId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_G(long groupId, long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_G(groupId, guestbookId);
	}

	/**
	* Returns the number of entry3s where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the number of matching entry3s
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_G(long groupId, long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_G(groupId, guestbookId);
	}

	/**
	* Caches the entry3 in the entity cache if it is enabled.
	*
	* @param entry3 the entry3
	*/
	public static void cacheResult(ua.org.gostroy.guestbook.model.Entry3 entry3) {
		getPersistence().cacheResult(entry3);
	}

	/**
	* Caches the entry3s in the entity cache if it is enabled.
	*
	* @param entry3s the entry3s
	*/
	public static void cacheResult(
		java.util.List<ua.org.gostroy.guestbook.model.Entry3> entry3s) {
		getPersistence().cacheResult(entry3s);
	}

	/**
	* Creates a new entry3 with the primary key. Does not add the entry3 to the database.
	*
	* @param entryId the primary key for the new entry3
	* @return the new entry3
	*/
	public static ua.org.gostroy.guestbook.model.Entry3 create(long entryId) {
		return getPersistence().create(entryId);
	}

	/**
	* Removes the entry3 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the entry3
	* @return the entry3 that was removed
	* @throws ua.org.gostroy.guestbook.NoSuchEntry3Exception if a entry3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Entry3 remove(long entryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchEntry3Exception {
		return getPersistence().remove(entryId);
	}

	public static ua.org.gostroy.guestbook.model.Entry3 updateImpl(
		ua.org.gostroy.guestbook.model.Entry3 entry3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(entry3);
	}

	/**
	* Returns the entry3 with the primary key or throws a {@link ua.org.gostroy.guestbook.NoSuchEntry3Exception} if it could not be found.
	*
	* @param entryId the primary key of the entry3
	* @return the entry3
	* @throws ua.org.gostroy.guestbook.NoSuchEntry3Exception if a entry3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Entry3 findByPrimaryKey(
		long entryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchEntry3Exception {
		return getPersistence().findByPrimaryKey(entryId);
	}

	/**
	* Returns the entry3 with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the entry3
	* @return the entry3, or <code>null</code> if a entry3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Entry3 fetchByPrimaryKey(
		long entryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(entryId);
	}

	/**
	* Returns all the entry3s.
	*
	* @return the entry3s
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ua.org.gostroy.guestbook.model.Entry3> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<ua.org.gostroy.guestbook.model.Entry3> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<ua.org.gostroy.guestbook.model.Entry3> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the entry3s from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of entry3s.
	*
	* @return the number of entry3s
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static Entry3Persistence getPersistence() {
		if (_persistence == null) {
			_persistence = (Entry3Persistence)PortletBeanLocatorUtil.locate(ua.org.gostroy.guestbook.service.ClpSerializer.getServletContextName(),
					Entry3Persistence.class.getName());

			ReferenceRegistry.registerReference(Entry3Util.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(Entry3Persistence persistence) {
	}

	private static Entry3Persistence _persistence;
}