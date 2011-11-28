package com.epam.mbank.control.action.admin;

import java.util.List;

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

public class AdminActionManager {

	private Provider dataProvider = null;

	public AdminActionManager() {
		dataProvider = new DataProvider();

	}

	public Client getClientById(Long id) {

		return dataProvider.getClientById(id);
	}

	public Client getClientByName(String name) {

		return dataProvider.getClientByName(name);
	}

	public Client getClientByEmail(String email) {

		return dataProvider.getClientByEmail(email);
	}

	public Client getClientByPhone(String phone) {

		return dataProvider.getClientByPhone(phone);
	}

	public Client getClientByStatus(ClientStatus status) {

		return dataProvider.getClientByStatus(status);
	}

	public Client getClientByType(ClientType type) {

		return dataProvider.getClientByType(type);
	}

	public List<Client> getAllClients() {

		return dataProvider.getAllClients();
	}

	public void createClient(Client client) {

		dataProvider.createClient(client);
	}

	public void removeClient(Client client) {

		dataProvider.removeClient(client);
	}

	public void updateClient(Client client) {

		dataProvider.updateClient(client);
	}

	public Account getAccountById(Long id) {

		return dataProvider.getAccountById(id);
	}

	public Account getAccountByClient(Client client) {

		return dataProvider.getAccountByClient(client);
	}

	public List<Account> getAllAccounts() {

		return dataProvider.getAllAccounts();
	}

	public void createAccount(Account account) {

		dataProvider.createAccount(account);

	}

	public void removeAccount(Account accont) {

		dataProvider.removeAccount(accont);

	}

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

	public List<Activity> getAllClientActivities(Client client) {

		return dataProvider.getAllClientActivities(client);
	}

	public List<Activity> getAllActivities() {

		return dataProvider.getAllActivities();
	}

	public List<Property> viewAllProperties() {

		return dataProvider.viewAllProperties();
	}

}
