package com.pgdca.resultmanagement.mvc.dao.builder;

import com.pgdca.resultmanagement.mvc.dao.AddressDetailDao;

public class AddressDetailDaoBuilder {

	private AddressDetailDao addressDetailDao;
	
	private AddressDetailDaoBuilder() {
		this.addressDetailDao = new AddressDetailDao();
	}
	
	public static AddressDetailDaoBuilder getBuilder() {
		return new AddressDetailDaoBuilder();
	}
	
	public AddressDetailDaoBuilder setType(String type) {
		this.addressDetailDao.setType(type);
		return this;
	}
	
	public AddressDetailDaoBuilder setBuildingHouseNo(String buildingHouseNo) {
		this.addressDetailDao.setBuildingHouseNo(buildingHouseNo);
		return this;
	}
	
	public AddressDetailDaoBuilder setLandmark(String landmark) {
		this.addressDetailDao.setLandmark(landmark);
		return this;
	}
	
	public AddressDetailDaoBuilder setPincode(String pincode) {
		this.addressDetailDao.setPincode(pincode);
		return this;
	}
	
	public AddressDetailDaoBuilder setCity(String city) {
		this.addressDetailDao.setCity(city);
		return this;
	}
	
	public AddressDetailDaoBuilder setState(String state) {
		this.addressDetailDao.setState(state);
		return this;
	}
	
	public AddressDetailDaoBuilder setCountry(String country) {
		this.addressDetailDao.setCountry(country);
		return this;
	}
	
	public AddressDetailDao build() {
		return this.addressDetailDao;
	}
}
