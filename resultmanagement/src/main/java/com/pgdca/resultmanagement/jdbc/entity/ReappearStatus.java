package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ReappearStatus")
public class ReappearStatus {

	@Id
	@Column(name = "id", nullable = false, length = 10)
	private String id;
	
	@Column(name = "status", nullable = false, length = 15)
	private String status;
	
	public ReappearStatus() {
		super();
	}

	public ReappearStatus(String id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
