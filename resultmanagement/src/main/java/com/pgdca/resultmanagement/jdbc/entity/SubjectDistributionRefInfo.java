package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SubjectDistributionRefInfo")
public class SubjectDistributionRefInfo {

	@Id
	@Column(name = "id", nullable = false, length = 50)
	private String id;

	@Column(name = "subjectTypeId", nullable = false, length = 10)
	private String subjectTypeId;

	@Column(name = "maxMarks", nullable = false)
	private Integer maxMarks;

	@Column(name = "minMarks", nullable = false)
	private Integer minMarks;

	public SubjectDistributionRefInfo() {
		super();
	}

	public SubjectDistributionRefInfo(String id, String subjectTypeId, Integer maxMarks, Integer minMarks) {
		super();
		this.id = id;
		this.subjectTypeId = subjectTypeId;
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
