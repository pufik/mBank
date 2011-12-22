package com.epam.mbank.control.action.client.impl;

import java.util.List;

import com.epam.mbank.control.action.client.ClientSystemPropertyAction;
import com.epam.mbank.data.dao.system.SystemPropertiesDAO;
import com.epam.mbank.model.system.Property;

public class ClientSystemPropertyActionImpl implements ClientSystemPropertyAction {

	private SystemPropertiesDAO propertiesDao;

	public ClientSystemPropertyActionImpl() {
		super();
		this.propertiesDao = new SystemPropertiesDAO();
	}

	@Override
	public List<Property> viewPublicProperties() {

		return propertiesDao.getPublic();
	}

}
