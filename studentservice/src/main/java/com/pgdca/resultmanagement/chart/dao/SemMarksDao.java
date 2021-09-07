package com.pgdca.resultmanagement.chart.dao;

import java.io.Serializable;

public class SemMarksDao implements Serializable{
	private static final long serialVersionUID = 8949572231726552916L;
	private Integer semester;
	private Float marks;

	public SemMarksDao(Integer semester, Float marks) {
		super();
		this.semester = semester;
		this.marks = marks;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public Float getMarks() {
		return marks;
	}

	public void setMarks(Float marks) {
		this.marks = marks;
	}

}
