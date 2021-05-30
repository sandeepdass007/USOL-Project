package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ParentDetails")
public class ParentDetails {

	@Id
	@Column(name = "id", nullable = false, length = 50)
	private String id;
	
	@Column(name = "fatherName", nullable = false, length = 30)
	private String fatherName;
	
	@Column(name = "motherName", nullable = false, length = 30)
	private String motherName;
	
	@Column(name = "fatherOccupation", length = 30)
	private String fatherOccupation;
	
	@Column(name = "motherOccupation", length = 30)
	private String motherOccupation;
	
	public ParentDetails() {
		super();
	}

	public ParentDetails(String id, String fatherName, String motherName, String fatherOccupation,
			String motherOccupation) {
		super();
		this.id = id;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.fatherOccupation = fatherOccupation;
		this.motherOccupation = motherOccupation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
}
