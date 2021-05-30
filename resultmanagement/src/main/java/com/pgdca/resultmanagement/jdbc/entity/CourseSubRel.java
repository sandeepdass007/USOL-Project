package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pgdca.resultmanagement.jdbc.compositekey.CourseSubSemCompKey;

@Entity
@Table(name = "CourseSubRel")
public class CourseSubRel {

	@EmbeddedId
	private CourseSubSemCompKey courseSubSemCompKey;
	
	public CourseSubRel() {
		super();
	}

	public CourseSubRel(CourseSubSemCompKey courseSubSemCompKey) {
		super();
		this.courseSubSemCompKey = courseSubSemCompKey;
	}

	public CourseSubSemCompKey getCourseSubSemCompKey() {
		return courseSubSemCompKey;
	}

	public void setCourseSubSemCompKey(CourseSubSemCompKey courseSubSemCompKey) {
		this.courseSubSemCompKey = courseSubSemCompKey;
	}
}
