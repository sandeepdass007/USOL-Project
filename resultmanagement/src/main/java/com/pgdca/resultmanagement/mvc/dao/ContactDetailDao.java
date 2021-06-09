package com.pgdca.resultmanagement.mvc.dao;

import java.util.List;

public class ContactDetailDao {

	private List<PhoneDetailDao> phoneDetailDaoList;
	private List<AddressDetailDao> addressDetailDaoList;

	public List<PhoneDetailDao> getPhoneDetailDaoList() {
		return phoneDetailDaoList;
	}

	public void setPhoneDetailDaoList(List<PhoneDetailDao> phoneDetailDaoList) {
		this.phoneDetailDaoList = phoneDetailDaoList;
	}

	public List<AddressDetailDao> getAddressDetailDaoList() {
		return addressDetailDaoList;
	}

	public void setAddressDetailDaoList(List<AddressDetailDao> addressDetailDaoList) {
		this.addressDetailDaoList = addressDetailDaoList;
	}

}
