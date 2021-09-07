package com.pgdca.resultmanagement.jdbc.compositekey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ReappearCompKey implements Serializable{

	private static final long serialVersionUID = -3982486159871654770L;

	@Column(name = "enrollmentNo", nullable = false, length = 15)
	private String enrollmentNo;
	
	@Column(name = "courseId", nullable = false, length = 10)
	private String courseId;
	
	@Column(name = "subjectId", nullable = false, length = 10)
	private String subjectId;
	
	// semester in which reappear exam attempted
	@Column(name = "semester", nullable = false, length = 2)
	private String semester;
	
	public ReappearCompKey() {
		super();
	}

	public ReappearCompKey(String enrollmentNo, String courseId, String subjectId, String semester) {
		super();
		this.enrollmentNo = enrollmentNo;
		this.courseId = courseId;
		this.subjectId = subjectId;
		this.semester = semester;
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

	public final String getSemester() {
		return semester;
	}

	public final void setSemester(String semester) {
		this.semester = semester;
	}
}
