package com.epam.mbank.dao.deposit;

import com.epam.mbank.dao.BaseDAO;
import com.epam.mbank.model.deposit.Deposit;

public class DepositDAO extends BaseDAO<Deposit> {

	private final static String GET_ALL_QUERY = "SELECT d FROM Deposit d";

	public DepositDAO() {
		super(Deposit.class);
	}

	@Override
	public String getAllQuery() {
		return GET_ALL_QUERY;
	}
}
