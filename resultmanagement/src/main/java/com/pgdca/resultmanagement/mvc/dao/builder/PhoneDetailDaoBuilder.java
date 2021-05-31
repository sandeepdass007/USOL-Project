package com.pgdca.resultmanagement.mvc.dao.builder;

import com.pgdca.resultmanagement.mvc.dao.PhoneDetailDao;

public class PhoneDetailDaoBuilder {

	private PhoneDetailDao phoneDetailDao;
	
	private PhoneDetailDaoBuilder() {
		this.phoneDetailDao = new PhoneDetailDao();
	}
	
	public static PhoneDetailDaoBuilder getBuilder() {
		return new PhoneDetailDaoBuilder();
	}
	
	public PhoneDetailDaoBuilder setPhoneType(String phoneType) {
		this.phoneDetailDao.setPhoneType(phoneType);
		return this;
	}
	
	public PhoneDetailDaoBuilder setLandlineExt(Integer landlineExt) {
		this.phoneDetailDao.setLandlineExt(landlineExt);
		return this;
	}
	
	public PhoneDetailDaoBuilder setLandlineNo(Integer landlineNo) {
		this.phoneDetailDao.setLandlineNo(landlineNo);
		return this;
	}
	
	public PhoneDetailDaoBuilder setMobileCode(Integer mobileCode) {
		this.phoneDetailDao.setMobileCode(mobileCode);
		return this;
	}
	
	public PhoneDetailDaoBuilder setMobileNo(String mobileNo) {
		this.phoneDetailDao.setMobileNo(mobileNo);
		return this;
	}
	
	public PhoneDetailDao build() {
		return this.phoneDetailDao;
	}
}
