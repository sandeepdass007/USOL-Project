package com.pgdca.resultmanagement.mvc.dao.builder;

import com.pgdca.resultmanagement.mvc.dao.StateInfoDao;

public class StateInfoDaoBuilder {

	private StateInfoDao stateInfoDao;
	
	private StateInfoDaoBuilder() {
		this.stateInfoDao = new StateInfoDao();
	}
	
	public static StateInfoDaoBuilder getBuilder() {
		return new StateInfoDaoBuilder();
	}
	
	public StateInfoDaoBuilder setId(String id) {
		this.stateInfoDao.setId(id);
		return this;
	}
	
	public StateInfoDaoBuilder setName(String name) {
		this.stateInfoDao.setName(name);
		return this;
	}
	
	public StateInfoDao build() {
		return this.stateInfoDao;
	}
}
