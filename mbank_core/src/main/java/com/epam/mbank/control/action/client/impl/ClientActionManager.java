package com.epam.mbank.control.action.client.impl;

import java.util.List;

import com.epam.mbank.control.action.client.ClientAccountAction;
import com.epam.mbank.control.action.client.ClientActivityAction;
import com.epam.mbank.control.action.client.ClientClientAction;
import com.epam.mbank.control.action.client.ClientDepositAction;
import com.epam.mbank.control.action.client.ClientSystemPropertyAction;
import com.epam.mbank.data.dao.client.ClientDAO;
import com.epam.mbank.data.dao.deposit.DepositDAO;
import com.epam.mbank.data.dao.system.SystemPropertiesDAO;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.model.deposit.Deposit;
import com.epam.mbank.model.system.Property;

public class ClientActionManager implements ClientClientAction, ClientAccountAction, ClientDepositAction, ClientActivityAction, ClientSystemPropertyAction {

	private ClientDAO clientDao;
	private DepositDAO depositDao;
	private SystemPropertiesDAO propertiesDao;

	public ClientActionManager() {
		clientDao = new ClientDAO();
		depositDao = new DepositDAO();
		propertiesDao = new SystemPropertiesDAO();
	}

	// Client
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

	// Deposit
	@Override
	public void createDeposit(Deposit deposit) {

		depositDao.save(deposit);
	}

	@Override
	public void updateDeposit(Deposit deposit) {

		depositDao.update(deposit);
	}

	// System properties
	@Override
	public List<Property> viewPublicProperties() {

		return propertiesDao.getPublic();
	}

}
