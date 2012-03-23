package com.epam.mbank.webservice.admin;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.mbank.control.action.admin.AdminAccountAction;
import com.epam.mbank.model.account.Account;
import com.epam.mbank.utils.di.AdminModule;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

@WebService
public class AdminAccountService {

	private Injector injector;

	private AdminAccountAction adminAccountAction;

	public AdminAccountService() {
		injector = Guice.createInjector(new DAOModule(), new AdminModule());
		adminAccountAction = injector.getInstance(AdminAccountAction.class);
	}

	@WebMethod
	public Account getAccountById(Long accountId) {
		Account account = adminAccountAction.getAccountById(accountId);

		return account;
	}

	@WebMethod
	public List<Account> getAllAccounts() {
		List<Account> accounts = adminAccountAction.getAllAccounts();

		return accounts;
	}

	@WebMethod
	public void createAccount(Account account) {
		adminAccountAction.createAccount(account);
	}

	@WebMethod
	public void removeAccount(Account accont) {
		adminAccountAction.removeAccount(accont);
	}
}
