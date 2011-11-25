package com.epam.mbank.data.dao.account;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.model.account.Account;

public class AccountDAO extends BaseDAO<Account> {

	private static final String ALL_ACCOUNTS_QUERY_NAME = "allAccounts";

	public AccountDAO() {
		super(Account.class, ALL_ACCOUNTS_QUERY_NAME);
	}
}
