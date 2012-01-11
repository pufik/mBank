package com.epam.mbank.utils.di;

import com.epam.mbank.control.action.client.ClientAccountAction;
import com.epam.mbank.control.action.client.ClientActivityAction;
import com.epam.mbank.control.action.client.ClientClientAction;
import com.epam.mbank.control.action.client.ClientDepositAction;
import com.epam.mbank.control.action.client.ClientSystemPropertyAction;
import com.epam.mbank.control.action.client.impl.ClientAccountActionImpl;
import com.epam.mbank.control.action.client.impl.ClientActivityActionImpl;
import com.epam.mbank.control.action.client.impl.ClientClientActionImpl;
import com.epam.mbank.control.action.client.impl.ClientDepositActionImpl;
import com.epam.mbank.control.action.client.impl.ClientSystemPropertyActionImpl;
import com.google.inject.AbstractModule;

public class ClientModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ClientClientAction.class).to(ClientClientActionImpl.class);
		bind(ClientAccountAction.class).to(ClientAccountActionImpl.class);
		bind(ClientDepositAction.class).to(ClientDepositActionImpl.class);
		bind(ClientActivityAction.class).to(ClientActivityActionImpl.class);
		bind(ClientSystemPropertyAction.class).to(ClientSystemPropertyActionImpl.class);
	}
}
