package com.epam.mbank.webservice.client;

import com.epam.mbank.control.action.client.ClientAccountAction;
import com.epam.mbank.utils.di.ClientModule;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClientAccountService {
	private Injector injector;
	private ClientAccountAction clientAccountAction;

	public ClientAccountService() {
		injector = Guice.createInjector(new DAOModule(), new ClientModule());
		clientAccountAction = injector.getInstance(ClientAccountAction.class);
	}
	
	//TODO: Implement

}
