package com.epam.mbank.control.action.client;

import com.epam.mbank.data.provider.DataProvider;
import com.epam.mbank.data.provider.Provider;

public class ClientActionManager {

	private Provider dataProvider = null;

	public ClientActionManager() {
		this.dataProvider = new DataProvider();
	}

}
