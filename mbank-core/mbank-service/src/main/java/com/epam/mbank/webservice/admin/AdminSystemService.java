package com.epam.mbank.webservice.admin;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.mbank.control.action.admin.AdminSystemProperyAction;
import com.epam.mbank.model.system.Property;
import com.epam.mbank.utils.di.AdminModule;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

@WebService
public class AdminSystemService {
	private Injector injector;
	private AdminSystemProperyAction adminSystemAction;

	public AdminSystemService() {
		injector = Guice.createInjector(new DAOModule(), new AdminModule());
		adminSystemAction = injector.getInstance(AdminSystemProperyAction.class);
	}

	@WebMethod
	public List<Property> viewAllProperties() {
		List<Property> properties = adminSystemAction.viewAllProperties();

		return properties;
	}
}
