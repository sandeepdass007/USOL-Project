package com.pgdca.resultmanagement.mvc.dao.builder;

import com.pgdca.resultmanagement.mvc.dao.PhoneTypeDao;

public class PhoneTypeDaoBuilder {

	private PhoneTypeDao phoneTypeDao;
	
	private PhoneTypeDaoBuilder() {
		this.phoneTypeDao = new PhoneTypeDao();
	}
	
	public static PhoneTypeDaoBuilder getBuilder() {
		return new PhoneTypeDaoBuilder();
	}
	
	public PhoneTypeDaoBuilder setId(String id) {
		this.phoneTypeDao.setId(id);
		return this;
	}
	
	public PhoneTypeDaoBuilder setType(String type) {
		this.phoneTypeDao.setType(type);
		return this;
	}
	
	public PhoneTypeDao build() {
		return this.phoneTypeDao;
	}
	
}
