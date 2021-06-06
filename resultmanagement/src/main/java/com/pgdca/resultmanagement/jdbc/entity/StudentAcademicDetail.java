package com.pgdca.resultmanagement.jdbc.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentAcademicDetail")
public class StudentAcademicDetail {

	@Id
	@Column(name = "id", nullable = false, length = 50)
	private String id;

	@Column(name = "enrollmentNo", nullable = false, length = 15)
	private String enrollmentNo;

	@Column(name = "courseId", nullable = false, length = 10)
	private String courseId;

	@Column(name = "resultOutSession", nullable = false, length = 10)
	private Date resultOutSession;

	@Column(name = "resultOfSemester", nullable = false, length = 2)
	private Integer resultOfSemester;

	@Column(name = "resultStatusId", nullable = false, length = 50)
	private String resultStatusId;

	public StudentAcademicDetail() {
		super();
	}

	public StudentAcademicDetail(String id, String enrollmentNo, String courseId, Date resultOutSession,
			Integer resultOfSemester, String resultStatusId) {
		super();
		this.id = id;
		this.enrollmentNo = enrollmentNo;
		this.courseId = courseId;
		this.resultOutSession = resultOutSession;
		this.resultOfSemester = resultOfSemester;
		this.resultStatusId = resultStatusId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getResultOutSession() {
		return resultOutSession;
	}

	public void setResultOutSession(Date resultOutSession) {
		this.resultOutSession = resultOutSession;
	}

	public Integer getResultOfSemester() {
		return resultOfSemester;
	}

	public void setResultOfSemester(Integer resultOfSemester) {
		this.resultOfSemester = resultOfSemester;
	}

	public String getResultStatusId() {
		return resultStatusId;
	}

	public void setResultStatusId(String resultStatusId) {
		this.resultStatusId = resultStatusId;
	}

}
