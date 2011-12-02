package com.epam.mbank.data.dao.activity;

import java.util.List;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.data.dao.DefaultDAO;
import com.epam.mbank.model.activity.Activity;

public class ActivityDAO extends BaseDAO<Activity> implements DefaultDAO<Activity> {

	private static final String ALL_ACTIVITY_QUERY_NAME = "allActivities";

	public ActivityDAO() {
		super(Activity.class);
	}

	@Override
	public List<Activity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
