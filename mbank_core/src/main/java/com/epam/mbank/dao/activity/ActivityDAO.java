package com.epam.mbank.dao.activity;

import com.epam.mbank.dao.BaseDAO;
import com.epam.mbank.model.activity.Activity;

public class ActivityDAO extends BaseDAO<Activity> {

	private final static String GET_ALL_QUERY = "SELECT a FROM Activity a";

	public ActivityDAO() {
		super(Activity.class);
	}

	@Override
	public String getAllQuery() {
		return GET_ALL_QUERY;
	}

}
