package com.epam.mbank.data.dao.deposit;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.data.dao.DefaultDAO;
import com.epam.mbank.enums.DepositType;
import com.epam.mbank.model.deposit.Deposit;

public class DepositDAO extends BaseDAO<Deposit, Long> implements DefaultDAO<Deposit> {

	private static final String ALL_DEPOSITS_QUERY_NAME = "Deposit.all";
	private static final String DEPOSITS_BY_TYPE_QUERY_NAME = "Deposit.getByType";

	public DepositDAO() {
		super(Deposit.class);
	}

	@Override
	public List<Deposit> getAll() {

		Map<String, Object> parameters = Collections.emptyMap();

		return executeQuery(ALL_DEPOSITS_QUERY_NAME, parameters);
	}

	public List<Deposit> getByType(DepositType type) {

		Map<String, Object> parameters = new HashMap<String, Object>();

		parameters.put("type", type);

		return executeQuery(DEPOSITS_BY_TYPE_QUERY_NAME, parameters);

	}

}
