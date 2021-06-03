package com.pgdca.resultmanagement.jdbc.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pgdca.resultmanagement.jdbc.compositekey.CourseSubEnrollNoCompKey;

@Entity
@Table(name = "MasterMarks")
public class MasterMarks {

	@EmbeddedId
	private CourseSubEnrollNoCompKey courseSubEnrollNoCompKey;
	
	@Column(name = "marks", length = 5)
	private Integer marks;
	
	@Column(name = "session", nullable = false, length = 10)
	private Date session;
	
	@Column(name = "reappearStatusId", length = 50)
	private String reappearStatusId;
	
	public MasterMarks() {
		super();
	}

	public MasterMarks(CourseSubEnrollNoCompKey courseSubEnrollNoCompKey, Integer marks, Date session,
			String reappearStatusId) {
		super();
		this.courseSubEnrollNoCompKey = courseSubEnrollNoCompKey;
		this.marks = marks;
		this.session = session;
		this.reappearStatusId = reappearStatusId;
	}

	public CourseSubEnrollNoCompKey getCourseSubEnrollNoCompKey() {
		return courseSubEnrollNoCompKey;
	}

	public void setCourseSubEnrollNoCompKey(CourseSubEnrollNoCompKey courseSubEnrollNoCompKey) {
		this.courseSubEnrollNoCompKey = courseSubEnrollNoCompKey;
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

	public String getReappearStatusId() {
		return reappearStatusId;
	}

	public void setReappearStatusId(String reappearStatusId) {
		this.reappearStatusId = reappearStatusId;
	}
}
