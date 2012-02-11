package com.epam.mbank.data.dao.system;

import java.util.List;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.model.system.Property;

public interface SystemPropertiesDAO extends BaseDAO<Property, String> {
	List<Property> getPublic();
}
