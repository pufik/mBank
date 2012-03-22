package com.epam.mbank.loader;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.mbank.control.action.admin.AdminClientAction;
import com.epam.mbank.data.dao.account.AccountDAO;
import com.epam.mbank.data.dao.client.ClientDAO;
import com.epam.mbank.model.account.Account;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.utils.di.AdminModule;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ApplicationLoader {
	private final static Logger logger = LoggerFactory.getLogger(ApplicationLoader.class);
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new DAOModule(), new AdminModule());
		ClientDAO clientDao = injector.getInstance(ClientDAO.class);
		AccountDAO accountDao = injector.getInstance(AccountDAO.class);
		AdminClientAction adminClientManager = injector.getInstance(AdminClientAction.class);
		Collection<Client> clientList = clientDao.getAll();
		List<Account> accounts = accountDao.getAll();

		logger.info("Start add info.");
	}

}
