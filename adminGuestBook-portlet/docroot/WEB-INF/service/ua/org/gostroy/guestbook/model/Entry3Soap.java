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

package ua.org.gostroy.guestbook.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ua.org.gostroy.guestbook.service.http.Entry3ServiceSoap}.
 *
 * @author Sergey
 * @see ua.org.gostroy.guestbook.service.http.Entry3ServiceSoap
 * @generated
 */
public class Entry3Soap implements Serializable {
	public static Entry3Soap toSoapModel(Entry3 model) {
		Entry3Soap soapModel = new Entry3Soap();

		soapModel.setEntryId(model.getEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setEmail(model.getEmail());
		soapModel.setMessage(model.getMessage());
		soapModel.setGuestbookId(model.getGuestbookId());

		return soapModel;
	}

	public static Entry3Soap[] toSoapModels(Entry3[] models) {
		Entry3Soap[] soapModels = new Entry3Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Entry3Soap[][] toSoapModels(Entry3[][] models) {
		Entry3Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Entry3Soap[models.length][models[0].length];
		}
		else {
			soapModels = new Entry3Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Entry3Soap[] toSoapModels(List<Entry3> models) {
		List<Entry3Soap> soapModels = new ArrayList<Entry3Soap>(models.size());

		for (Entry3 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Entry3Soap[soapModels.size()]);
	}

	public Entry3Soap() {
	}

	public long getPrimaryKey() {
		return _entryId;
	}

	public void setPrimaryKey(long pk) {
		setEntryId(pk);
	}

	public long getEntryId() {
		return _entryId;
	}

	public void setEntryId(long entryId) {
		_entryId = entryId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getMessage() {
		return _message;
	}

	public void setMessage(String message) {
		_message = message;
	}

	public long getGuestbookId() {
		return _guestbookId;
	}

	public void setGuestbookId(long guestbookId) {
		_guestbookId = guestbookId;
	}

	private long _entryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _email;
	private String _message;
	private long _guestbookId;
}