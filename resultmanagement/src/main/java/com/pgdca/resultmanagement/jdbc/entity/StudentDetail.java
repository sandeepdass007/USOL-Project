package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDetails")
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

	@Column(name = "sessionStart", nullable = false, length = 5)
	private Integer sessionStart;

	@Column(name = "sessionEnd", length = 5)
	private Integer sessionEnd;

	@Column(name = "studentTypeId", nullable = false, length = 10)
	private String studentTypeId;

	@Column(name = "courseId", nullable = false, length = 10)
	private String courseId;

	@Column(name = "contactDetailId", nullable = false, length = 50)
	private String contactDetailId;

	public StudentDetail() {
		super();
	}

	public StudentDetail(String enrollmentNo, String applicationNo, String parentDetailsId, String rollNo,
			String firstName, String middleName, String lastName, Integer sessionStart, Integer sessionEnd,
			String studentTypeId, String courseId, String contactDetailId) {
		super();
		this.enrollmentNo = enrollmentNo;
		this.applicationNo = applicationNo;
		this.parentDetailsId = parentDetailsId;
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.sessionStart = sessionStart;
		this.sessionEnd = sessionEnd;
		this.studentTypeId = studentTypeId;
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

	public Integer getSessionStart() {
		return sessionStart;
	}

	public void setSessionStart(Integer sessionStart) {
		this.sessionStart = sessionStart;
	}

	public Integer getSessionEnd() {
		return sessionEnd;
	}

	public void setSessionEnd(Integer sessionEnd) {
		this.sessionEnd = sessionEnd;
	}

	public String getStudentTypeId() {
		return studentTypeId;
	}

	public void setStudentTypeId(String studentTypeId) {
		this.studentTypeId = studentTypeId;
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
