package com.pgdca.resultmanagement.jdbc.compositekey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CourseSubSemCompKey implements Serializable {

	private static final long serialVersionUID = 5822365667986206439L;

	@Column(name = "courseId", nullable = false, length = 10)
	private String courseId;
	
	@Column(name = "subjectId", nullable = false, length = 10)
	private String subjectId;
	
	@Column(name = "semester", nullable = false, length = 2)
	private Integer semester;
	
	public CourseSubSemCompKey() {
		super();
	}

	public CourseSubSemCompKey(String courseId, String subjectId, Integer semester) {
		super();
		this.courseId = courseId;
		this.subjectId = subjectId;
		this.semester = semester;
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

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}
}
