package com.epam.consoleApplication;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.mbank.control.action.admin.AdminClientAction;
import com.epam.mbank.control.action.admin.impl.AdminClientActionImpl;
import com.epam.mbank.data.dao.client.ClientDAO;
import com.epam.mbank.data.dao.client.ClientDbDAO;
import com.epam.mbank.enums.ClientStatus;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.utils.di.AdminModule;
import com.epam.mbank.utils.di.DAOModule;
import com.epam.mbank.utils.system.SystemInitialization;
import com.google.inject.Guice;
import com.google.inject.Injector;

//This is a temp application loader

public class ApplicationLoader {
	private final static Logger logger = LoggerFactory.getLogger(ApplicationLoader.class);

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new DAOModule(), new AdminModule());
		ClientDAO clientDao = injector.getInstance(ClientDAO.class);
		AdminClientAction adminClientManager = injector.getInstance(AdminClientAction.class);
		Collection<Client> clientList;
		logger.info("Start add info.");
		Client client = new Client();
		
		client.setName("Iurii");
		client.setType(ClientType.GOLD);
		client.setStatus(ClientStatus.ACTIVE);
		client.setEmail("sdsdfsdfsdddddwddd");
		adminClientManager.createClient(client);

		clientList = clientDao.getAll();

		clientList = adminClientManager.getClientByType(ClientType.GOLD);

	}

}