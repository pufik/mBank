package com.epam.mbank.enums;

public enum ClientTypes {
	REGULAR("REGULAR"), GOLD("GOLD"), PLATINUM("PLATINUM");

	private String description = null;

	private ClientTypes(String description) {
		this.description = description;

	}

	public String getDescription() {
		return description;
	}
}
