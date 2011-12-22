package com.epam.mbank.control.action.admin.impl;

import java.util.List;

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
	
	
	public AdminSystemPropertyActionImpl() {
		super();
		this.propertiesDao = new SystemPropertiesDAO();
	}


	@Override
	public List<Property> viewAllProperties() {

		return propertiesDao.getAll();
	}
}
