package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CountryInfo")
public class CountryInfo {

	@Id
	@Column(name = "id", nullable = false, length = 10)
	private String id;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	
	public CountryInfo() {
		super();
	}

	public CountryInfo(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
