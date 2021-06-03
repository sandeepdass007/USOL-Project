package com.pgdca.resultmanagement.jdbc.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pgdca.resultmanagement.jdbc.compositekey.ReappearCompKey;

@Entity
@Table(name = "ReappearInfo")
public class ReappearInfo {

	@EmbeddedId
	private ReappearCompKey reappearCompKey;
	
	@Column(name = "marks", nullable = false, length = 5)
	private Integer marks;
	
	// session in which reappear exam attempted
	@Column(name = "session", nullable = false, length = 10)
	private Date session;
	
	@Column(name = "reappearStatusId", length = 10)
	private String reappearStatusId;
	
	public ReappearInfo() {
		super();
	}

	public ReappearInfo(ReappearCompKey reappearCompKey, Integer marks, Date session, String reappearStatusId) {
		super();
		this.reappearCompKey = reappearCompKey;
		this.marks = marks;
		this.session = session;
		this.reappearStatusId = reappearStatusId;
	}

	public ReappearCompKey getReappearCompKey() {
		return reappearCompKey;
	}

	public void setReappearCompKey(ReappearCompKey reappearCompKey) {
		this.reappearCompKey = reappearCompKey;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Date getSession() {
		return session;
	}

	public void setSession(Date session) {
		this.session = session;
	}

	public String getReappearStatusId() {
		return reappearStatusId;
	}

	public void setReappearStatusId(String reappearStatusId) {
		this.reappearStatusId = reappearStatusId;
	}
}
