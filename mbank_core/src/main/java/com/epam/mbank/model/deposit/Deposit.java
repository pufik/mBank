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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.epam.mbank.enums.DepositType;
import com.epam.mbank.model.client.Client;

@Entity
@Table(name = "DEPOSIT")
@NamedQueries({@NamedQuery(name = "Deposit.all", query = "SELECT d FROM Deposit d"),
@NamedQuery(name = "Deposit.getByType", query = "SELECT d FROM Deposit d WHERE d.type=:type")	
})

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((closingDate == null) ? 0 : closingDate.hashCode());
		result = prime * result + ((estimatedBalance == null) ? 0 : estimatedBalance.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((openingDate == null) ? 0 : openingDate.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}

		Deposit other = (Deposit) obj;

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

		if ((closingDate == null) && (other.closingDate != null)) {
			return false;
		} else if (!closingDate.equals(other.closingDate)) {
			return false;
		}

		if ((estimatedBalance == null) && (other.estimatedBalance != null)) {
			return false;
		} else if (!estimatedBalance.equals(other.estimatedBalance)) {
			return false;
		}

		if ((id == null) && (other.id != null)) {
			return false;
		} else if (!id.equals(other.id)) {
			return false;
		}

		if ((openingDate == null) && (other.openingDate != null)) {
			return false;
		} else if (!openingDate.equals(other.openingDate)) {
			return false;
		}

		if (type != other.type)
			return false;

		return true;
	}

}
