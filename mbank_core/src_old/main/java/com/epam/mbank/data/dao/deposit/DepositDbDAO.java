package com.epam.mbank.data.dao.deposit;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.epam.mbank.data.dao.BaseDbDAO;
import com.epam.mbank.enums.DepositType;
import com.epam.mbank.model.deposit.Deposit;

public class DepositDbDAO extends BaseDbDAO<Deposit, Long> implements DepositDAO {

	private static final String ALL_DEPOSITS_QUERY_NAME = "Deposit.all";
	private static final String DEPOSITS_BY_TYPE_QUERY_NAME = "Deposit.getByType";

	public DepositDbDAO() {
		super(Deposit.class);
	}

	@Override
	public List<Deposit> getAll() {

		Map<String, Object> parameters = Collections.emptyMap();

		return executeQuery(ALL_DEPOSITS_QUERY_NAME, parameters);
	}

	@Override
	public List<Deposit> getByType(DepositType type) {

		Map<String, Object> parameters = new HashMap<String, Object>();

		parameters.put("type", type);

		return executeQuery(DEPOSITS_BY_TYPE_QUERY_NAME, parameters);

	}

}
