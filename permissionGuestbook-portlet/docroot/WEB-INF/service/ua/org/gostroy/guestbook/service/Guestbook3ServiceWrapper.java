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
 * Provides a wrapper for {@link Guestbook3Service}.
 *
 * @author Sergey
 * @see Guestbook3Service
 * @generated
 */
public class Guestbook3ServiceWrapper implements Guestbook3Service,
	ServiceWrapper<Guestbook3Service> {
	public Guestbook3ServiceWrapper(Guestbook3Service guestbook3Service) {
		_guestbook3Service = guestbook3Service;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _guestbook3Service.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_guestbook3Service.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _guestbook3Service.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Guestbook3Service getWrappedGuestbook3Service() {
		return _guestbook3Service;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedGuestbook3Service(Guestbook3Service guestbook3Service) {
		_guestbook3Service = guestbook3Service;
	}

	@Override
	public Guestbook3Service getWrappedService() {
		return _guestbook3Service;
	}

	@Override
	public void setWrappedService(Guestbook3Service guestbook3Service) {
		_guestbook3Service = guestbook3Service;
	}

	private Guestbook3Service _guestbook3Service;
}