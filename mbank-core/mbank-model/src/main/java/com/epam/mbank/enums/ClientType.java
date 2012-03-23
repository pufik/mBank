package com.epam.mbank.enums;

public enum ClientType {
	REGULAR("REGULAR"), GOLD("GOLD"), PLATINUM("PLATINUM");

	private String description = null;

	private ClientType(String description) {
		this.description = description;

	}

	public String getDescription() {
		return description;
	}
}
