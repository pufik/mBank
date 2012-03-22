package com.epam.mbank.control.action.admin.impl;

import java.util.List;

import javax.inject.Inject;

import com.epam.mbank.control.action.admin.AdminAccountAction;
import com.epam.mbank.data.dao.account.AccountDAO;
import com.epam.mbank.model.account.Account;

/**
 * Provides operations for client's accounts.
 * 
 * @author Iurii_Parfeniuk
 * 
 */

public class AdminAccountActionImpl implements AdminAccountAction {

	private final AccountDAO accountDao;

	@Inject
	public AdminAccountActionImpl(AccountDAO accountDao) {
		super();
		this.accountDao = accountDao;
	}

	@Override
	public Account getAccountById(Long id) {

		return accountDao.getById(id);
	}

	@Override
	public List<Account> getAllAccounts() {

		return accountDao.getAll();
	}

	@Override
	public void createAccount(Account account) {

		accountDao.save(account);

	}

	@Override
	public void removeAccount(Account accont) {

		accountDao.remove(accont);

	}

}
