package com.epam.mbank.utils.di;

import com.epam.mbank.data.dao.account.AccountDAO;
import com.epam.mbank.data.dao.account.AccountDbDAO;
import com.epam.mbank.data.dao.activity.ActivityDAO;
import com.epam.mbank.data.dao.activity.ActivityDbDAO;
import com.epam.mbank.data.dao.client.ClientDAO;
import com.epam.mbank.data.dao.client.ClientDbDAO;
import com.epam.mbank.data.dao.deposit.DepositDAO;
import com.epam.mbank.data.dao.deposit.DepositDbDAO;
import com.epam.mbank.data.dao.system.SystemPropertiesDAO;
import com.epam.mbank.data.dao.system.SystemPropertiesDbDAO;
import com.google.inject.AbstractModule;

public class DAOModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(AccountDAO.class).to(AccountDbDAO.class);
		bind(ClientDAO.class).to(ClientDbDAO.class);
		bind(ActivityDAO.class).to(ActivityDbDAO.class);
		bind(DepositDAO.class).to(DepositDbDAO.class);
		bind(SystemPropertiesDAO.class).to(SystemPropertiesDbDAO.class);
	}

}
