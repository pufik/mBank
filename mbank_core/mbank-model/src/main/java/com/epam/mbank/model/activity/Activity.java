package com.epam.mbank.model.activity;

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

import com.epam.mbank.model.client.Client;

@Entity
@Table(name = "ACTIVITY")
@NamedQueries({
	@NamedQuery(name = "Activity.all", query = "SELECT a FROM Activity a")	
})

public class Activity implements Serializable {

	private static final long serialVersionUID = 1182536670217352294L;

	@Id
	@SequenceGenerator(name = "ACTIVITY_SEQ", sequenceName = "ACTIVITY_TABLE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACTIVITY_SEQ")
	@Column(name = "ACTIVITY_ID")
	private Long id = null;

	@ManyToOne
	@JoinColumn(name = "CLIENT_ID")
	private Client client = null;

	@Column(name = "AMOUNT")
	private Double amount = null;

	@Column(name = "ACTIVITY_DATE")
	private Date activityDate = null;

	@Column(name = "COMMISSION")
	private Double commission = null;

	@Column(name = "DESCRIPTION")
	private String description = null;

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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activityDate == null) ? 0 : activityDate.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((commission == null) ? 0 : commission.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}

		Activity other = (Activity) obj;

		if ((activityDate == null) && (other.activityDate != null)) {
			return false;
		} else if (!activityDate.equals(other.activityDate)) {
			return false;
		}

		if ((amount == null) && (other.amount != null)) {
			return false;
		} else if (!amount.equals(other.amount)) {
			return false;
		}

		if ((client == null) && (other.client != null)) {
			return false;
		} else if (!client.equals(other.client)) {
			return false;
		}

		if ((commission == null) && (other.commission != null)) {
			return false;
		} else if (!commission.equals(other.commission)) {
			return false;
		}

		if ((description == null) && (other.description != null)) {
			return false;
		} else if (!description.equals(other.description)) {
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
