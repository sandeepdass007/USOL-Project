package com.pgdca.resultmanagement.chartservice.jdbc.entity;

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

	@Column(name = "courseTypeId", nullable = false, length = 10)
	private String courseTypeId;

	@Column(name = "courseName", nullable = false, length = 50)
	private String courseName;

	@Column(name = "years", nullable = false, length = 2)
	private Integer years;

	@Column(name = "semesters", nullable = false, length = 2)
	private Integer semesters;

	public CourseInfo() {
		super();
	}

	public CourseInfo(String id, String courseTypeId, String courseName, Integer years, Integer semesters) {
		super();
		this.id = id;
		this.courseTypeId = courseTypeId;
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

	public String getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(String courseTypeId) {
		this.courseTypeId = courseTypeId;
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
