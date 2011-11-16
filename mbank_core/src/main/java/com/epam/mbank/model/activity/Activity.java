package com.epam.mbank.model.activity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.epam.mbank.model.client.Client;

@Entity
@Table(name = "ACTIVITY")
public class Activity implements Serializable {

	private static final long serialVersionUID = 1182536670217352294L;

	@Id
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

}
