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
	
	@Column(name = "years", nullable = false, length = 2)
	private Integer years;
	
	@Column(name = "semesters", nullable = false, length = 2)
	private Integer semesters;
	
	public CourseInfo() {
		super();
	}

	public CourseInfo(String id, String courseName, Integer years, Integer semesters) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.years = years;
		this.semesters = semesters;
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

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Integer getSemesters() {
		return semesters;
	}

	public void setSemesters(Integer semesters) {
		this.semesters = semesters;
	}
}
