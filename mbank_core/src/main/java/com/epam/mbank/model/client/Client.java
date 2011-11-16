package com.epam.mbank.model.client;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.epam.mbank.enums.ClientTypes;
import com.epam.mbank.model.activity.Activity;
import com.epam.mbank.model.deposit.Deposit;

@Entity
@Table(name = "CLIENTS")
public class Client implements Serializable {

	private static final long serialVersionUID = -8238008002508028701L;

	@Id
	@Column(name = "CLIENT_ID")
	private Long id = null;

	@Column(name = "CLIENT_NAME")
	private String name = null;

	@Column(name = "PASSWORD")
	private String password = null;

	@Column(name = "TYPE")
	private ClientTypes type = null;

	@Column(name = "ADDRESS")
	private String address = null;

	@Column(name = "EMAIL")
	private String email = null;

	@Column(name = "PHONE")
	private String phone = null;

	@Column(name = "COMMENT")
	private String comment = null;

	// @OneToOne
	// @JoinColumn(name = "ACCOUNT_ID")
	// private Account account = new Account();

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPOSIT_ID")
	private Set<Deposit> deposits = new HashSet<Deposit>();

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACTIVITY_ID")
	private Set<Activity> activities = new HashSet<Activity>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ClientTypes getType() {
		return type;
	}

	public void setType(ClientTypes type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	// public Account getAccount() {
	// return account;
	// }
	//
	// public void setAccount(Account account) {
	// this.account = account;
	// }

	public Set<? extends Deposit> getDeposits() {
		return deposits;
	}

	public void setDeposits(Set<Deposit> deposits) {
		this.deposits = deposits;
	}

	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

}
