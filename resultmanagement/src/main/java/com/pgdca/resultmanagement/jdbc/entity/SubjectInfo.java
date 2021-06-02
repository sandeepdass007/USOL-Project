package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SubjectInfo")
public class SubjectInfo {

	@Id
	@Column(name = "id", nullable = false, length = 10)
	private String id;

	@Column(name = "subjectDistributionId", nullable = false, length = 10)
	private String subjectDistributionId;

	@Column(name = "name", nullable = false, length = 30)
	private String name;

	@Column(name = "code", nullable = false, length = 10)
	private String code;

	public SubjectInfo() {
		super();
	}

	public SubjectInfo(String id, String subjectTypeId, String name, String code) {
		super();
		this.id = id;
		this.subjectDistributionId = subjectTypeId;
		this.name = name;
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubjectTypeId() {
		return subjectDistributionId;
	}

	public void setSubjectTypeId(String subjectTypeId) {
		this.subjectDistributionId = subjectTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
