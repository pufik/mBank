package com.epam.mbank.dao.deposit;

import com.epam.mbank.dao.BaseDAO;
import com.epam.mbank.model.deposit.Deposit;

public class DepositDAO extends BaseDAO<Deposit> {

	private static final String ALL_DEPOSITS_QUERY_NAME = "allDeposits";

	public DepositDAO() {
		super(Deposit.class, ALL_DEPOSITS_QUERY_NAME);
	}
}
