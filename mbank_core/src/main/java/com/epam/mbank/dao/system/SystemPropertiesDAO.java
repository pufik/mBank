package com.epam.mbank.dao.system;

import com.epam.mbank.dao.BaseDAO;
import com.epam.mbank.model.system.Property;

public class SystemPropertiesDAO extends BaseDAO<Property> {

	private final static String GET_ALL_QUERY = "SELECT p FROM Property p";

	public SystemPropertiesDAO() {
		super(Property.class);
	}

	@Override
	public String getAllQuery() {
		return GET_ALL_QUERY;
	}

}
