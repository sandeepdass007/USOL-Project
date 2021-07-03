package com.pgdca.resultmanagement.chart.dao;

import java.io.Serializable;

public class SubjectMarksDao implements Serializable {

	private static final long serialVersionUID = 1478974454493534435L;
	private String subjectName;
	private Integer marks;

	public SubjectMarksDao() {
		super();
	}

	public SubjectMarksDao(String subjectName, Integer marks) {
		super();
		this.subjectName = subjectName;
		this.marks = marks;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

}
