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
	
	@Column(name = "subjectTypeId", nullable = false, length = 10)
	private String subjectTypeId;
	
	@Column(name = "name", nullable = false, length = 30)
	private String name;
	
	@Column(name = "code", nullable = false, length = 10)
	private String code;
	
	@Column(name = "maxMarks", nullable = false, length = 3)
	private Integer maxMarks;
	
	@Column(name = "minMarks", nullable = false, length = 3)
	private Integer minMarks;
	
	public SubjectInfo() {
		super();
	}

	public SubjectInfo(String id, String subjectTypeId, String name, String code, Integer maxMarks, Integer minMarks) {
		super();
		this.id = id;
		this.subjectTypeId = subjectTypeId;
		this.name = name;
		this.code = code;
		this.maxMarks = maxMarks;
		this.minMarks = minMarks;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubjectTypeId() {
		return subjectTypeId;
	}

	public void setSubjectTypeId(String subjectTypeId) {
		this.subjectTypeId = subjectTypeId;
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

	public Integer getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(Integer maxMarks) {
		this.maxMarks = maxMarks;
	}

	public Integer getMinMarks() {
		return minMarks;
	}

	public void setMinMarks(Integer minMarks) {
		this.minMarks = minMarks;
	}
}
