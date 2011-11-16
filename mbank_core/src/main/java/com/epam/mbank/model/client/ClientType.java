package com.epam.mbank.model.client;

import com.epam.mbank.enums.ClientTypes;

public class ClientType {

	private ClientTypes type = null;

	public ClientType(ClientTypes type) {
		this.type = type;
	}

	public ClientTypes getType() {
		return type;
	}

	public void setType(ClientTypes type) {
		this.type = type;
	}
}
