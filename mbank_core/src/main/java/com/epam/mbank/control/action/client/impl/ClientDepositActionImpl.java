package com.epam.mbank.control.action.client.impl;

import com.epam.mbank.control.action.client.ClientDepositAction;
import com.epam.mbank.data.dao.deposit.DepositDAO;
import com.epam.mbank.model.deposit.Deposit;

public class ClientDepositActionImpl implements ClientDepositAction {

	private DepositDAO depositDao;

	public ClientDepositActionImpl() {
		super();
		this.depositDao = new DepositDAO();
	}

	@Override
	public void createDeposit(Deposit deposit) {

		depositDao.save(deposit);
	}

	@Override
	public void updateDeposit(Deposit deposit) {

		depositDao.update(deposit);
	}
}
