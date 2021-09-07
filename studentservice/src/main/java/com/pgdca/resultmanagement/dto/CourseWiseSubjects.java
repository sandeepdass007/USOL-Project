package com.pgdca.resultmanagement.dto;

import java.util.ArrayList;
import java.util.List;

public class CourseWiseSubjects {

	private String courseId;
	private String courseName;
	private List<String> subjects;

	public CourseWiseSubjects() {
		super();
		this.subjects = new ArrayList<String>();
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

}
