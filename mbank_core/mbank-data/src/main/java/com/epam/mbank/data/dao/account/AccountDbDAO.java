package com.epam.mbank.data.dao.account;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.epam.mbank.data.dao.BaseDbDAO;
import com.epam.mbank.model.account.Account;

public class AccountDbDAO extends BaseDbDAO<Account, Long> implements AccountDAO {

	private static final String ALL_ACCOUNTS_QUERY_NAME = "Account.all";

	public AccountDbDAO() {
		super(Account.class);
	}

	@Override
	public List<Account> getAll() {

		Map<String, Object> parameters = Collections.emptyMap();

		return executeQuery(ALL_ACCOUNTS_QUERY_NAME, parameters);
	}

}
