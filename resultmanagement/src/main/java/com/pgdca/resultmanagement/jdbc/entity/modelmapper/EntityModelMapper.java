package com.pgdca.resultmanagement.jdbc.entity.modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.jdbc.entity.AddressDetail;
import com.pgdca.resultmanagement.jdbc.entity.AddressType;
import com.pgdca.resultmanagement.jdbc.entity.CityInfo;
import com.pgdca.resultmanagement.jdbc.entity.ContactDetail;
import com.pgdca.resultmanagement.jdbc.entity.CountryInfo;
import com.pgdca.resultmanagement.jdbc.entity.Credentials;
import com.pgdca.resultmanagement.jdbc.entity.ParentDetail;
import com.pgdca.resultmanagement.jdbc.entity.PhoneDetail;
import com.pgdca.resultmanagement.jdbc.entity.PhoneType;
import com.pgdca.resultmanagement.jdbc.entity.StateInfo;
import com.pgdca.resultmanagement.jdbc.entity.StudentDetail;
import com.pgdca.resultmanagement.jdbc.entity.StudentType;
import com.pgdca.resultmanagement.mvc.dao.AddressDetailDao;
import com.pgdca.resultmanagement.mvc.dao.AddressTypeDao;
import com.pgdca.resultmanagement.mvc.dao.CityInfoDao;
import com.pgdca.resultmanagement.mvc.dao.ContactDetailDao;
import com.pgdca.resultmanagement.mvc.dao.CountryInfoDao;
import com.pgdca.resultmanagement.mvc.dao.CredentialsDao;
import com.pgdca.resultmanagement.mvc.dao.ParentDetailDao;
import com.pgdca.resultmanagement.mvc.dao.PhoneDetailDao;
import com.pgdca.resultmanagement.mvc.dao.PhoneTypeDao;
import com.pgdca.resultmanagement.mvc.dao.StateInfoDao;
import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;
import com.pgdca.resultmanagement.mvc.dao.StudentTypeDao;

@Component
public class EntityModelMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private StudentEntityModelMapper studentEntityModelMapperBean;
	
	@Autowired
	private ContactDetailEntityModelMapper contactEntityModelMapper;
	
	@Autowired
	private AddressDetailEntityModelMapper addressDetailEntityModelMapper;
	
	@Autowired
	private PhoneDetailEntityModelMapper phoneDetailEntityModelMapper;
	
	public StudentDetailDao mapStudentEntityToDao(StudentDetail studentDetail) {
		return studentEntityModelMapperBean.map(studentDetail);
	}

	public AddressDetailDao mapAddressEntityToDao(AddressDetail addressDetail) {
		return addressDetailEntityModelMapper.map(addressDetail);
	}

	public AddressTypeDao mapAddressTypeEntityToDao(AddressType addressType) {
		return modelMapper.map(addressType, AddressTypeDao.class);
	}

	public CityInfoDao mapCityInfoEntityToDao(CityInfo cityInfo) {
		return modelMapper.map(cityInfo, CityInfoDao.class);
	}

	public CountryInfoDao mapCountryInfoToDao(CountryInfo countryInfo) {
		return modelMapper.map(countryInfo, CountryInfoDao.class);
	}

	public CredentialsDao mapCredentialsToDao(Credentials credentials) {
		return modelMapper.map(credentials, CredentialsDao.class);
	}

	public ParentDetailDao mapParentDetailToDao(ParentDetail parentDetail) {
		return modelMapper.map(parentDetail, ParentDetailDao.class);
	}

	public PhoneTypeDao mapPhoneTypeToDao(PhoneType phoneType) {
		return modelMapper.map(phoneType, PhoneTypeDao.class);
	}

	public StateInfoDao mapStateInfoToDao(StateInfo stateInfo) {
		return modelMapper.map(stateInfo, StateInfoDao.class);
	}

	public StudentTypeDao mapStudentTypeToDao(StudentType studentType) {
		return modelMapper.map(studentType, StudentTypeDao.class);
	}

	public ContactDetailDao mapContactDetailEntityToDao(ContactDetail contactDetail) {
		return contactEntityModelMapper.map(contactDetail);
	}

	public PhoneDetailDao mapPhoneDetailEntityToDao(PhoneDetail phoneDetail) {
		return phoneDetailEntityModelMapper.map(phoneDetail);
	}
}
