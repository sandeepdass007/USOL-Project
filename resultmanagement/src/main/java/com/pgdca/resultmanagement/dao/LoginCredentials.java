package com.pgdca.resultmanagement.dao;

public class LoginCredentials {

	private String username;
	private String password;
	private Debug debug;
	
	public LoginCredentials(String username, String password, Debug debug) {
		super();
		this.username = username;
		this.password = password;
		this.debug = debug;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	public Debug getDebug() {
		return debug;
	}

	static public class Debug {
		boolean enable;
		boolean forceFail;

		public Debug(boolean enable, boolean forceFail) {
			super();
			this.enable = enable;
			this.forceFail = forceFail;
		}

		public boolean isEnable() {
			return enable;
		}

		public boolean isForceFail() {
			return forceFail;
		}
	}
}
