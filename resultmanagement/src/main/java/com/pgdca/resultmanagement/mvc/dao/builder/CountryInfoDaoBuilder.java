package com.pgdca.resultmanagement.mvc.dao.builder;

import com.pgdca.resultmanagement.mvc.dao.CountryInfoDao;

public class CountryInfoDaoBuilder {

	private CountryInfoDao countryInfoDao;
	
	private CountryInfoDaoBuilder() {
		this.countryInfoDao = new CountryInfoDao();
	}
	
	public static CountryInfoDaoBuilder geBuilder() {
		return new CountryInfoDaoBuilder();
	}
	
	public CountryInfoDaoBuilder setId(String id) {
		this.countryInfoDao.setId(id);
		return this;
	}
	
	public CountryInfoDaoBuilder setName(String name) {
		this.countryInfoDao.setName(name);
		return this;
	}
	
	public CountryInfoDao build() {
		return this.countryInfoDao;
	}
}
