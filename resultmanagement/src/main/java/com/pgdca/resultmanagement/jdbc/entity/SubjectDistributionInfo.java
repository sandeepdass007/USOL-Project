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

	@Column(name = "subjectDistributionRefId", nullable = false, length = 50)
	private String subjectDistributionRefId;

	public SubjectDistributionInfo() {
		super();
	}

	public SubjectDistributionInfo(String id, String subjectDistributionRefId) {
		super();
		this.id = id;
		this.subjectDistributionRefId = subjectDistributionRefId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubjectDistributionRefId() {
		return subjectDistributionRefId;
	}

	public void setSubjectDistributionRefId(String subjectDistributionRefId) {
		this.subjectDistributionRefId = subjectDistributionRefId;
	}

}
