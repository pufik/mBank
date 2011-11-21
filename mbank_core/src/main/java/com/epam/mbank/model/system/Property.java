package com.epam.mbank.model.system;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.epam.mbank.enums.SystemProperty;

@Entity
@Table(name = "PROPERTIES")
public class Property implements Serializable {

	private static final long serialVersionUID = 4646946339447884986L;

	@Id
	@Column(name = "PROP_KEY")
	private SystemProperty key = null;

	@Column(name = "PROP_VALUE")
	private String value = null;

	public SystemProperty getKey() {
		return key;
	}

	public void setKey(SystemProperty key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
