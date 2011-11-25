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

public class DataProvider implements Provider {

	@Override
	public Client getClientById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClientByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClientByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClientByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClientByStatus(ClientStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClientByType(ClientType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account getAccountById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccountByClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAccount(Account accont) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Deposit getDepositById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Deposit> getDepositsByClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Deposit> getDepositsByType(DepositType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Deposit> getAllDeposit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createDeposit(Deposit deposit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDeposit(Deposit deposit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeDeposit(Deposit deposit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Activity> getAllClientActivities(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Activity> getAllActivities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> viewAllProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> viewPublicProperties() {
		// TODO Auto-generated method stub
		return null;
	}

}
