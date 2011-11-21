package com.epam.mbank.model.client;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.epam.mbank.enums.ClientStatus;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.model.account.Account;
import com.epam.mbank.model.activity.Activity;
import com.epam.mbank.model.deposit.Deposit;

@Entity
@Table(name = "CLIENTS")
@NamedQueries({
	@NamedQuery(name = "allClients", query = "SELECT c FROM Client c"),
	@NamedQuery(name = "getClientByName", query = "SELECT c FROM Client c WHERE c.name = :name")
	})

public class Client implements Serializable {

	private static final long serialVersionUID = -8238008002508028701L;

	@Id
	@SequenceGenerator(name = "CLIENT_SEQ", sequenceName = "CLIENT_TABLE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENT_SEQ")
	@Column(name = "CLIENT_ID")
	private Long id = null;

	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private ClientStatus status = null;

	@Column(name = "CLIENT_NAME")
	private String name = null;

	@Column(name = "PASSWORD")
	private String password = null;

	@Column(name = "TYPE")
	@Enumerated(EnumType.STRING)
	private ClientType type = null;

	@Column(name = "ADDRESS")
	private String address = null;

	@Column(name = "EMAIL")
	private String email = null;

	@Column(name = "PHONE")
	private String phone = null;

	@Column(name = "COMMENT")
	private String comment = null;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "client")
	private Account account = new Account();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "client")
	private Set<Deposit> deposits = new HashSet<Deposit>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "client")
	private Set<Activity> activities = new HashSet<Activity>();

	public Client() {
		status = ClientStatus.ACTIVE;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClientStatus getStatus() {
		return status;
	}

	public void setStatus(ClientStatus status) {
		this.status = status;
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

	public ClientType getType() {
		return type;
	}

	public void setType(ClientType type) {
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
		account.setClient(this);
	}

	public Set<Deposit> getDeposits() {
		return deposits;
	}

	public void setDeposits(Set<Deposit> deposits) {
		this.deposits = deposits;
	}

	public void addDeposit(Deposit deposit) {
		deposits.add(deposit);
		deposit.setClient(this);
	}

	public void removeDeposit(Deposit deposit) {
		deposits.remove(deposit);
		// TODO When I deleted deposit must I set client null?
	}

	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

	public void addActivity(Activity activity) {
		activities.add(activity);
		activity.setClient(this);
	}

	public void removeActivity(Activity activity) {
		activities.remove(activity);
		// TODO When I deleted activity must I set client null?
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}

		Client other = (Client) obj;

		if ((address == null) && (other.address != null)) {
			return false;
		} else if (!address.equals(other.address)) {
			return false;
		}

		if ((comment == null) && (other.comment != null)) {
			return false;
		} else if (!comment.equals(other.comment)) {
			return false;
		}

		if ((email == null) && (other.email != null)) {
			return false;
		} else if (!email.equals(other.email)) {
			return false;
		}

		if ((id == null) && (other.id != null)) {
			return false;
		} else if (!id.equals(other.id)) {
			return false;
		}

		if ((name == null) && (other.name != null)) {
			return false;
		} else if (!name.equals(other.name)) {
			return false;
		}

		if ((password == null) && (other.password != null)) {
			return false;
		} else if (!password.equals(other.password)) {
			return false;
		}

		if ((phone == null) && (other.phone != null)) {
			return false;
		} else if (!phone.equals(other.phone)) {
			return false;
		}

		if (status != other.status) {
			return false;
		}

		if (type != other.type) {
			return false;
		}

		return true;
	}

}
