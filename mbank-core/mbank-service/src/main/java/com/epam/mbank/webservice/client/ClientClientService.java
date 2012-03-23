package com.epam.mbank.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.mbank.control.action.client.ClientClientAction;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.utils.di.ClientModule;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

@WebService
public class ClientClientService {
	private Injector injector;

	private ClientClientAction clientAction;

	public ClientClientService() {
		injector = Guice.createInjector(new DAOModule(), new ClientModule());
		clientAction = injector.getInstance(ClientClientAction.class);
	}

	@WebMethod
	public Client getClientById(Long clientId) {
		Client client = clientAction.getClientById(clientId);

		return client;
	}

	@WebMethod
	public Client getClientByEmail(String email) {
		Client client = clientAction.getClientByEmail(email);

		return client;
	}

	@WebMethod
	public void updateClient(Client client) {
		clientAction.updateClient(client);
	}
}
