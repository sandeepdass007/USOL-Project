package com.pgdca.resultmanagement.dto;

public class ValidationResponse {

	private boolean valid;
	private String error;
	public ValidationResponse(boolean valid, String error) {
		super();
		this.valid = valid;
		this.error = error;
	}
	public boolean isValid() {
		return valid;
	}
	public String getError() {
		return error;
	}
}
