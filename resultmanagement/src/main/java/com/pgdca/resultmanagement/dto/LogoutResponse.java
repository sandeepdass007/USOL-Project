package com.pgdca.resultmanagement.dto;

public class LogoutResponse {

	private boolean success;
	private String error;

	public LogoutResponse(boolean success, String error) {
		super();
		this.success = success;
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getError() {
		return error;
	}

}
