package com.epam.mbank.enums;

public enum SystemProperty {

	REGULAR_DEPOSIT_RATE("10000"),
	GOLD_DEPOSIT_RATE("100000"),
	PLATINUM_DEPOSIT("1000000"),
	
	REGULAR_DEPOSIT_COMMISION("1.5"),
	GOLD_DEPOSIT_COMMISION("1.0"),
	PLATINUM_DEPOSIT_COMMISION("0.5"),
	
	REGULAR_CREDIT_LIMIT("100000"),
	GOLD_CREDIT_LIMIT("1000000"),
	PLATINUM_CREDIT_LIMIT("unlimited"),
	
	COMMISION_RATE("0.5"),	
	
	DAYS_OF_YEAR_FOR_INTEREST("365"),
	REGULAR_DAILY_INTEREST("5"),
	GOLD_DAILY_INTEREST("7"),
	PLATINUM_DAILY_INTEREST("8"),
	PRE_OPEN_FEE("1"),
	
	ADMIN_USER_NAME("system"),
	ADMIN_PASSWORD("admin");
	
	private String value = null;

	private SystemProperty(String value) {
		this.value = value;

	}

	public String getDescription() {
		return value;
	}
}
