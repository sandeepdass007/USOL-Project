package com.pgdca.resultmanagement.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ContactDetail")
public class ContactDetail {

	@Id
	@Column(name = "id", nullable = false, length = 50)
	private String Id;
	
	@Column(name = "phoneDetailId", nullable = false, length = 50)
	private String phoneDetailId;
	
	@Column(name = "addressId", nullable = false, length = 50)
	private String addressId;

	public ContactDetail() {
		super();
	}
	
	public ContactDetail(String id, String phoneDetailId, String addressId) {
		super();
		Id = id;
		this.phoneDetailId = phoneDetailId;
		this.addressId = addressId;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPhoneDetailId() {
		return phoneDetailId;
	}

	public void setPhoneDetailId(String phoneDetailId) {
		this.phoneDetailId = phoneDetailId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
}
