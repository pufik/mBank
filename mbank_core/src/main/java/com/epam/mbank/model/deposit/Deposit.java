package com.epam.mbank.model.deposit;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.epam.mbank.enums.DepositType;
import com.epam.mbank.model.client.Client;

@Entity
@Table(name = "DEPOSITS")
public class Deposit implements Serializable {

	private static final long serialVersionUID = -4983525392227140096L;

	@Id
	@SequenceGenerator(name = "DEPOSIT_SEQ", sequenceName = "DEPOSIT_TABLE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEPOSIT_SEQ")
	@Column(name = "DEPOSIT_ID")
	private Long id = null;

	@ManyToOne
	@JoinColumn(name = "CLIENT_ID")
	private Client client = null;

	@Column(name = "BALANCE")
	private Double balance = null;

	@Column(name = "TYPE")
	private DepositType type = null;

	@Column(name = "ESTIMATED_BALANCE")
	private Long estimatedBalance = null;

	@Column(name = "OPENING_DATE")
	private Date openingDate = null;

	@Column(name = "CLOSING_DATE")
	private Date closingDate = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public DepositType getType() {
		return type;
	}

	public void setType(DepositType type) {
		this.type = type;
	}

	public Long getEstimatedBalance() {
		return estimatedBalance;
	}

	public void setEstimatedBalance(Long estimatedBalance) {
		this.estimatedBalance = estimatedBalance;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public Date getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}

}
