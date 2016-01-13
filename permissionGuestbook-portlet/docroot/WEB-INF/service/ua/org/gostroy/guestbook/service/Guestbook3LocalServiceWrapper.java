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
 * Provides a wrapper for {@link Guestbook3LocalService}.
 *
 * @author Sergey
 * @see Guestbook3LocalService
 * @generated
 */
public class Guestbook3LocalServiceWrapper implements Guestbook3LocalService,
	ServiceWrapper<Guestbook3LocalService> {
	public Guestbook3LocalServiceWrapper(
		Guestbook3LocalService guestbook3LocalService) {
		_guestbook3LocalService = guestbook3LocalService;
	}

	/**
	* Adds the guestbook3 to the database. Also notifies the appropriate model listeners.
	*
	* @param guestbook3 the guestbook3
	* @return the guestbook3 that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Guestbook3 addGuestbook3(
		ua.org.gostroy.guestbook.model.Guestbook3 guestbook3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _guestbook3LocalService.addGuestbook3(guestbook3);
	}

	/**
	* Creates a new guestbook3 with the primary key. Does not add the guestbook3 to the database.
	*
	* @param guestbookId the primary key for the new guestbook3
	* @return the new guestbook3
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Guestbook3 createGuestbook3(
		long guestbookId) {
		return _guestbook3LocalService.createGuestbook3(guestbookId);
	}

	/**
	* Deletes the guestbook3 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the guestbook3
	* @return the guestbook3 that was removed
	* @throws PortalException if a guestbook3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Guestbook3 deleteGuestbook3(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _guestbook3LocalService.deleteGuestbook3(guestbookId);
	}

	/**
	* Deletes the guestbook3 from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbook3 the guestbook3
	* @return the guestbook3 that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Guestbook3 deleteGuestbook3(
		ua.org.gostroy.guestbook.model.Guestbook3 guestbook3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _guestbook3LocalService.deleteGuestbook3(guestbook3);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _guestbook3LocalService.dynamicQuery();
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
		return _guestbook3LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Guestbook3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _guestbook3LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ua.org.gostroy.guestbook.model.impl.Guestbook3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _guestbook3LocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _guestbook3LocalService.dynamicQueryCount(dynamicQuery);
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
		return _guestbook3LocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ua.org.gostroy.guestbook.model.Guestbook3 fetchGuestbook3(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _guestbook3LocalService.fetchGuestbook3(guestbookId);
	}

	/**
	* Returns the guestbook3 with the primary key.
	*
	* @param guestbookId the primary key of the guestbook3
	* @return the guestbook3
	* @throws PortalException if a guestbook3 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Guestbook3 getGuestbook3(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _guestbook3LocalService.getGuestbook3(guestbookId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _guestbook3LocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<ua.org.gostroy.guestbook.model.Guestbook3> getGuestbook3s(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _guestbook3LocalService.getGuestbook3s(start, end);
	}

	/**
	* Returns the number of guestbook3s.
	*
	* @return the number of guestbook3s
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getGuestbook3sCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _guestbook3LocalService.getGuestbook3sCount();
	}

	/**
	* Updates the guestbook3 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param guestbook3 the guestbook3
	* @return the guestbook3 that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ua.org.gostroy.guestbook.model.Guestbook3 updateGuestbook3(
		ua.org.gostroy.guestbook.model.Guestbook3 guestbook3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _guestbook3LocalService.updateGuestbook3(guestbook3);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _guestbook3LocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_guestbook3LocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _guestbook3LocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Guestbook3LocalService getWrappedGuestbook3LocalService() {
		return _guestbook3LocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedGuestbook3LocalService(
		Guestbook3LocalService guestbook3LocalService) {
		_guestbook3LocalService = guestbook3LocalService;
	}

	@Override
	public Guestbook3LocalService getWrappedService() {
		return _guestbook3LocalService;
	}

	@Override
	public void setWrappedService(Guestbook3LocalService guestbook3LocalService) {
		_guestbook3LocalService = guestbook3LocalService;
	}

	private Guestbook3LocalService _guestbook3LocalService;
}