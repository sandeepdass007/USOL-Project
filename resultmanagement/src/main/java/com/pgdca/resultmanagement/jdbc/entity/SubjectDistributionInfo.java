package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SubjectDistributionInfo")
public class SubjectDistributionInfo {

	@Id
	@Column(name = "id", nullable = false, length = 50)
	private String id;

	@Column(name = "subjectDistributionId", nullable = false, length = 50)
	private String subjectDistributionId;

	@Column(name = "subjectTypeId", nullable = false, length = 10)
	private String subjectTypeId;

	@Column(name = "maxMarks", nullable = false)
	private Integer maxMarks;

	@Column(name = "minMarks", nullable = false)
	private Integer minMarks;

	public SubjectDistributionInfo() {
		super();
	}

	public SubjectDistributionInfo(String id, String subjectDistributionRefId, String subjectTypeId,
			Integer maxMarks, Integer minMarks) {
		super();
		this.id = id;
		this.subjectDistributionId = subjectDistributionRefId;
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

	public String getSubjectDistributionRefId() {
		return subjectDistributionId;
	}

	public void setSubjectDistributionRefId(String subjectDistributionRefId) {
		this.subjectDistributionId = subjectDistributionRefId;
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
