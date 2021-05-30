package com.pgdca.resultmanagement.mvc.dao;

import com.pgdca.resultmanagement.jdbc.entity.AddressDetail;
import com.pgdca.resultmanagement.jdbc.entity.CityInfo;
import com.pgdca.resultmanagement.jdbc.entity.ContactDetail;
import com.pgdca.resultmanagement.jdbc.entity.CountryInfo;
import com.pgdca.resultmanagement.jdbc.entity.ParentDetail;
import com.pgdca.resultmanagement.jdbc.entity.PhoneDetail;
import com.pgdca.resultmanagement.jdbc.entity.PhoneType;
import com.pgdca.resultmanagement.jdbc.entity.StateInfo;
import com.pgdca.resultmanagement.jdbc.entity.StudentDetail;
import com.pgdca.resultmanagement.jdbc.entity.StudentType;

public class StudentProfileDao {

	private StudentDetail studentDetails;
	private AddressDetail addressDetails;
	private ContactDetail contactDetails;
	private ParentDetail parentDetails;
	private StudentType studentType;
	private PhoneDetail phoneDetails;
	private PhoneType phoneTypes;
	private CityInfo cityInfo;
	private StateInfo stateInfo;
	private CountryInfo countryInfo;

	public StudentProfileDao(StudentDetail studentDetails, AddressDetail addressDetails, ContactDetail contactDetails,
			ParentDetail parentDetails, StudentType studentType, PhoneDetail phoneDetails, PhoneType phoneTypes,
			CityInfo cityInfo, StateInfo stateInfo, CountryInfo countryInfo) {
		super();
		this.studentDetails = studentDetails;
		this.addressDetails = addressDetails;
		this.contactDetails = contactDetails;
		this.parentDetails = parentDetails;
		this.studentType = studentType;
		this.phoneDetails = phoneDetails;
		this.phoneTypes = phoneTypes;
		this.cityInfo = cityInfo;
		this.stateInfo = stateInfo;
		this.countryInfo = countryInfo;
	}

	public StudentDetail getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(StudentDetail studentDetails) {
		this.studentDetails = studentDetails;
	}

	public AddressDetail getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(AddressDetail addressDetails) {
		this.addressDetails = addressDetails;
	}

	public ContactDetail getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetail contactDetails) {
		this.contactDetails = contactDetails;
	}

	public ParentDetail getParentDetails() {
		return parentDetails;
	}

	public void setParentDetails(ParentDetail parentDetails) {
		this.parentDetails = parentDetails;
	}

	public StudentType getStudentType() {
		return studentType;
	}

	public void setStudentType(StudentType studentType) {
		this.studentType = studentType;
	}

	public PhoneDetail getPhoneDetails() {
		return phoneDetails;
	}

	public void setPhoneDetails(PhoneDetail phoneDetails) {
		this.phoneDetails = phoneDetails;
	}

	public PhoneType getPhoneTypes() {
		return phoneTypes;
	}

	public void setPhoneTypes(PhoneType phoneTypes) {
		this.phoneTypes = phoneTypes;
	}

	public CityInfo getCityInfo() {
		return cityInfo;
	}

	public void setCityInfo(CityInfo cityInfo) {
		this.cityInfo = cityInfo;
	}

	public StateInfo getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(StateInfo stateInfo) {
		this.stateInfo = stateInfo;
	}

	public CountryInfo getCountryInfo() {
		return countryInfo;
	}

	public void setCountryInfo(CountryInfo countryInfo) {
		this.countryInfo = countryInfo;
	}
}
