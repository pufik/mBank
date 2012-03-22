package com.epam.mbank.control.action.client;

import com.epam.mbank.model.deposit.Deposit;

public interface ClientDepositAction {

	void createDeposit(Deposit deposit);

	void updateDeposit(Deposit deposit);

}
