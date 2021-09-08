package com.pgdca.resultmanagement.chartservice.jdbc.entity;

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

	@Column(name = "overallMinMarks")
	private Integer overallMinMarks;

	@Column(name = "overallMaxMarks")
	private Integer overallMaxMarks;

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "code", nullable = false, length = 10)
	private String code;

	public SubjectInfo() {
		super();
	}

	public SubjectInfo(String id, String subjectDistributionId, Integer overallMinMarks, Integer overallMaxMarks,
			String name, String code) {
		super();
		this.id = id;
		this.subjectDistributionId = subjectDistributionId;
		this.overallMinMarks = overallMinMarks;
		this.overallMaxMarks = overallMaxMarks;
		this.name = name;
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubjectDistributionId() {
		return subjectDistributionId;
	}

	public void setSubjectDistributionId(String subjectDistributionId) {
		this.subjectDistributionId = subjectDistributionId;
	}

	public Integer getOverallMinMarks() {
		return overallMinMarks;
	}

	public void setOverallMinMarks(Integer overallMinMarks) {
		this.overallMinMarks = overallMinMarks;
	}

	public Integer getOverallMaxMarks() {
		return overallMaxMarks;
	}

	public void setOverallMaxMarks(Integer overallMaxMarks) {
		this.overallMaxMarks = overallMaxMarks;
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
