package com.pgdca.resultmanagement.mvc.dao.builder;

import java.util.List;

import com.pgdca.resultmanagement.mvc.dao.AddressDetailDao;
import com.pgdca.resultmanagement.mvc.dao.ContactDetailDao;
import com.pgdca.resultmanagement.mvc.dao.PhoneDetailDao;

public class ContactDetailDaoBuilder {

	private ContactDetailDao contactDetailDao;
	
	private ContactDetailDaoBuilder() {
		this.contactDetailDao = new ContactDetailDao();
	}
	
	public static ContactDetailDaoBuilder getBuilder() {
		return new ContactDetailDaoBuilder();
	}
	
	public ContactDetailDaoBuilder setPhoneDetailDaoList(List<PhoneDetailDao> phoneDetailDaoList) {
		this.contactDetailDao.setPhoneDetailDaoList(phoneDetailDaoList);
		return this;
	}
	
	public ContactDetailDaoBuilder setAddressDetailDaoList(List<AddressDetailDao> addressDetailDaoList) {
		this.contactDetailDao.setAddressDetailDaoList(addressDetailDaoList);
		return this;
	}
	
	public ContactDetailDao build() {
		return this.contactDetailDao;
	}
}
