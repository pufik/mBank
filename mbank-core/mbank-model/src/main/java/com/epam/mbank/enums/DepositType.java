package com.epam.mbank.enums;

public enum DepositType {

	SHORT("SHORT"), LONG("LONG");

	private String description = null;

	private DepositType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
