package com.pgdca.resultmanagement.mvc.dao.builder;

import com.pgdca.resultmanagement.mvc.dao.ContactDetailDao;
import com.pgdca.resultmanagement.mvc.dao.DateDao;
import com.pgdca.resultmanagement.mvc.dao.ParentDetailDao;
import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;

public class StudentDetailDaoBuilder {

	private StudentDetailDao studentDetailDao;
	
	private StudentDetailDaoBuilder() {
		this.studentDetailDao = new StudentDetailDao();
	}
	
	public static StudentDetailDaoBuilder getBuilder() {
		return new StudentDetailDaoBuilder();
	}
	
	public StudentDetailDaoBuilder setFirstName(String firstName) {
		this.studentDetailDao.setFirstName(firstName);
		return this;
	}
	
	public StudentDetailDaoBuilder setMiddleName(String middleName) {
		this.studentDetailDao.setMiddleName(middleName);
		return this;
	}
	
	public StudentDetailDaoBuilder setLastName(String lastName) {
		this.studentDetailDao.setLastName(lastName);
		return this;
	}
	
	public StudentDetailDaoBuilder setEnrollmentNo(String enrollmentNo) {
		this.studentDetailDao.setEnrollmentNo(enrollmentNo);
		return this;
	}
	
	public StudentDetailDaoBuilder setStudentType(String studentType) {
		this.studentDetailDao.setStudentType(studentType);
		return this;
	}
	
	public StudentDetailDaoBuilder setSessionStart(String sessionStart) {
		this.studentDetailDao.setSessionStart(sessionStart);
		return this;
	}
	
	public StudentDetailDaoBuilder setSessionEnd(String sessionEnd) {
		this.studentDetailDao.setSessionEnd(sessionEnd);
		return this;
	}
	
	public StudentDetailDaoBuilder setParentDetailDao(ParentDetailDao parentDetailDao) {
		this.studentDetailDao.setParentDetailDao(parentDetailDao);
		return this;
	}
	
	public StudentDetailDaoBuilder setContactDetailDao(ContactDetailDao contactDetailDao) {
		this.studentDetailDao.setContactDetailDao(contactDetailDao);
		return this;
	}
	
	public StudentDetailDaoBuilder setDateOfBirth(DateDao dateOfBirth) {
		this.studentDetailDao.setDateOfBirth(dateOfBirth);
		return this;
	}
	
	public StudentDetailDao build() {
		return this.studentDetailDao;
	}
}
