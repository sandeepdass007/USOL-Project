package com.pgdca.resultmanagement.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.dto.ValidationResponse;
import com.pgdca.resultmanagement.mvc.dao.AddressDetailDao;
import com.pgdca.resultmanagement.mvc.dao.CityInfoDao;
import com.pgdca.resultmanagement.mvc.dao.ContactDetailDao;
import com.pgdca.resultmanagement.mvc.dao.CountryInfoDao;
import com.pgdca.resultmanagement.mvc.dao.ParentDetailDao;
import com.pgdca.resultmanagement.mvc.dao.PhoneDetailDao;
import com.pgdca.resultmanagement.mvc.dao.PhoneTypeDao;
import com.pgdca.resultmanagement.mvc.dao.StateInfoDao;
import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;
import com.pgdca.resultmanagement.mvc.dao.StudentTypeDao;

@Component
public class JpaRepository {

	@Autowired
	private CredentialsJpaRepository credJpaRepository;

	@Autowired
	private StudentDetailsJpaRepository studentDetailsJpaRepository;

	@Autowired
	private StudentTypeJpaRepository studentTypeJpaRepository;

	@Autowired
	private ParentDetailJpaRepository parentDetailJpaRepository;

	@Autowired
	private ContactDetailJpaRepository contactDetailJpaRepository;
	
	@Autowired
	private PhoneDetailJpaRepository phoneDetailJpaRepository;
	
	@Autowired
	private PhoneTypeJpaRepository phoneTypeJpaRepository;

	@Autowired
	private AddressDetailJpaRepository addressDetailJpaRepository;
	
	@Autowired
	private CityInfoJpaRepository cityInfoJpaRepository;
	
	@Autowired
	private StateInfoJpaRepository stateInfoJpaRepository;
	
	@Autowired
	private CountryInfoJpaRepository countryInfoJpaRepository;

	public ValidationResponse isUserValid(final String username, final String password) {
		boolean userValid = credJpaRepository.isUserValid(username, password);
		return new ValidationResponse(userValid, userValid ? null : "Invalid username or password");
	}

	public String getUserFullName(final String enrollmentNo) {
		return studentDetailsJpaRepository.getStudentFullName(enrollmentNo);
	}

	public StudentDetailDao getStudentDetailDao(String username) {
		
		StudentDetailDao studentDetailDao = studentDetailsJpaRepository.getStudentDetailDao(username, this);
		
//		final StudentDetail studentDetail = studentDetailsJpaRepository.getStudentDetails(username);
//		final StudentType studentType = studentTypeJpaRepository.getStudentType(studentDetail.getStudentTypeId());
//		final ParentDetail parentDetail = parentDetailJpaRepository.getParentDetail(studentDetail.getParentDetailsId());
//		final ContactDetail contactDetail = contactDetailJpaRepository.getContactDetail(studentDetail.getContactDetailId());
//		final List<PhoneDetail> phoneDetail = phoneDetailJpaRepository.getPhoneDetail(contactDetail.getPhoneDetailId());
//		final PhoneType phoneType = phoneTypeJpaRepository.getPhoneType(phoneDetail.getPhoneTypeId());
//		final AddressDetail addressDetail = addressDetailJpaRepository.getAddressDetail(contactDetail.getAddressId());
//		final CityInfo cityInfo = cityInfoJpaRepository.getCityInfo(addressDetail.getCityId());
//		final StateInfo stateInfo = stateInfoJpaRepository.getStateInfo(addressDetail.getStateId());
//		final CountryInfo countryInfo = countryInfoJpaRepository.getCountryInfo(addressDetail.getCountryId());
//		final StudentDetailsDao studentProfileDao = new StudentDetailsDao(studentDetail, addressDetail, contactDetail,
//				parentDetail, studentType, phoneDetail, phoneType, cityInfo, stateInfo, countryInfo);
//		return studentProfileDao;
		return studentDetailDao;
	}
	
	public ParentDetailDao getParentDetailDao(String parentDetailId) {
		ParentDetailDao parentDetailDao = parentDetailJpaRepository.getParentDetailDao(parentDetailId);
		return parentDetailDao;
	}
	
	public StudentTypeDao getStudentTypeDao(String studentTypeId) {
		StudentTypeDao studentTypeDao = studentTypeJpaRepository.getStudentTypeDao(studentTypeId);
		return studentTypeDao;
	}

	public ContactDetailDao getContactDetailDao(String contactDetailId) {
		ContactDetailDao contactDetailDao = contactDetailJpaRepository.getContactDetailDao(contactDetailId, this);
		return contactDetailDao;
	}

	public List<PhoneDetailDao> getPhoneDetailDaoList(String phoneDetailId) {
		List<PhoneDetailDao> phoneDetailDaoList = phoneDetailJpaRepository.getPhoneDetailDaoList(phoneDetailId, this);
		return phoneDetailDaoList;
	}

	public PhoneTypeDao getPhoneTypeDao(String phoneTypeId) {
		PhoneTypeDao phoneTypeDao = phoneTypeJpaRepository.getPhoneTypeDao(phoneTypeId);
		return phoneTypeDao;
	}

	public List<AddressDetailDao> getAddressDetailDaoList(String addressId) {
		List<AddressDetailDao> addressDetailDaoList = addressDetailJpaRepository.getAddressDetailDaoList(addressId, this);
		return addressDetailDaoList;
	}

	public CityInfoDao getCityInfoDao(String cityId) {
		CityInfoDao cityInfoDao = cityInfoJpaRepository.getCityInfoDao(cityId);
		return cityInfoDao;
	}

	public CountryInfoDao getCountryInfoDao(String countryId) {
		CountryInfoDao countryInfoDao = countryInfoJpaRepository.getCountryInfoDao(countryId);
		return countryInfoDao;
	}

	public StateInfoDao getStateInfoDao(String stateId) {
		StateInfoDao stateInfoDao = stateInfoJpaRepository.getStateInfoDao(stateId);
		return stateInfoDao;
	}
}
