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

import ua.org.gostroy.guestbook.model.Guestbook3;

import java.util.List;

/**
 * The persistence utility for the guestbook3 service. This utility wraps {@link Guestbook3PersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sergey
 * @see Guestbook3Persistence
 * @see Guestbook3PersistenceImpl
 * @generated
 */
public class Guestbook3Util {
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
	public static void clearCache(Guestbook3 guestbook3) {
		getPersistence().clearCache(guestbook3);
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
	public static List<Guestbook3> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Guestbook3> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Guestbook3> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Guestbook3 update(Guestbook3 guestbook3)
		throws SystemException {
		return getPersistence().update(guestbook3);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Guestbook3 update(Guestbook3 guestbook3,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(guestbook3, serviceContext);
	}

	/**
	* Returns all the guestbook3s where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first guestbook3 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching guestbook3
	* @throws ua.org.gostroy.guestbook.NoSuchGuestbook3Exception if a matching guestbook3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Guestbook3 findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchGuestbook3Exception {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first guestbook3 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching guestbook3, or <code>null</code> if a matching guestbook3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Guestbook3 fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last guestbook3 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching guestbook3
	* @throws ua.org.gostroy.guestbook.NoSuchGuestbook3Exception if a matching guestbook3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Guestbook3 findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchGuestbook3Exception {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last guestbook3 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching guestbook3, or <code>null</code> if a matching guestbook3 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Guestbook3 fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

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
	public static ua.org.gostroy.guestbook.model.Guestbook3[] findByGroupId_PrevAndNext(
		long guestbookId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchGuestbook3Exception {
		return getPersistence()
				   .findByGroupId_PrevAndNext(guestbookId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the guestbook3s where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of guestbook3s where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Caches the guestbook3 in the entity cache if it is enabled.
	*
	* @param guestbook3 the guestbook3
	*/
	public static void cacheResult(
		ua.org.gostroy.guestbook.model.Guestbook3 guestbook3) {
		getPersistence().cacheResult(guestbook3);
	}

	/**
	* Caches the guestbook3s in the entity cache if it is enabled.
	*
	* @param guestbook3s the guestbook3s
	*/
	public static void cacheResult(
		java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> guestbook3s) {
		getPersistence().cacheResult(guestbook3s);
	}

	/**
	* Creates a new guestbook3 with the primary key. Does not add the guestbook3 to the database.
	*
	* @param guestbookId the primary key for the new guestbook3
	* @return the new guestbook3
	*/
	public static ua.org.gostroy.guestbook.model.Guestbook3 create(
		long guestbookId) {
		return getPersistence().create(guestbookId);
	}

	/**
	* Removes the guestbook3 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the guestbook3
	* @return the guestbook3 that was removed
	* @throws ua.org.gostroy.guestbook.NoSuchGuestbook3Exception if a guestbook3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Guestbook3 remove(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchGuestbook3Exception {
		return getPersistence().remove(guestbookId);
	}

	public static ua.org.gostroy.guestbook.model.Guestbook3 updateImpl(
		ua.org.gostroy.guestbook.model.Guestbook3 guestbook3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(guestbook3);
	}

	/**
	* Returns the guestbook3 with the primary key or throws a {@link ua.org.gostroy.guestbook.NoSuchGuestbook3Exception} if it could not be found.
	*
	* @param guestbookId the primary key of the guestbook3
	* @return the guestbook3
	* @throws ua.org.gostroy.guestbook.NoSuchGuestbook3Exception if a guestbook3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Guestbook3 findByPrimaryKey(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			ua.org.gostroy.guestbook.NoSuchGuestbook3Exception {
		return getPersistence().findByPrimaryKey(guestbookId);
	}

	/**
	* Returns the guestbook3 with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param guestbookId the primary key of the guestbook3
	* @return the guestbook3, or <code>null</code> if a guestbook3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ua.org.gostroy.guestbook.model.Guestbook3 fetchByPrimaryKey(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(guestbookId);
	}

	/**
	* Returns all the guestbook3s.
	*
	* @return the guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the guestbook3s from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of guestbook3s.
	*
	* @return the number of guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static Guestbook3Persistence getPersistence() {
		if (_persistence == null) {
			_persistence = (Guestbook3Persistence)PortletBeanLocatorUtil.locate(ua.org.gostroy.guestbook.service.ClpSerializer.getServletContextName(),
					Guestbook3Persistence.class.getName());

			ReferenceRegistry.registerReference(Guestbook3Util.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(Guestbook3Persistence persistence) {
	}

	private static Guestbook3Persistence _persistence;
}