package com.epam.mbank.control.action.client;

import java.util.List;

import com.epam.mbank.data.provider.DataProvider;
import com.epam.mbank.data.provider.Provider;
import com.epam.mbank.model.account.Account;
import com.epam.mbank.model.activity.Activity;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.model.deposit.Deposit;
import com.epam.mbank.model.system.Property;

public class ClientActionManager {

	private Provider dataProvider = null;

	public ClientActionManager() {
		this.dataProvider = new DataProvider();
	}

	public Client getClientById(Long id) {

		return dataProvider.getClientById(id);
	}

	public Client getClientByEmail(String email) {

		return dataProvider.getClientByEmail(email);
	}

	public void updateClient(Client client) {

		dataProvider.updateClient(client);
	}

	public Account getAccountByClient(Client client) {

		return dataProvider.getAccountByClient(client);
	}

	public List<Deposit> getDepositsByClient(Client client) {

		return getDepositsByClient(client);
	}

	public void createDeposit(Deposit deposit) {

		dataProvider.createDeposit(deposit);

	}

	public void updateDeposit(Deposit deposit) {

		dataProvider.updateDeposit(deposit);
	}

	public List<Activity> getAllClientActivities(Client client) {

		return dataProvider.getAllClientActivities(client);
	}

	public List<Property> viewPublicProperties() {

		return dataProvider.viewAllProperties();
	}

}
