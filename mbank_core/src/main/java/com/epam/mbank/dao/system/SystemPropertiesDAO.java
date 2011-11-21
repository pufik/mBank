package com.epam.mbank.dao.system;

import com.epam.mbank.dao.BaseDAO;
import com.epam.mbank.model.system.Property;

public class SystemPropertiesDAO extends BaseDAO<Property> {

	private static final String ALL_PROPERTIES_QUERY_NAME = "allProperties";

	public SystemPropertiesDAO() {
		super(Property.class, ALL_PROPERTIES_QUERY_NAME);
	}
}
