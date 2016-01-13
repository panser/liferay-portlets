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

package ua.org.gostroy.guestbook.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import ua.org.gostroy.guestbook.model.Guestbook;
import ua.org.gostroy.guestbook.model.GuestbookModel;
import ua.org.gostroy.guestbook.model.GuestbookSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Guestbook service. Represents a row in the &quot;GB_Guestbook&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ua.org.gostroy.guestbook.model.GuestbookModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GuestbookImpl}.
 * </p>
 *
 * @author Sergey
 * @see GuestbookImpl
 * @see ua.org.gostroy.guestbook.model.Guestbook
 * @see ua.org.gostroy.guestbook.model.GuestbookModel
 * @generated
 */
@JSON(strict = true)
public class GuestbookModelImpl extends BaseModelImpl<Guestbook>
	implements GuestbookModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a guestbook model instance should use the {@link ua.org.gostroy.guestbook.model.Guestbook} interface instead.
	 */
	public static final String TABLE_NAME = "GB_Guestbook";
	public static final Object[][] TABLE_COLUMNS = {
			{ "guestbookId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table GB_Guestbook (guestbookId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table GB_Guestbook";
	public static final String ORDER_BY_JPQL = " ORDER BY guestbook.guestbookId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY GB_Guestbook.guestbookId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.ua.org.gostroy.guestbook.model.Guestbook"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.ua.org.gostroy.guestbook.model.Guestbook"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.ua.org.gostroy.guestbook.model.Guestbook"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long GUESTBOOKID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Guestbook toModel(GuestbookSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Guestbook model = new GuestbookImpl();

		model.setGuestbookId(soapModel.getGuestbookId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Guestbook> toModels(GuestbookSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Guestbook> models = new ArrayList<Guestbook>(soapModels.length);

		for (GuestbookSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.ua.org.gostroy.guestbook.model.Guestbook"));

	public GuestbookModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _guestbookId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setGuestbookId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _guestbookId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Guestbook.class;
	}

	@Override
	public String getModelClassName() {
		return Guestbook.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("guestbookId", getGuestbookId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long guestbookId = (Long)attributes.get("guestbookId");

		if (guestbookId != null) {
			setGuestbookId(guestbookId);
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
	}

	@JSON
	@Override
	public long getGuestbookId() {
		return _guestbookId;
	}

	@Override
	public void setGuestbookId(long guestbookId) {
		_guestbookId = guestbookId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Guestbook.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Guestbook toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Guestbook)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		GuestbookImpl guestbookImpl = new GuestbookImpl();

		guestbookImpl.setGuestbookId(getGuestbookId());
		guestbookImpl.setGroupId(getGroupId());
		guestbookImpl.setCompanyId(getCompanyId());
		guestbookImpl.setUserId(getUserId());
		guestbookImpl.setUserName(getUserName());
		guestbookImpl.setCreateDate(getCreateDate());
		guestbookImpl.setModifiedDate(getModifiedDate());
		guestbookImpl.setName(getName());

		guestbookImpl.resetOriginalValues();

		return guestbookImpl;
	}

	@Override
	public int compareTo(Guestbook guestbook) {
		long primaryKey = guestbook.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Guestbook)) {
			return false;
		}

		Guestbook guestbook = (Guestbook)obj;

		long primaryKey = guestbook.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		GuestbookModelImpl guestbookModelImpl = this;

		guestbookModelImpl._originalGroupId = guestbookModelImpl._groupId;

		guestbookModelImpl._setOriginalGroupId = false;

		guestbookModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Guestbook> toCacheModel() {
		GuestbookCacheModel guestbookCacheModel = new GuestbookCacheModel();

		guestbookCacheModel.guestbookId = getGuestbookId();

		guestbookCacheModel.groupId = getGroupId();

		guestbookCacheModel.companyId = getCompanyId();

		guestbookCacheModel.userId = getUserId();

		guestbookCacheModel.userName = getUserName();

		String userName = guestbookCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			guestbookCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			guestbookCacheModel.createDate = createDate.getTime();
		}
		else {
			guestbookCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			guestbookCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			guestbookCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		guestbookCacheModel.name = getName();

		String name = guestbookCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			guestbookCacheModel.name = null;
		}

		return guestbookCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{guestbookId=");
		sb.append(getGuestbookId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("ua.org.gostroy.guestbook.model.Guestbook");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>guestbookId</column-name><column-value><![CDATA[");
		sb.append(getGuestbookId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Guestbook.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Guestbook.class
		};
	private long _guestbookId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private long _columnBitmask;
	private Guestbook _escapedModel;
}