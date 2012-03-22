package com.epam.mbank.control.action.admin.impl;

import java.util.List;

import javax.inject.Inject;

import com.epam.mbank.control.action.admin.AdminActivityAction;
import com.epam.mbank.data.dao.activity.ActivityDAO;
import com.epam.mbank.model.activity.Activity;

/**
 * Provides operations for client's activities.
 * 
 * @author Iurii_Parfeniuk
 * 
 */

public class AdminActivityActionImpl implements AdminActivityAction {

	private final ActivityDAO activityDao;

	@Inject
	public AdminActivityActionImpl(ActivityDAO activityDao) {
		this.activityDao = activityDao;
	}

	@Override
	public List<Activity> getAllActivities() {

		return activityDao.getAll();
	}

}
