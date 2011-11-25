package com.epam.mbank.control.action.admin;

import com.epam.mbank.data.provider.DataProvider;
import com.epam.mbank.data.provider.Provider;

public class AdminActionManager {

	private Provider dataProvider = null;

	public AdminActionManager() {
		this.dataProvider = new DataProvider();
	}

}
