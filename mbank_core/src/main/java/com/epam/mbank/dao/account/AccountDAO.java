package com.epam.mbank.dao.account;

import com.epam.mbank.dao.BaseDAO;
import com.epam.mbank.model.account.Account;

public class AccountDAO extends BaseDAO<Account> {

	private final static String GET_ALL_QUERY = "SELECT a FROM Account a";

	public AccountDAO() {
		super(Account.class);
	}

	@Override
	public String getAllQuery() {
		return GET_ALL_QUERY;
	}

}
