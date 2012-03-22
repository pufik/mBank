package com.epam.mbank.control.action.admin;

import java.util.List;

import com.epam.mbank.enums.DepositType;
import com.epam.mbank.model.deposit.Deposit;

public interface AdminDepositAction {

	Deposit getDepositById(Long id);

	List<Deposit> getDepositsByType(DepositType type);

	List<Deposit> getAllDeposit();

	void createDeposit(Deposit deposit);

	void updateDeposit(Deposit deposit);

	void closeDeposit(Deposit deposit);
}
