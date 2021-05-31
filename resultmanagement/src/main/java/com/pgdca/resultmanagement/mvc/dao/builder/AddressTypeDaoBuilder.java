package com.pgdca.resultmanagement.mvc.dao.builder;

import com.pgdca.resultmanagement.mvc.dao.AddressTypeDao;

public class AddressTypeDaoBuilder {

	private AddressTypeDao addressTypeDao;
	
	private AddressTypeDaoBuilder() {
		this.addressTypeDao = new AddressTypeDao();
	}
	
	public static AddressTypeDaoBuilder getBuilder() {
		return new AddressTypeDaoBuilder();
	}
	
	public AddressTypeDaoBuilder setId(String id) {
		this.addressTypeDao.setId(id);
		return this;
	}
	
	public AddressTypeDaoBuilder setType(String type) {
		this.addressTypeDao.setType(type);
		return this;
	}
	
	public AddressTypeDao build() {
		return this.addressTypeDao;
	}
}
