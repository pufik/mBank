package com.epam.mbank.control.action.admin.impl;

import java.util.List;

import javax.inject.Inject;

import com.epam.mbank.control.action.admin.AdminSystemProperyAction;
import com.epam.mbank.data.dao.system.SystemPropertiesDAO;
import com.epam.mbank.model.system.Property;

/**
 * 
 * @author Iurii_Parfeniuk
 *
 */

public class AdminSystemPropertyActionImpl implements AdminSystemProperyAction{
	
	private SystemPropertiesDAO propertiesDao;
	
	@Inject
	public AdminSystemPropertyActionImpl(SystemPropertiesDAO propertiesDao) {
		super();
		this.propertiesDao = propertiesDao;
	}


	@Override
	public List<Property> viewAllProperties() {

		return propertiesDao.getAll();
	}
}
