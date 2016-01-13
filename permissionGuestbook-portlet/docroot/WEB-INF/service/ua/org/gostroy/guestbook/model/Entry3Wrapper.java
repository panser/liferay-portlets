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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Entry3}.
 * </p>
 *
 * @author Sergey
 * @see Entry3
 * @generated
 */
public class Entry3Wrapper implements Entry3, ModelWrapper<Entry3> {
	public Entry3Wrapper(Entry3 entry3) {
		_entry3 = entry3;
	}

	@Override
	public Class<?> getModelClass() {
		return Entry3.class;
	}

	@Override
	public String getModelClassName() {
		return Entry3.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("entryId", getEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("message", getMessage());
		attributes.put("guestbookId", getGuestbookId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		Long guestbookId = (Long)attributes.get("guestbookId");

		if (guestbookId != null) {
			setGuestbookId(guestbookId);
		}
	}

	/**
	* Returns the primary key of this entry3.
	*
	* @return the primary key of this entry3
	*/
	@Override
	public long getPrimaryKey() {
		return _entry3.getPrimaryKey();
	}

	/**
	* Sets the primary key of this entry3.
	*
	* @param primaryKey the primary key of this entry3
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_entry3.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the entry ID of this entry3.
	*
	* @return the entry ID of this entry3
	*/
	@Override
	public long getEntryId() {
		return _entry3.getEntryId();
	}

	/**
	* Sets the entry ID of this entry3.
	*
	* @param entryId the entry ID of this entry3
	*/
	@Override
	public void setEntryId(long entryId) {
		_entry3.setEntryId(entryId);
	}

	/**
	* Returns the group ID of this entry3.
	*
	* @return the group ID of this entry3
	*/
	@Override
	public long getGroupId() {
		return _entry3.getGroupId();
	}

	/**
	* Sets the group ID of this entry3.
	*
	* @param groupId the group ID of this entry3
	*/
	@Override
	public void setGroupId(long groupId) {
		_entry3.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this entry3.
	*
	* @return the company ID of this entry3
	*/
	@Override
	public long getCompanyId() {
		return _entry3.getCompanyId();
	}

	/**
	* Sets the company ID of this entry3.
	*
	* @param companyId the company ID of this entry3
	*/
	@Override
	public void setCompanyId(long companyId) {
		_entry3.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this entry3.
	*
	* @return the user ID of this entry3
	*/
	@Override
	public long getUserId() {
		return _entry3.getUserId();
	}

	/**
	* Sets the user ID of this entry3.
	*
	* @param userId the user ID of this entry3
	*/
	@Override
	public void setUserId(long userId) {
		_entry3.setUserId(userId);
	}

	/**
	* Returns the user uuid of this entry3.
	*
	* @return the user uuid of this entry3
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entry3.getUserUuid();
	}

	/**
	* Sets the user uuid of this entry3.
	*
	* @param userUuid the user uuid of this entry3
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_entry3.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this entry3.
	*
	* @return the user name of this entry3
	*/
	@Override
	public java.lang.String getUserName() {
		return _entry3.getUserName();
	}

	/**
	* Sets the user name of this entry3.
	*
	* @param userName the user name of this entry3
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_entry3.setUserName(userName);
	}

	/**
	* Returns the create date of this entry3.
	*
	* @return the create date of this entry3
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _entry3.getCreateDate();
	}

	/**
	* Sets the create date of this entry3.
	*
	* @param createDate the create date of this entry3
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_entry3.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this entry3.
	*
	* @return the modified date of this entry3
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _entry3.getModifiedDate();
	}

	/**
	* Sets the modified date of this entry3.
	*
	* @param modifiedDate the modified date of this entry3
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_entry3.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this entry3.
	*
	* @return the name of this entry3
	*/
	@Override
	public java.lang.String getName() {
		return _entry3.getName();
	}

	/**
	* Sets the name of this entry3.
	*
	* @param name the name of this entry3
	*/
	@Override
	public void setName(java.lang.String name) {
		_entry3.setName(name);
	}

	/**
	* Returns the email of this entry3.
	*
	* @return the email of this entry3
	*/
	@Override
	public java.lang.String getEmail() {
		return _entry3.getEmail();
	}

	/**
	* Sets the email of this entry3.
	*
	* @param email the email of this entry3
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_entry3.setEmail(email);
	}

	/**
	* Returns the message of this entry3.
	*
	* @return the message of this entry3
	*/
	@Override
	public java.lang.String getMessage() {
		return _entry3.getMessage();
	}

	/**
	* Sets the message of this entry3.
	*
	* @param message the message of this entry3
	*/
	@Override
	public void setMessage(java.lang.String message) {
		_entry3.setMessage(message);
	}

	/**
	* Returns the guestbook ID of this entry3.
	*
	* @return the guestbook ID of this entry3
	*/
	@Override
	public long getGuestbookId() {
		return _entry3.getGuestbookId();
	}

	/**
	* Sets the guestbook ID of this entry3.
	*
	* @param guestbookId the guestbook ID of this entry3
	*/
	@Override
	public void setGuestbookId(long guestbookId) {
		_entry3.setGuestbookId(guestbookId);
	}

	@Override
	public boolean isNew() {
		return _entry3.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_entry3.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _entry3.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_entry3.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _entry3.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _entry3.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_entry3.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _entry3.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_entry3.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_entry3.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_entry3.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Entry3Wrapper((Entry3)_entry3.clone());
	}

	@Override
	public int compareTo(ua.org.gostroy.guestbook.model.Entry3 entry3) {
		return _entry3.compareTo(entry3);
	}

	@Override
	public int hashCode() {
		return _entry3.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ua.org.gostroy.guestbook.model.Entry3> toCacheModel() {
		return _entry3.toCacheModel();
	}

	@Override
	public ua.org.gostroy.guestbook.model.Entry3 toEscapedModel() {
		return new Entry3Wrapper(_entry3.toEscapedModel());
	}

	@Override
	public ua.org.gostroy.guestbook.model.Entry3 toUnescapedModel() {
		return new Entry3Wrapper(_entry3.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _entry3.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _entry3.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_entry3.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Entry3Wrapper)) {
			return false;
		}

		Entry3Wrapper entry3Wrapper = (Entry3Wrapper)obj;

		if (Validator.equals(_entry3, entry3Wrapper._entry3)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Entry3 getWrappedEntry3() {
		return _entry3;
	}

	@Override
	public Entry3 getWrappedModel() {
		return _entry3;
	}

	@Override
	public void resetOriginalValues() {
		_entry3.resetOriginalValues();
	}

	private Entry3 _entry3;
}