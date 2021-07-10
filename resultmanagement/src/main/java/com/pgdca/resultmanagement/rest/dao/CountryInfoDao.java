package com.pgdca.resultmanagement.rest.dao;

import java.io.Serializable;

public class CountryInfoDao implements Serializable {

	private static final long serialVersionUID = -2118010694502740659L;
	private String id;
	private String name;

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
