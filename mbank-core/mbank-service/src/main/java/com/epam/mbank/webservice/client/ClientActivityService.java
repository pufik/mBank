package com.epam.mbank.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.mbank.control.action.client.ClientActivityAction;
import com.epam.mbank.model.activity.Activity;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.utils.di.ClientModule;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

@WebService
public class ClientActivityService {
	private Injector injector;
	private ClientActivityAction clientActivityAction;

	public ClientActivityService() {
		injector = Guice.createInjector(new DAOModule(), new ClientModule());
		clientActivityAction = injector.getInstance(ClientActivityAction.class);
	}

	@WebMethod
	public Activity getByClient(Client client) {
		Activity activity = clientActivityAction.getByClient(client);

		return activity;
	}

}
