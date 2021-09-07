package com.pgdca.resultmanagement.mvc.dao;

public class PhoneDetailDao {

	private String phoneType;
	private Integer landlineExt;
	private Integer landlineNo;
	private Integer mobileCode;
	private String mobileNo;

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public Integer getLandlineExt() {
		return landlineExt;
	}

	public void setLandlineExt(Integer landlineExt) {
		this.landlineExt = landlineExt;
	}

	public Integer getLandlineNo() {
		return landlineNo;
	}

	public void setLandlineNo(Integer landlineNo) {
		this.landlineNo = landlineNo;
	}

	public Integer getMobileCode() {
		return mobileCode;
	}

	public void setMobileCode(Integer mobileCode) {
		this.mobileCode = mobileCode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
