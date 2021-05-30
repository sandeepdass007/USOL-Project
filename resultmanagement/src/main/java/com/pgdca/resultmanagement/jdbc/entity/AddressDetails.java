package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AddressDetails")
public class AddressDetails {

	@Id
	@Column(name = "id", nullable = false, length = 50)
	private String id;
	
	@Column(name = "buildingHouseNo", nullable = false, length = 30)
	private String buildingHouseNo;
	
	@Column(name = "landmark", nullable = false, length = 30)
	private String landmark;
	
	@Column(name = "pincode", nullable = false, length = 10)
	private String pincode;
	
	@Column(name = "cityId", nullable = false, length = 10)
	private String cityId;
	
	@Column(name = "countryId", nullable = false, length = 10)
	private String countryId;
	
	public AddressDetails() {
		super();
	}
	
	public AddressDetails(String id, String buildingHouseNo, String landmark, String pincode, String cityId,
			String countryId) {
		super();
		this.id = id;
		this.buildingHouseNo = buildingHouseNo;
		this.landmark = landmark;
		this.pincode = pincode;
		this.cityId = cityId;
		this.countryId = countryId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
}
