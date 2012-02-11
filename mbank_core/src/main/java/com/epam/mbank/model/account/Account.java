package com.epam.mbank.model.account;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.epam.mbank.model.client.Client;

@Entity
@Table(name = "ACCOUNT")
@NamedQueries({
	@NamedQuery(name = "Account.all", query = "SELECT a FROM Account a")
})

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((creditLimit == null) ? 0 : creditLimit.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object candidate) {
		if (this == candidate) {
			return true;
		}

		if ((candidate == null) || (getClass() != candidate.getClass())) {
			return false;
		}

		Account other = (Account) candidate;

		if ((balance == null) && (other.balance != null)) {
			return false;
		} else if (!balance.equals(other.balance)) {
			return false;
		}

		if ((client == null) && (other.client != null)) {
			return false;
		} else if (!client.equals(other.client)) {
			return false;
		}

		if ((comment == null) && (other.comment != null)) {
			return false;
		} else if (!comment.equals(other.comment)) {
			return false;
		}

		if ((creditLimit == null) && (other.creditLimit != null)) {
			return false;
		} else if (!creditLimit.equals(other.creditLimit)) {
			return false;
		}

		if ((id == null) && (other.id != null)) {
			return false;
		} else if (!id.equals(other.id)) {
			return false;
		}

		return true;
	}

}
