package com.pgdca.resultmanagement.jdbc.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResultInfo")
public class ResultInfo {

	@Id
	@Column(name = "id", nullable = false, length = 50)
	private String id;

	@Column(name = "enrollmentNo", nullable = false, length = 10)
	private String enrollmentNo;

	@Column(name = "subjectId")
	private String subjectId;

	@Column(name = "subjectDistributionId", nullable = false, length = 10)
	private String subjectDistributionId;

	@Column(name = "resultStatusId", nullable = false, length = 10)
	private String resultStatusId;

	@Column(name = "resultOutSession", nullable = false)
	private Date resultOutSession;

	public ResultInfo() {
		super();
	}

	public ResultInfo(String id, String enrollmentNo, String subjectId, String subjectDistributionId,
			String resultStatusId, Date resultOutSession) {
		super();
		this.id = id;
		this.enrollmentNo = enrollmentNo;
		this.subjectId = subjectId;
		this.subjectDistributionId = subjectDistributionId;
		this.resultStatusId = resultStatusId;
		this.resultOutSession = resultOutSession;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectDistributionId() {
		return subjectDistributionId;
	}

	public void setSubjectDistributionId(String subjectDistributionId) {
		this.subjectDistributionId = subjectDistributionId;
	}

	public String getResultStatusId() {
		return resultStatusId;
	}

	public void setResultStatusId(String resultStatusId) {
		this.resultStatusId = resultStatusId;
	}

	public Date getResultOutSession() {
		return resultOutSession;
	}

	public void setResultOutSession(Date resultOutSession) {
		this.resultOutSession = resultOutSession;
	}

}
