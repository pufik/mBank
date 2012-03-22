package com.epam.mbank.control.action.admin.impl;

import java.util.List;

import javax.inject.Inject;

import com.epam.mbank.control.action.admin.AdminClientAction;
import com.epam.mbank.data.dao.client.ClientDAO;
import com.epam.mbank.enums.ClientStatus;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.model.client.Client;

/**
 * @author Iurii_Parfeniuk
 * 
 */

public class AdminClientActionImpl implements AdminClientAction {

	private final ClientDAO clientDao;

	@Inject
	public AdminClientActionImpl(ClientDAO clientDao) {
		super();
		this.clientDao = clientDao;
	}

	@Override
	public Client getClientById(Long id) {

		return clientDao.getById(id);
	}

	@Override
	public Client getClientByName(String name) {

		return clientDao.getByName(name);
	}

	@Override
	public Client getClientByEmail(String email) {

		return clientDao.getByEmail(email);
	}

	@Override
	public Client getClientByPhone(String phone) {

		return clientDao.getByPhone(phone);
	}

	@Override
	public List<Client> getClientByStatus(ClientStatus status) {

		return clientDao.getByStatus(status);
	}

	@Override
	public List<Client> getClientByType(ClientType type) {

		return clientDao.getByType(type);
	}

	@Override
	public List<Client> getAllClients() {

		return clientDao.getAll();
	}

	@Override
	public void createClient(Client client) {

		clientDao.save(client);
	}

	@Override
	public void removeClient(Client client) {

		clientDao.remove(client);
	}

	@Override
	public void updateClient(Client client) {

		clientDao.update(client);
	}

}
