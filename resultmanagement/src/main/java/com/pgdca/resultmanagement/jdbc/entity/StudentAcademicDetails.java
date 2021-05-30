package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentAcademicDetails")
public class StudentAcademicDetails {

	@Id
	@Column(name = "enrollmentNo", nullable = false, length = 15)
	private String enrollmentNo;
	
	@Column(name = "courseId", nullable = false, length = 10)
	private String courseId;
	
	@Column(name = "session", nullable = false, length = 10)
	private String session;
	
	@Column(name = "semester", nullable = false, length = 2)
	private Integer semester;
	
	@Column(name = "resultStatusId", nullable = false, length = 50)
	private String resultStatusId;
	
	public StudentAcademicDetails() {
		super();
	}

	public StudentAcademicDetails(String enrollmentNo, String courseId, String session, Integer semester,
			String resultStatusId) {
		super();
		this.enrollmentNo = enrollmentNo;
		this.courseId = courseId;
		this.session = session;
		this.semester = semester;
		this.resultStatusId = resultStatusId;
	}

	public String getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public String getResultStatusId() {
		return resultStatusId;
	}

	public void setResultStatusId(String resultStatusId) {
		this.resultStatusId = resultStatusId;
	}
}
