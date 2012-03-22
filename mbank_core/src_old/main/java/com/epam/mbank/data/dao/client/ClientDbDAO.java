package com.epam.mbank.data.dao.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.epam.mbank.data.dao.BaseDbDAO;
import com.epam.mbank.enums.ClientStatus;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.model.client.Client;

public class ClientDbDAO extends BaseDbDAO<Client, Long> implements ClientDAO {

	private static final String ALL_CLIENTS_QUERY_NAME = "Client.all";
	private static final String CLIENT_BY_NAME_QUERY_NAME = "Client.getByName";
	private static final String CLIENT_BY_EMAIL_QUERY_NAME = "Client.getByEmail";
	private static final String CLIENT_BY_PHONE_QUERY_NAME = "Client.getByPhone";
	private static final String CLIENT_BY_STATUS_QUERY_NAME = "Client.getByStatus";
	private static final String CLIENT_BY_TYPE_QUERY_NAME = "Client.getByType";

	public ClientDbDAO() {
		super(Client.class);
	}

	@Override
	public List<Client> getAll() {
		Map<String, Object> parameters = Collections.emptyMap();

		return executeQuery(ALL_CLIENTS_QUERY_NAME, parameters);
	}
	
	@Override
	public Client getByName(String name) {

		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", name);

		return executeQuerySingleResult(CLIENT_BY_NAME_QUERY_NAME, parameters);
	}

	@Override
	public Client getByEmail(String email) {

		Map<String, Object> parameters = new HashMap<String, Object>();

		parameters.put("email", email);

		return executeQuerySingleResult(CLIENT_BY_EMAIL_QUERY_NAME, parameters);

	}

	@Override
	public Client getByPhone(String phone) {

		Map<String, Object> parameters = new HashMap<String, Object>();

		parameters.put("phone", phone);

		return executeQuerySingleResult(CLIENT_BY_PHONE_QUERY_NAME, parameters);

	}

	@Override
	public List<Client> getByStatus(ClientStatus status) {

		Map<String, Object> parameters = new HashMap<String, Object>();

		parameters.put("status", status);

		return executeQuery(CLIENT_BY_STATUS_QUERY_NAME, parameters);
	}

	@Override
	public List<Client> getByType(ClientType type) {

		Map<String, Object> parameters = new HashMap<String, Object>();

		parameters.put("type", type);

		return executeQuery(CLIENT_BY_TYPE_QUERY_NAME, parameters);
	}
}
