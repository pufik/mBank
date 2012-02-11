package com.epam.mbank.control.action.client.impl;

import javax.inject.Inject;

import com.epam.mbank.control.action.client.ClientDepositAction;
import com.epam.mbank.data.dao.deposit.DepositDAO;
import com.epam.mbank.model.deposit.Deposit;

public class ClientDepositActionImpl implements ClientDepositAction {

	private DepositDAO depositDao;

	@Inject
	public ClientDepositActionImpl(DepositDAO depositDao) {
		super();
		this.depositDao = depositDao;
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
