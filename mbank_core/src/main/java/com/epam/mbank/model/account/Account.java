package com.epam.mbank.model.account;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.epam.mbank.model.client.Client;

@Entity
@Table(name = "ACCOUNTS")
public class Account implements Serializable {

	private static final long serialVersionUID = 5498802337553420833L;

	@Id
	@SequenceGenerator(name = "ACCOUNT_SEQ", sequenceName = "ACCOUNT_TABLE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOUNT_SEQ")
	@Column(name = "ACCOUNT_ID")
	private Long id = null;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CLIENT_ID")
	private Client client = null;

	@Column(name = "BALANCE")
	private Double balance = null;

	@Column(name = "CREDIT_LIMIT")
	private Double creditLimit = null;

	@Column(name = "COMMENT")
	private String comment = null;

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

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
