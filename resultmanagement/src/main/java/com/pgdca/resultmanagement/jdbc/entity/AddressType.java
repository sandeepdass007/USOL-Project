package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AddressType")
public class AddressType {

	@Id
	@Column(name = "id", nullable = false, length = 10)
	private String id;

	@Column(name = "type", nullable = false, length = 15)
	private String type;

	public AddressType() {
		super();
	}

	public AddressType(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
