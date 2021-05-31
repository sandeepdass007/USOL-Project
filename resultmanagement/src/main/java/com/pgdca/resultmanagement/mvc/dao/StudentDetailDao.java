package com.pgdca.resultmanagement.mvc.dao;

public class StudentDetailDao {

	private String firstName;
	private String middleName;
	private String lastName;
	private String enrollmentNo;
	private String studentType;
	private String sessionStart;
	private String sessionEnd;

	private ParentDetailDao parentDetailDao;
	private ContactDetailDao contactDetailDao;
	private DateDao dateOfBirth;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public String getSessionStart() {
		return sessionStart;
	}

	public void setSessionStart(String sessionStart) {
		this.sessionStart = sessionStart;
	}

	public String getSessionEnd() {
		return sessionEnd;
	}

	public void setSessionEnd(String sessionEnd) {
		this.sessionEnd = sessionEnd;
	}

	public ParentDetailDao getParentDetailDao() {
		return parentDetailDao;
	}

	public void setParentDetailDao(ParentDetailDao parentDetailDao) {
		this.parentDetailDao = parentDetailDao;
	}

	public ContactDetailDao getContactDetailDao() {
		return contactDetailDao;
	}

	public void setContactDetailDao(ContactDetailDao contactDetailDao) {
		this.contactDetailDao = contactDetailDao;
	}

	public DateDao getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(DateDao dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
