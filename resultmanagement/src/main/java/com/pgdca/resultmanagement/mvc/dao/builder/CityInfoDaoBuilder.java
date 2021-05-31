package com.pgdca.resultmanagement.mvc.dao.builder;

import com.pgdca.resultmanagement.mvc.dao.CityInfoDao;

public class CityInfoDaoBuilder {

	private CityInfoDao cityInfoDao;
	
	private CityInfoDaoBuilder() {
		this.cityInfoDao = new CityInfoDao();
	}
	
	public static CityInfoDaoBuilder getBuilder() {
		return new CityInfoDaoBuilder();
	}
	
	public CityInfoDaoBuilder setId(String id) {
		this.cityInfoDao.setId(id);
		return this;
	}
	
	public CityInfoDaoBuilder setName(String name) {
		this.cityInfoDao.setName(name);
		return this;
	}
	
	public CityInfoDao build() {
		return this.cityInfoDao;
	}
}
