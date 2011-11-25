package com.epam.mbank.data.provider;

import java.util.List;

import com.epam.mbank.enums.ClientStatus;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.enums.DepositType;
import com.epam.mbank.model.account.Account;
import com.epam.mbank.model.activity.Activity;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.model.deposit.Deposit;
import com.epam.mbank.model.system.Property;

public interface Provider {

	// Client section
	Client getClientById(Long id);

	Client getClientByName(String name);

	Client getClientByEmail(String email);

	Client getClientByPhone(String phone);

	Client getClientByStatus(ClientStatus status);

	Client getClientByType(ClientType type);

	List<Client> getAllClients();

	void createClient(Client client);

	void removeClient(Client client);

	void updateClient(Client client);

	// Account section
	Account getAccountById(Long id);

	Account getAccountByClient(Client client);

	List<Account> getAllAccounts();

	void createAccount(Account account);

	void removeAccount(Account accont);

	// Deposit section
	Deposit getDepositById(Long id);

	List<Deposit> getDepositsByClient(Client client);

	List<Deposit> getDepositsByType(DepositType type);

	List<Deposit> getAllDeposit();

	void createDeposit(Deposit deposit);

	void updateDeposit(Deposit deposit);

	void closeDeposit(Deposit deposit);

	// Activities section
	List<Activity> getAllClientActivities(Client client);

	List<Activity> getAllActivities();

	// System property section
	List<Property> viewAllProperties();

	List<Property> viewPublicProperties();

}
