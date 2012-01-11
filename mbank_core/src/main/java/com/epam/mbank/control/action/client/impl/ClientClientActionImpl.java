package com.epam.mbank.control.action.client.impl;

import javax.inject.Inject;

import com.epam.mbank.control.action.client.ClientClientAction;
import com.epam.mbank.data.dao.client.ClientDAO;
import com.epam.mbank.model.client.Client;

public class ClientClientActionImpl implements ClientClientAction {
	
	private ClientDAO clientDao;
	
	@Inject
	public ClientClientActionImpl(ClientDAO clientDao) {
		super();
		this.clientDao = clientDao;
	}

	@Override
	public Client getClientById(Long id) {

		return clientDao.getById(id);
	}

	@Override
	public Client getClientByEmail(String email) {

		return clientDao.getByEmail(email);
	}

	@Override
	public void updateClient(Client client) {

		clientDao.update(client);
	}

}
