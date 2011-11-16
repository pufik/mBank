package com.epam.mbank.model.system;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROPERTIES")
public abstract class SystemProperty implements Serializable {

	private static final long serialVersionUID = 4646946339447884986L;

	@Id
	@Column(name = "PROP_KEY")
	private String key = null;

	@Column(name = "PROP_VALUE")
	private String value = null;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
