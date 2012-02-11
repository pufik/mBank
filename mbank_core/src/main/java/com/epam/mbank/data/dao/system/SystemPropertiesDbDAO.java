package com.epam.mbank.data.dao.system;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.epam.mbank.data.dao.BaseDbDAO;
import com.epam.mbank.model.system.Property;

public class SystemPropertiesDbDAO extends BaseDbDAO<Property, String> implements SystemPropertiesDAO {

	private static final String ALL_PROPERTIES_QUERY_NAME = "Property.all";

	public SystemPropertiesDbDAO() {
		super(Property.class);
	}

	@Override
	public List<Property> getAll() {

		Map<String, Object> parameters = Collections.emptyMap();

		return executeQuery(ALL_PROPERTIES_QUERY_NAME, parameters);
	}

	@Override
	public List<Property> getPublic() {

		// TODO change getting for public properties
		Map<String, Object> parameters = Collections.emptyMap();

		return executeQuery(ALL_PROPERTIES_QUERY_NAME, parameters);
	}
}
