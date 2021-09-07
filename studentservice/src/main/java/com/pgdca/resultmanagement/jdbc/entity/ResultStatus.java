package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResultStatus")
public class ResultStatus {

	@Id
	@Column(name = "id", nullable = false, length = 50)
	private String id;
	
	@Column(name = "status", nullable = false, length = 15)
	private String status;
	
	public ResultStatus() {
		super();
	}

	public ResultStatus(String id, String status) {
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
