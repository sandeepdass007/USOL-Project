package com.pgdca.resultmanagement.chartservice.dao;

import java.io.Serializable;

public class SemDistributionTypeMarksDao implements Serializable {

	private static final long serialVersionUID = -3087314835191508128L;
	private String type;
	private Integer marks;
	private Integer semester;

	public SemDistributionTypeMarksDao(String type, Integer marks, Integer semester) {
		super();
		this.type = type;
		this.marks = marks;
		this.semester = semester;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

}
