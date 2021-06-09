package com.pgdca.resultmanagement.mvc.dao;

public class AddressDetailDao {

	private String type;
	private String buildingHouseNo;
	private String landmark;
	private String pincode;
	private String city;
	private String state;
	private String country;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBuildingHouseNo() {
		return buildingHouseNo;
	}

	public void setBuildingHouseNo(String buildingHouseNo) {
		this.buildingHouseNo = buildingHouseNo;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
