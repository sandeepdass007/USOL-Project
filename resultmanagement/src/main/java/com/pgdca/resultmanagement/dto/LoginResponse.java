package com.pgdca.resultmanagement.dto;

public class LoginResponse {

	private boolean success;
	private String error;
	private String userType;

	public LoginResponse(boolean success, String error, String userType) {
		super();
		this.success = success;
		this.error = error;
		this.userType = userType;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
