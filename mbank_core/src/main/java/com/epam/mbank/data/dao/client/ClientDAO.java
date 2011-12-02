package com.epam.mbank.data.dao.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.data.dao.DefaultDAO;
import com.epam.mbank.model.client.Client;

public class ClientDAO extends BaseDAO<Client> implements DefaultDAO<Client> {

	private static final String ALL_CLIENTS_QUERY_NAME = "Client.all";
	private static final String CLIENT_BY_NAME_QUERY_NAME = "Client.getByName";
	private static final String CLIENT_BY_EMAIL_QUERY_NAME = "Client.getByEmail";

	public ClientDAO() {
		super(Client.class);
	}

	@Override
	public List<Client> getAll() {
		Map<String, Object> parameters = new HashMap<String, Object>();

		return executeQuery(ALL_CLIENTS_QUERY_NAME, parameters);
	}

	public Client getClientByName(String name) {

		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", name);

		return executeQuerySingleResult(CLIENT_BY_NAME_QUERY_NAME, parameters);
	}

	public Client getClientByEmail(String email) {

		Map<String, Object> parameters = new HashMap<String, Object>();

		parameters.put("email", email);

		return executeQuerySingleResult(CLIENT_BY_EMAIL_QUERY_NAME, parameters);

	}

}
