package com.pgdca.resultmanagement.jdbc.compositekey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CourseSubEnrollNoCompKey implements Serializable {

	private static final long serialVersionUID = -3137746950448802072L;

	@Column(name = "enrollmentNo", nullable = false, length = 15)
	private String enrollmentNo;
	
	@Column(name = "courseId", nullable = false, length = 10)
	private String courseId;
	
	@Column(name = "subjectId", nullable = false, length = 10)
	private String subjectId;
	
	public CourseSubEnrollNoCompKey() {
		super();
	}

	public CourseSubEnrollNoCompKey(String enrollmentNo, String courseId, String subjectId) {
		super();
		this.enrollmentNo = enrollmentNo;
		this.courseId = courseId;
		this.subjectId = subjectId;
	}

	public final String getEnrollmentNo() {
		return enrollmentNo;
	}

	public final void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public final String getCourseId() {
		return courseId;
	}

	public final void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public final String getSubjectId() {
		return subjectId;
	}

	public final void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
}
