package com.epam.mbank.enums;

public enum DepositTypes {

	SHORT("SHORT"), LONG("LONG");

	private String description = null;

	private DepositTypes(String description) {

	}

	public String getDescription() {
		return description;
	}

}
