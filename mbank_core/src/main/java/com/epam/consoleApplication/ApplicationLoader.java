package com.epam.consoleApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.mbank.enums.ClientType;
import com.epam.mbank.model.account.Account;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.model.deposit.Deposit;
import com.epam.mbank.utils.system.SystemInitialization;

//This is a temp application loader

public class ApplicationLoader {
	private final static Logger logger = LoggerFactory.getLogger(ApplicationLoader.class);

	public static void main(String[] args) {

		SystemInitialization.init();
		logger.info("Start add info.");
		Client client = new Client();
		Account account = new Account();
		Deposit deposit = new Deposit();
		client.setName("Petydfgsdfgda");
		client.setEmail("dfsdfsd@email.com");
		client.setAddress("rtertert");
		client.setPhone("sdfgsdfgd");
		client.setComment("fsdsdf");
		client.setPassword("gfgdfgdfg");
		client.setType(ClientType.GOLD);
		client.setAccount(account);
		client.addDeposit(deposit);

		client = ClientDAO.create(client);
		Client client1 = new Client();
		Account account1 = new Account();
		Deposit deposit1 = new Deposit();

		client1.setName("Yra");
		client1.setEmail("dfsdfsd@email.com");
		client1.setAddress("rtertert");
		client1.setPhone("sdfgsdfgd");
		client1.setComment("fsdsdf");
		client1.setPassword("gfgdfgdfg");
		client1.setType(ClientType.REGULAR);
		client1.setAccount(account1);
		client1.addDeposit(deposit1);
		client1 = ClientDAO.create(client1);

	}

}