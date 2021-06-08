package com.pgdca.resultmanagement.mvc.dao;

public class CredentialsDao {

	private String username;
	private String userType;

	public CredentialsDao(String username, String userType) {
		super();
		this.username = username;
		this.userType = userType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
