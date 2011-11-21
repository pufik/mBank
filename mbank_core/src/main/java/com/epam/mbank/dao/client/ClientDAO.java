package com.epam.mbank.dao.client;

import com.epam.mbank.dao.BaseDAO;
import com.epam.mbank.model.client.Client;

public class ClientDAO extends BaseDAO<Client> {

	private final static String GET_ALL_QUERY = "SELECT c FROM Client c";

	public ClientDAO() {
		super(Client.class);
	}

	@Override
	public String getAllQuery() {
		return GET_ALL_QUERY;
	}

}
