package com.epam.mbank.webservice.client;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.mbank.control.action.client.ClientSystemPropertyAction;
import com.epam.mbank.model.system.Property;
import com.epam.mbank.utils.di.ClientModule;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

@WebService
public class ClientSystemService {
	private Injector injector;
	private ClientSystemPropertyAction clientSystemAction;

	public ClientSystemService() {
		injector = Guice.createInjector(new DAOModule(), new ClientModule());
		clientSystemAction = injector.getInstance(ClientSystemPropertyAction.class);
	}

	@WebMethod
	public List<Property> viewProperties() {
		List<Property> properties = clientSystemAction.viewPublicProperties();

		return properties;
	}
}
