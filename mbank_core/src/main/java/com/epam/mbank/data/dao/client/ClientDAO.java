package com.epam.mbank.data.dao.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.model.client.Client;

public class ClientDAO extends BaseDAO<Client> {

	private static final String ALL_CLIENTS_QUERY_NAME = "Client.all";
	private static final String CLIENT_BY_NAME_QUERY_NAME = "Client.getByName";
	private static final String CLIENT_BY_EMAIL_QUERY_NAME = "Client.getByEmail";

	public ClientDAO() {
		super(Client.class);
	}

	@Override
	public List<Client> getAll() {
		List<Client> clients = null;

		Map<String, String> parameters = new HashMap<String, String>();

		clients = executeQuery(ALL_CLIENTS_QUERY_NAME, parameters);

		return clients;
	}

	public Client getClientByName(String name) {
		List<Client> clients = null;

		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("name", name);

		clients = executeQuery(CLIENT_BY_NAME_QUERY_NAME, parameters);

		return clients.get(0);
	}

	public Client getClientByEmail(String email) {
		List<Client> clients = null;

		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("email", email);

		clients = executeQuery(CLIENT_BY_EMAIL_QUERY_NAME, parameters);

		return clients.get(0);
	}

}
