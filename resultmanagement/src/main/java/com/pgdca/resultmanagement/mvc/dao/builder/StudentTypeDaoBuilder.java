package com.pgdca.resultmanagement.mvc.dao.builder;

import com.pgdca.resultmanagement.mvc.dao.StudentTypeDao;

public class StudentTypeDaoBuilder {

	private StudentTypeDao studentTypeDao;
	
	private StudentTypeDaoBuilder() {
		this.studentTypeDao = new StudentTypeDao();
	}
	
	public static StudentTypeDaoBuilder getBuilder() {
		return new StudentTypeDaoBuilder();
	}
	
	public StudentTypeDaoBuilder setType(String type) {
		this.studentTypeDao.setType(type);
		return this;
	}
	
	public StudentTypeDaoBuilder setId(String id) {
		this.studentTypeDao.setId(id);
		return this;
	}
	
	public StudentTypeDao build() {
		return this.studentTypeDao;
	}
}
