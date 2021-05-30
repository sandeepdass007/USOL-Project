package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CourseInfo")
public class CourseInfo {

	@Id
	@Column(name = "id", nullable = false, length = 10)
	private String id;
	
	@Column(name = "courseName", nullable = false, length = 50)
	private String courseName;
	
	public CourseInfo() {
		super();
	}

	public CourseInfo(String id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
