package com.pgdca.resultmanagement.rest.dao;

public class Select2ResponseResultsDao {

	private String id;
	private String text;

	public Select2ResponseResultsDao() {
		super();
	}

	public Select2ResponseResultsDao(String id, String text) {
		super();
		this.id = id;
		this.text = text;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
