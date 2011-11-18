package com.epam.consoleApplication;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.mbank.dao.client.ClientDAO;
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

		ClientDAO clientDao = new ClientDAO();
		Client client = (Client) clientDao.getById(Client.class, Long.valueOf(5));
		Collection<Client> clientList = clientDao.getAll();

		int a = 0;

	}

}