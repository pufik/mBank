package com.epam.mbank.control.action.admin.impl;

import java.util.List;

import javax.inject.Inject;

import com.epam.mbank.control.action.admin.AdminDepositAction;
import com.epam.mbank.data.dao.deposit.DepositDAO;
import com.epam.mbank.enums.DepositType;
import com.epam.mbank.model.deposit.Deposit;

/**
 * 
 * @author Iurii_Parfeniuk
 * 
 */

public class AdminDepositActionImpl implements AdminDepositAction {
	private final DepositDAO depositDao;

	@Inject
	public AdminDepositActionImpl(DepositDAO depositDao) {
		super();
		this.depositDao = depositDao;
	}

	@Override
	public Deposit getDepositById(Long id) {

		return depositDao.getById(id);
	}

	@Override
	public List<Deposit> getDepositsByType(DepositType type) {

		return depositDao.getByType(type);
	}

	@Override
	public List<Deposit> getAllDeposit() {

		return depositDao.getAll();
	}

	@Override
	public void createDeposit(Deposit deposit) {

		depositDao.save(deposit);
	}

	@Override
	public void updateDeposit(Deposit deposit) {

		depositDao.update(deposit);

	}

	@Override
	public void closeDeposit(Deposit deposit) {

		// TODO HOW does the deposit close? Delete it or change some status?
	}
}
