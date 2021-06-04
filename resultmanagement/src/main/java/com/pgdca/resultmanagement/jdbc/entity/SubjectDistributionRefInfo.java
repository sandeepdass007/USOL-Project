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

	@Column(name = "subjectDistributionTypeId", nullable = false, length = 10)
	private String subjectDistributionTypeId;

	@Column(name = "maxMarks", nullable = false)
	private Integer maxMarks;

	@Column(name = "minMarks", nullable = true)
	private Integer minMarks;

	public SubjectDistributionRefInfo() {
		super();
	}

	public SubjectDistributionRefInfo(String id, String subjectDistributionTypeId, Integer maxMarks, Integer minMarks) {
		super();
		this.id = id;
		this.subjectDistributionTypeId = subjectDistributionTypeId;
		this.maxMarks = maxMarks;
		this.minMarks = minMarks;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubjectDistributionTypeId() {
		return subjectDistributionTypeId;
	}

	public void setSubjectDistributionTypeId(String subjectDistributionTypeId) {
		this.subjectDistributionTypeId = subjectDistributionTypeId;
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
