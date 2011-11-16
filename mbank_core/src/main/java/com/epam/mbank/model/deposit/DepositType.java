package com.epam.mbank.model.deposit;

import com.epam.mbank.enums.DepositTypes;

public class DepositType {

	private DepositTypes type = null;

	public DepositType(DepositTypes type) {
		this.type = type;
	}

	public DepositTypes getType() {
		return type;
	}

	public void setType(DepositTypes type) {
		this.type = type;
	}
}
