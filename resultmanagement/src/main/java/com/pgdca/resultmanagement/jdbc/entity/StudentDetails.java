package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDetails")
public class StudentDetails {

	@Id
	@Column(name = "enrollmentNo", nullable = false)
	private String enrollmentNo;
	
	@Column(name = "applicationNo", nullable = false)
	private String applicationNo;
	
	@Column(name = "parentDetailsId", nullable = false)
	private String parentDetailsId;
	
	@Column(name = "rollNo")
	private String rollNo;
	
	@Column(name = "firstName", nullable = false)
	private String firstName;
	
	@Column(name = "middleName")
	private String middleName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "studentTypeId", nullable = false)
	private String studentTypeId;
	
	@Column(name = "courseId", nullable = false)
	private String courseId;
	
	public StudentDetails() {
		super();
	}

	public StudentDetails(String enrollmentNo, String applicationNo, String parentDetailsId, String rollNo,
			String firstName, String middleName, String lastName, String studentTypeId, String courseId) {
		super();
		this.enrollmentNo = enrollmentNo;
		this.applicationNo = applicationNo;
		this.parentDetailsId = parentDetailsId;
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.studentTypeId = studentTypeId;
		this.courseId = courseId;
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
}
