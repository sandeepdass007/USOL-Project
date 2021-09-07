package com.pgdca.resultmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credentials_table")
public class Credentials {

	@Id
	@Column(name = "username", length = 15)
	private String username;
	
	@Column(name = "pwd", length = 15)
	private String password;
	
	@Column(name = "usertype", length = 15)
	private String userType;

	public Credentials() {}
	
	public Credentials(String username, String password, String userType) {
		super();
		this.username = username;
		this.password = password;
		this.userType = userType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
}
