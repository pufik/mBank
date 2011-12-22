package com.epam.mbank.data.dao.activity;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.data.dao.DefaultDAO;
import com.epam.mbank.model.activity.Activity;

public class ActivityDAO extends BaseDAO<Activity, Long> implements DefaultDAO<Activity> {

	private static final String ALL_ACTIVITY_QUERY_NAME = "Activity.all";

	public ActivityDAO() {
		super(Activity.class);
	}

	@Override
	public List<Activity> getAll() {

		Map<String, Object> parameters = Collections.emptyMap();

		return executeQuery(ALL_ACTIVITY_QUERY_NAME, parameters);
	}
}
