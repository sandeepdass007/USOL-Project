package com.pgdca.resultmanagement.mvc.dao.builder;

import java.sql.Date;

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
	
	public StudentDetailDaoBuilder setSessionStart(Date sessionStart) {
		this.studentDetailDao.setSessionStart(sessionStart);
		return this;
	}
	
	public StudentDetailDaoBuilder setSessionEnd(Date sessionEnd) {
		this.studentDetailDao.setSessionEnd(sessionEnd);
		return this;
	}
	
	public StudentDetailDaoBuilder setEmailId(String emailId) {
		this.studentDetailDao.setEmailId(emailId);
		return this;
	}
	
	public StudentDetailDaoBuilder setUniversityRegNo(String universityRegNo) {
		this.studentDetailDao.setUniversityRegNo(universityRegNo);
		return this;
	}
	
	public StudentDetailDaoBuilder setCurrentSemester(Integer currentSemester) {
		this.studentDetailDao.setCurrentSemester(currentSemester);
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
