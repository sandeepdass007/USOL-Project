package com.pgdca.resultmanagement.jdbc.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDetail")
public class StudentDetail {

	@Id
	@Column(name = "enrollmentNo", nullable = false, length = 15)
	private String enrollmentNo;

	@Column(name = "applicationNo", nullable = false, length = 15)
	private String applicationNo;

	@Column(name = "parentDetailsId", nullable = false, length = 50)
	private String parentDetailsId;

	@Column(name = "rollNo", length = 10)
	private String rollNo;

	@Column(name = "firstName", nullable = false, length = 15)
	private String firstName;

	@Column(name = "middleName", length = 15)
	private String middleName;

	@Column(name = "lastName", length = 15)
	private String lastName;

	@Column(name = "dateOfBirth", nullable = false)
	private Date dateOfBirth;

	@Column(name = "emailId", nullable = false)
	private String emailId;

	@Column(name = "sessionStart", nullable = false, length = 5)
	private Date sessionStart;

	@Column(name = "sessionEnd", length = 5)
	private Date sessionEnd;

	@Column(name = "studentTypeId", nullable = false, length = 10)
	private String studentTypeId;

	@Column(name = "universityRegNo", nullable = false, length = 20)
	private String universityRegNo;

	@Column(name = "courseId", nullable = false, length = 10)
	private String courseId;

	@Column(name = "contactDetailId", nullable = false, length = 50)
	private String contactDetailId;

	public StudentDetail() {
		super();
	}

	public StudentDetail(String enrollmentNo, String applicationNo, String parentDetailsId, String rollNo,
			String firstName, String middleName, String lastName, Date dateOfBirth, String emailId, Date sessionStart,
			Date sessionEnd, String studentTypeId, String universityRegNo, String courseId, String contactDetailId) {
		super();
		this.enrollmentNo = enrollmentNo;
		this.applicationNo = applicationNo;
		this.parentDetailsId = parentDetailsId;
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.emailId = emailId;
		this.sessionStart = sessionStart;
		this.sessionEnd = sessionEnd;
		this.studentTypeId = studentTypeId;
		this.universityRegNo = universityRegNo;
		this.courseId = courseId;
		this.contactDetailId = contactDetailId;
	}

	public String getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getParentDetailsId() {
		return parentDetailsId;
	}

	public void setParentDetailsId(String parentDetailsId) {
		this.parentDetailsId = parentDetailsId;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getSessionStart() {
		return sessionStart;
	}

	public void setSessionStart(Date sessionStart) {
		this.sessionStart = sessionStart;
	}

	public Date getSessionEnd() {
		return sessionEnd;
	}

	public void setSessionEnd(Date sessionEnd) {
		this.sessionEnd = sessionEnd;
	}

	public String getStudentTypeId() {
		return studentTypeId;
	}

	public void setStudentTypeId(String studentTypeId) {
		this.studentTypeId = studentTypeId;
	}

	public String getUniversityRegNo() {
		return universityRegNo;
	}

	public void setUniversityRegNo(String universityRegNo) {
		this.universityRegNo = universityRegNo;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getContactDetailId() {
		return contactDetailId;
	}

	public void setContactDetailId(String contactDetailId) {
		this.contactDetailId = contactDetailId;
	}

}
