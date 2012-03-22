package com.epam.mbank.enums;

public enum ClientStatus {

	ACTIVE("ACTIVE"), DELETED("DELETED");

	private String description = null;

	private ClientStatus(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
