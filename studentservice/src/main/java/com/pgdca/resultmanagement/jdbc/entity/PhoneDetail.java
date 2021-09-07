package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhoneDetail")
public class PhoneDetail {

	@Id
	@Column(name = "id", nullable = false, length = 50)
	private String id;
	
	@Column(name = "phoneDetailId", nullable = false, length = 50)
	private String phoneDetailId;
	
	@Column(name = "phoneTypeId", nullable = false, length = 50)
	private String phoneTypeId;
	
	@Column(name = "landlineExt", length = 10)
	private Integer landlineExt;
	
	@Column(name = "landlineNo", length = 10)
	private Integer landlineNo;
	
	@Column(name = "mobileCode", nullable = false, length = 5)
	private Integer mobileCode;
	
	@Column(name = "mobileNo", nullable = false, length = 15)
	private String mobileNo;
	
	public PhoneDetail() {
		super();
	}

	public PhoneDetail(String id, String phoneTypeId, Integer landlineExt, Integer landlineNo, Integer mobileCode,
			String mobileNo) {
		super();
		this.id = id;
		this.phoneTypeId = phoneTypeId;
		this.landlineExt = landlineExt;
		this.landlineNo = landlineNo;
		this.mobileCode = mobileCode;
		this.mobileNo = mobileNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneTypeId() {
		return phoneTypeId;
	}

	public void setPhoneTypeId(String phoneTypeId) {
		this.phoneTypeId = phoneTypeId;
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
