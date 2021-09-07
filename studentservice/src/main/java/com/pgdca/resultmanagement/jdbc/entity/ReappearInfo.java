package com.pgdca.resultmanagement.jdbc.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ReappearInfo")
public class ReappearInfo {

	@Id
	@Column(name = "id", nullable = false, length = 50)
	private String id;

	@Column(name = "enrollmentNo", nullable = false, length = 15)
	private String enrollmentNo;

	@Column(name = "courseId", nullable = false, length = 10)
	private String courseId;

	@Column(name = "subjectId", nullable = false, length = 10)
	private String subjectId;

	// semester in which reappear exam attempted
	@Column(name = "semester", nullable = false, length = 2)
	private String semester;

	@Column(name = "marks", nullable = false, length = 5)
	private Integer marks;

	// session in which reappear exam attempted
	@Column(name = "session", nullable = false, length = 10)
	private Date session;

	@Column(name = "subjectDistributionRefId", nullable = false, length = 10)
	private String subjectDistributionRefId;

	public ReappearInfo() {
		super();
	}

	public ReappearInfo(String id, String enrollmentNo, String courseId, String subjectId, String semester,
			Integer marks, Date session, String subjectDistributionRefId) {
		super();
		this.id = id;
		this.enrollmentNo = enrollmentNo;
		this.courseId = courseId;
		this.subjectId = subjectId;
		this.semester = semester;
		this.marks = marks;
		this.session = session;
		this.subjectDistributionRefId = subjectDistributionRefId;
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

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Date getSession() {
		return session;
	}

	public void setSession(Date session) {
		this.session = session;
	}

	public String getSubjectDistributionRefId() {
		return subjectDistributionRefId;
	}

	public void setSubjectDistributionRefId(String subjectDistributionRefId) {
		this.subjectDistributionRefId = subjectDistributionRefId;
	}

}
