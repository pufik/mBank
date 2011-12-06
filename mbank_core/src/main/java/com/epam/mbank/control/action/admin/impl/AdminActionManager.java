package com.epam.mbank.control.action.admin.impl;

import java.util.List;

import com.epam.mbank.control.action.admin.AdminAccountAction;
import com.epam.mbank.control.action.admin.AdminActivityAction;
import com.epam.mbank.control.action.admin.AdminClientAction;
import com.epam.mbank.control.action.admin.AdminDepositAction;
import com.epam.mbank.control.action.admin.AdminSystemProperyAction;
import com.epam.mbank.data.dao.account.AccountDAO;
import com.epam.mbank.data.dao.activity.ActivityDAO;
import com.epam.mbank.data.dao.client.ClientDAO;
import com.epam.mbank.data.dao.deposit.DepositDAO;
import com.epam.mbank.data.dao.system.SystemPropertiesDAO;
import com.epam.mbank.enums.ClientStatus;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.enums.DepositType;
import com.epam.mbank.model.account.Account;
import com.epam.mbank.model.activity.Activity;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.model.deposit.Deposit;
import com.epam.mbank.model.system.Property;

public class AdminActionManager implements AdminClientAction, AdminAccountAction, AdminDepositAction, AdminActivityAction, AdminSystemProperyAction {

	private ClientDAO clientDao;
	private AccountDAO accountDao;
	private DepositDAO depositDao;
	private ActivityDAO activityDao;
	private SystemPropertiesDAO propertiesDao;

	public AdminActionManager() {
		clientDao = new ClientDAO();
		accountDao = new AccountDAO();
		depositDao = new DepositDAO();
		activityDao = new ActivityDAO();
		propertiesDao = new SystemPropertiesDAO();
	}

	// Client actions
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

	// Account actions
	@Override
	public Account getAccountById(Long id) {

		return accountDao.getById(id);
	}

	@Override
	public List<Account> getAllAccounts() {

		return accountDao.getAll();
	}

	@Override
	public void createAccount(Account account) {

		accountDao.save(account);

	}

	@Override
	public void removeAccount(Account accont) {

		accountDao.remove(accont);

	}

	// Deposit actions
	@Override
	public Deposit getDepositById(Long id) {

		return depositDao.getById(id);
	}

	@Override
	public List<Deposit> getDepositsByType(DepositType type) {

		return depositDao.getByType(type);
	}

	@Override
	public List<Deposit> getAllDeposit() {

		return depositDao.getAll();
	}

	@Override
	public void createDeposit(Deposit deposit) {

		depositDao.save(deposit);
	}

	@Override
	public void updateDeposit(Deposit deposit) {

		depositDao.update(deposit);

	}

	@Override
	public void closeDeposit(Deposit deposit) {

		// TODO HOW does the deposit close? Delete it or change some status?

	}

	// Activity actions
	@Override
	public List<Activity> getAllActivities() {

		return activityDao.getAll();
	}

	// System properties
	@Override
	public List<Property> viewAllProperties() {

		return propertiesDao.getAll();
	}

}
