package com.pgdca.resultmanagement.chart.dao;

public class YearCourseWiseEnrollmentDao {

	private Long count;
	private String courseType;
	private Integer year;

	public YearCourseWiseEnrollmentDao() {
		super();
	}

	public YearCourseWiseEnrollmentDao(Long count, String courseType, Integer year) {
		super();
		this.count = count;
		this.courseType = courseType;
		this.year = year;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
