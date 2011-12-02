package com.epam.mbank.data.dao.account;

import java.util.List;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.data.dao.DefaultDAO;
import com.epam.mbank.model.account.Account;

public class AccountDAO extends BaseDAO<Account> implements DefaultDAO<Account> {

	private static final String ALL_ACCOUNTS_QUERY_NAME = "allAccounts";

	public AccountDAO() {
		super(Account.class);
	}

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
