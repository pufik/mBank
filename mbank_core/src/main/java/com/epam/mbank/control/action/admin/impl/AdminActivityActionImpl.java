package com.epam.mbank.control.action.admin.impl;

import java.util.List;

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

	private ActivityDAO activityDao;

	public AdminActivityActionImpl() {
		this.activityDao = new ActivityDAO();
	}

	@Override
	public List<Activity> getAllActivities() {

		return activityDao.getAll();
	}

}
