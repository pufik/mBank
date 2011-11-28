package com.epam.mbank.data.dao.system;

import java.util.List;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.model.system.Property;

public class SystemPropertiesDAO extends BaseDAO<Property> {

	private static final String ALL_PROPERTIES_QUERY_NAME = "allProperties";

	public SystemPropertiesDAO() {
		super(Property.class);
	}

	@Override
	public List<Property> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
