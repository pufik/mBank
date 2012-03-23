package com.epam.mbank.webservice.admin;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.mbank.control.action.admin.AdminClientAction;
import com.epam.mbank.enums.ClientStatus;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.utils.di.AdminModule;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

@WebService
public class AdminClientService {
	private Injector injector;
	private AdminClientAction adminClientAction;

	public AdminClientService() {
		injector = Guice.createInjector(new DAOModule(), new AdminModule());
		adminClientAction = injector.getInstance(AdminClientAction.class);
	}

	@WebMethod
	public Client getClientById(Long clientId) {
		Client client = adminClientAction.getClientById(clientId);

		return client;
	}

	@WebMethod
	public Client getClientByName(String name) {
		Client client = adminClientAction.getClientByName(name);

		return client;
	}

	@WebMethod
	public Client getClientByEmail(String email) {
		Client client = adminClientAction.getClientByEmail(email);

		return client;
	}

	@WebMethod
	public Client getClientByPhone(String phone) {
		Client client = adminClientAction.getClientByPhone(phone);

		return client;
	}

	@WebMethod
	public List<Client> getClientByStatus(ClientStatus status) {
		List<Client> clients = adminClientAction.getClientByStatus(status);

		return clients;
	}

	@WebMethod
	public List<Client> getClientByType(ClientType type) {
		List<Client> clients = adminClientAction.getClientByType(type);

		return clients;
	}

	@WebMethod
	public List<Client> getAllClients() {
		List<Client> clients = adminClientAction.getAllClients();

		return clients;
	}

	@WebMethod
	public void createClient(Client client) {
		adminClientAction.createClient(client);
	}

	@WebMethod
	public void removeClient(Client client) {
		adminClientAction.removeClient(client);
	}

	@WebMethod
	public void updateClient(Client client) {
		adminClientAction.updateClient(client);
	}

}
