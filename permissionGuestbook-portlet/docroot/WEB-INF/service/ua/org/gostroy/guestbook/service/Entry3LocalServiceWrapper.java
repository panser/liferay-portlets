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

package ua.org.gostroy.guestbook.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Entry3LocalService}.
 *
 * @author Sergey
 * @see Entry3LocalService
 * @generated
 */
public class Entry3LocalServiceWrapper implements Entry3LocalService,
	ServiceWrapper<Entry3LocalService> {
	public Entry3LocalServiceWrapper(Entry3LocalService entry3LocalService) {
		_entry3LocalService = entry3LocalService;
	}

	/**
	* Adds the entry3 to the database. Also notifies the appropriate model listeners.
	*
	* @param entry3 the entry3
	* @return the entry3 that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Entry3 addEntry3(
		ua.org.gostroy.guestbook.model.Entry3 entry3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.addEntry3(entry3);
	}

	/**
	* Creates a new entry3 with the primary key. Does not add the entry3 to the database.
	*
	* @param entryId the primary key for the new entry3
	* @return the new entry3
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Entry3 createEntry3(long entryId) {
		return _entry3LocalService.createEntry3(entryId);
	}

	/**
	* Deletes the entry3 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the entry3
	* @return the entry3 that was removed
	* @throws PortalException if a entry3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Entry3 deleteEntry3(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.deleteEntry3(entryId);
	}

	/**
	* Deletes the entry3 from the database. Also notifies the appropriate model listeners.
	*
	* @param entry3 the entry3
	* @return the entry3 that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Entry3 deleteEntry3(
		ua.org.gostroy.guestbook.model.Entry3 entry3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.deleteEntry3(entry3);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _entry3LocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Entry3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Entry3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ua.org.gostroy.guestbook.model.Entry3 fetchEntry3(long entryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.fetchEntry3(entryId);
	}

	/**
	* Returns the entry3 with the primary key.
	*
	* @param entryId the primary key of the entry3
	* @return the entry3
	* @throws PortalException if a entry3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Entry3 getEntry3(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.getEntry3(entryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<ua.org.gostroy.guestbook.model.Entry3> getEntry3s(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.getEntry3s(start, end);
	}

	/**
	* Returns the number of entry3s.
	*
	* @return the number of entry3s
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEntry3sCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.getEntry3sCount();
	}

	/**
	* Updates the entry3 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param entry3 the entry3
	* @return the entry3 that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Entry3 updateEntry3(
		ua.org.gostroy.guestbook.model.Entry3 entry3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3LocalService.updateEntry3(entry3);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _entry3LocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_entry3LocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _entry3LocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Entry3LocalService getWrappedEntry3LocalService() {
		return _entry3LocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEntry3LocalService(
		Entry3LocalService entry3LocalService) {
		_entry3LocalService = entry3LocalService;
	}

	@Override
	public Entry3LocalService getWrappedService() {
		return _entry3LocalService;
	}

	@Override
	public void setWrappedService(Entry3LocalService entry3LocalService) {
		_entry3LocalService = entry3LocalService;
	}

	private Entry3LocalService _entry3LocalService;
}