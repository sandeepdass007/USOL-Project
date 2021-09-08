package com.pgdca.resultmanagement.chartservice.dao;

import java.io.Serializable;

public class DistributionTypePercentageDao implements Serializable {

	private static final long serialVersionUID = -8258227029483889461L;
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
