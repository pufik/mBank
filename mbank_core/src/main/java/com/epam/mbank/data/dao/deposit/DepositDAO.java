package com.epam.mbank.data.dao.deposit;

import java.util.List;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.enums.DepositType;
import com.epam.mbank.model.deposit.Deposit;

public interface DepositDAO extends BaseDAO<Deposit, Long> {

	List<Deposit> getByType(DepositType type);
}
