package com.pgdca.resultmanagement.chart.dao;

public class DistributionTypePercentageDao {

	private String type;
	private float percentage;

	public DistributionTypePercentageDao(String type, float percentage) {
		super();
		this.type = type;
		this.percentage = percentage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
