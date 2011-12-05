package com.epam.mbank.control.action.admin;

import java.util.List;

import com.epam.mbank.data.dao.account.AccountDAO;
import com.epam.mbank.data.dao.activity.ActivityDAO;
import com.epam.mbank.data.dao.client.ClientDAO;
import com.epam.mbank.data.dao.deposit.DepositDAO;
import com.epam.mbank.data.dao.system.SystemPropertiesDAO;
import com.epam.mbank.data.provider.DataProvider;
import com.epam.mbank.data.provider.Provider;
import com.epam.mbank.enums.ClientStatus;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.enums.DepositType;
import com.epam.mbank.model.account.Account;
import com.epam.mbank.model.activity.Activity;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.model.deposit.Deposit;
import com.epam.mbank.model.system.Property;

public class AdminActionManager implements AdminAction {

	private Provider dataProvider = null;
	private ClientDAO clientDao = null;
	private AccountDAO accountDao = null;
	private DepositDAO depositDao = null;
	private ActivityDAO activityDao = null;
	private SystemPropertiesDAO propertiesDao = null;

	public AdminActionManager() {
		clientDao = new ClientDAO();
		accountDao = new AccountDAO();
		depositDao = new DepositDAO();
		activityDao = new ActivityDAO();
		propertiesDao = new SystemPropertiesDAO();
	}

	// Client actions
	public Client getClientById(Long id) {

		return clientDao.getById(id);
	}

	public Client getClientByName(String name) {

		return clientDao.getClientByName(name);
	}

	public Client getClientByEmail(String email) {

		return clientDao.getClientByEmail(email);
	}

	public Client getClientByPhone(String phone) {

		return clientDao.getClientByPhone(phone);
	}

	public List<Client> getClientByStatus(ClientStatus status) {

		return clientDao.getClientByStatus(status);
	}

	public List<Client> getClientByType(ClientType type) {

		return clientDao.getClientByType(type);
	}

	public List<Client> getAllClients() {

		return clientDao.getAll();
	}

	public void createClient(Client client) {

		clientDao.save(client);
	}

	public void removeClient(Client client) {

		clientDao.remove(client);
	}

	public void updateClient(Client client) {

		clientDao.update(client);
	}

	// Account actions
	public Account getAccountById(Long id) {

		return accountDao.getById(id);
	}

	public List<Account> getAllAccounts() {

		return accountDao.getAll();
	}

	public void createAccount(Account account) {

		accountDao.save(account);

	}

	public void removeAccount(Account accont) {

		accountDao.remove(accont);

	}

	// TODO change data accessors
	// Deposit actions
	public Deposit getDepositById(Long id) {

		return dataProvider.getDepositById(id);
	}

	public List<Deposit> getDepositsByClient(Client client) {

		return dataProvider.getDepositsByClient(client);
	}

	public List<Deposit> getDepositsByType(DepositType type) {

		return dataProvider.getDepositsByType(type);
	}

	public List<Deposit> getAllDeposit() {

		return dataProvider.getAllDeposit();
	}

	public void createDeposit(Deposit deposit) {

		dataProvider.createDeposit(deposit);
	}

	public void updateDeposit(Deposit deposit) {

		dataProvider.updateDeposit(deposit);

	}

	public void closeDeposit(Deposit deposit) {

		dataProvider.closeDeposit(deposit);

	}

	// Activity actions
	public List<Activity> getAllClientActivities(Client client) {

		return dataProvider.getAllClientActivities(client);
	}

	public List<Activity> getAllActivities() {

		return dataProvider.getAllActivities();
	}

	// System properties
	public List<Property> viewAllProperties() {

		return dataProvider.viewAllProperties();
	}

}
