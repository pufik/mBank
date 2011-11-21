package com.epam.mbank.dao.activity;

import com.epam.mbank.dao.BaseDAO;
import com.epam.mbank.model.activity.Activity;

public class ActivityDAO extends BaseDAO<Activity> {

	private static final String ALL_ACTIVITY_QUERY_NAME = "allActivities";

	public ActivityDAO() {
		super(Activity.class, ALL_ACTIVITY_QUERY_NAME);
	}
}
