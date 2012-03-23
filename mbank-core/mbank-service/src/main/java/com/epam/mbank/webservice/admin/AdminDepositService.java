package com.epam.mbank.webservice.admin;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.mbank.control.action.admin.AdminDepositAction;
import com.epam.mbank.enums.DepositType;
import com.epam.mbank.model.deposit.Deposit;
import com.epam.mbank.utils.di.AdminModule;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

@WebService
public class AdminDepositService {

	private Injector injector;

	private AdminDepositAction adminDepositAction;

	public AdminDepositService() {
		injector = Guice.createInjector(new DAOModule(), new AdminModule());
		adminDepositAction = injector.getInstance(AdminDepositAction.class);
	}

	@WebMethod
	public Deposit getDepositById(Long depositId) {
		Deposit deposit = adminDepositAction.getDepositById(depositId);

		return deposit;
	}

	@WebMethod
	public List<Deposit> getDepositsByType(DepositType type) {
		List<Deposit> deposits = adminDepositAction.getDepositsByType(type);

		return deposits;
	}

	@WebMethod
	public List<Deposit> getAllDeposit() {
		List<Deposit> deposits = adminDepositAction.getAllDeposit();

		return deposits;
	}

	@WebMethod
	public void createDeposit(Deposit deposit) {
		adminDepositAction.createDeposit(deposit);

	}

	@WebMethod
	public void updateDeposit(Deposit deposit) {
		adminDepositAction.updateDeposit(deposit);
	}

	@WebMethod
	public void closeDeposit(Deposit deposit) {
		adminDepositAction.closeDeposit(deposit);
	}

}
