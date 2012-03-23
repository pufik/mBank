package com.epam.mbank.webservice.admin;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.mbank.control.action.admin.AdminActivityAction;
import com.epam.mbank.model.activity.Activity;
import com.epam.mbank.utils.di.AdminModule;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

@WebService
public class AdminActivityService {

	private Injector injector;

	private AdminActivityAction adminActivityAction;

	public AdminActivityService() {
		injector = Guice.createInjector(new DAOModule(), new AdminModule());
		adminActivityAction = injector.getInstance(AdminActivityAction.class);
	}

	@WebMethod
	public List<Activity> getAllActivities() {
		List<Activity> activities = adminActivityAction.getAllActivities();

		return activities;
	}

}
