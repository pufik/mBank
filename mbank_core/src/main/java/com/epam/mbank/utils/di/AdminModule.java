package com.epam.mbank.utils.di;

import com.epam.mbank.control.action.admin.AdminAccountAction;
import com.epam.mbank.control.action.admin.AdminActivityAction;
import com.epam.mbank.control.action.admin.AdminClientAction;
import com.epam.mbank.control.action.admin.AdminDepositAction;
import com.epam.mbank.control.action.admin.AdminSystemProperyAction;
import com.epam.mbank.control.action.admin.impl.AdminAccountActionImpl;
import com.epam.mbank.control.action.admin.impl.AdminActivityActionImpl;
import com.epam.mbank.control.action.admin.impl.AdminClientActionImpl;
import com.epam.mbank.control.action.admin.impl.AdminDepositActionImpl;
import com.epam.mbank.control.action.admin.impl.AdminSystemPropertyActionImpl;
import com.google.inject.AbstractModule;

public class AdminModule extends AbstractModule {

	@Override
	protected void configure() {		
		bind(AdminClientAction.class).to(AdminClientActionImpl.class);
		bind(AdminAccountAction.class).to(AdminAccountActionImpl.class);
		bind(AdminDepositAction.class).to(AdminDepositActionImpl.class);
		bind(AdminActivityAction.class).to(AdminActivityActionImpl.class);
		bind(AdminSystemProperyAction.class).to(AdminSystemPropertyActionImpl.class);
	}

}
