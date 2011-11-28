package com.epam.mbank.data.dao.deposit;

import java.util.List;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.model.deposit.Deposit;

public class DepositDAO extends BaseDAO<Deposit> {

	private static final String ALL_DEPOSITS_QUERY_NAME = "allDeposits";

	public DepositDAO() {
		super(Deposit.class);
	}

	@Override
	public List<Deposit> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
