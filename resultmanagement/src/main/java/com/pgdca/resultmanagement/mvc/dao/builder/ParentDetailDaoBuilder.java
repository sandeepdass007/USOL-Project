package com.pgdca.resultmanagement.mvc.dao.builder;

import com.pgdca.resultmanagement.mvc.dao.ParentDetailDao;

public class ParentDetailDaoBuilder {

	private ParentDetailDao parentDetailDao;
	
	private ParentDetailDaoBuilder() {
		this.parentDetailDao = new ParentDetailDao();
	}
	
	public static ParentDetailDaoBuilder getBuilder() {
		return new ParentDetailDaoBuilder();
	}
	
	public ParentDetailDaoBuilder setFatherName(String fatherName) {
		this.parentDetailDao.setFatherName(fatherName);
		return this;
	}
	
	public ParentDetailDaoBuilder setMotherName(String motherName) {
		this.parentDetailDao.setMotherName(motherName);
		return this;
	}
	
	public ParentDetailDaoBuilder setFatherOccupation(String fatherOccupation) {
		this.parentDetailDao.setFatherOccupation(fatherOccupation);
		return this;
	}
	
	public ParentDetailDaoBuilder setMotherOccupation(String motherOccupation) {
		this.parentDetailDao.setMotherOccupation(motherOccupation);
		return this;
	}
	
	public ParentDetailDao build() {
		return this.parentDetailDao;
	}
}
