package com.epam.mbank.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.mbank.control.action.client.ClientDepositAction;
import com.epam.mbank.model.deposit.Deposit;
import com.epam.mbank.utils.di.ClientModule;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

@WebService
public class ClientDepositService {
	private Injector injector;
	private ClientDepositAction clientDepositAction;

	public ClientDepositService() {
		injector = Guice.createInjector(new DAOModule(), new ClientModule());
		clientDepositAction = injector.getInstance(ClientDepositAction.class);
	}

	@WebMethod
	public void createDeposit(Deposit deposit) {
		clientDepositAction.createDeposit(deposit);
	}

	@WebMethod
	public void updateDeposit(Deposit deposit) {
		clientDepositAction.updateDeposit(deposit);
	}

}
