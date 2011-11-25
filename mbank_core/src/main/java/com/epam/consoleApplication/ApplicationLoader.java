package com.epam.consoleApplication;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.mbank.data.dao.client.ClientDAO;
import com.epam.mbank.data.dao.deposit.DepositDAO;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.utils.system.SystemInitialization;

//This is a temp application loader

public class ApplicationLoader {
	private final static Logger logger = LoggerFactory.getLogger(ApplicationLoader.class);

	public static void main(String[] args) {

		SystemInitialization.init();
		logger.info("Start add info.");

		ClientDAO clientDao = new ClientDAO();
		Client client = (Client) clientDao.getById(Long.valueOf(5));
		Collection<Client> clientList = clientDao.getAll();
		DepositDAO depositDao = new DepositDAO();
		
		int a = 0;

	}

}