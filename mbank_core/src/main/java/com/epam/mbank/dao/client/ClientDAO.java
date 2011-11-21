package com.epam.mbank.dao.client;

import com.epam.mbank.dao.BaseDAO;
import com.epam.mbank.model.client.Client;

public class ClientDAO extends BaseDAO<Client> {

	private static final String ALL_CLIENTS_QUERY_NAME = "allClients";

	public ClientDAO() {
		super(Client.class, ALL_CLIENTS_QUERY_NAME);
	}

}
