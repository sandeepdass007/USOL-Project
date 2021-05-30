package com.pgdca.resultmanagement.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.dto.ValidationResponse;
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
import com.pgdca.resultmanagement.mvc.dao.StudentProfileDao;

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

	public StudentProfileDao getStudentProfile(String username) {
		final StudentDetail studentDetail = studentDetailsJpaRepository.getStudentDetails(username);
		final StudentType studentType = studentTypeJpaRepository.getStudentType(studentDetail.getStudentTypeId());
		final ParentDetail parentDetail = parentDetailJpaRepository.getParentDetail(studentDetail.getParentDetailsId());
		final ContactDetail contactDetail = contactDetailJpaRepository.getContactDetail(studentDetail.getContactDetailId());
		final PhoneDetail phoneDetail = phoneDetailJpaRepository.getPhoneDetail(contactDetail.getPhoneDetailId());
		final PhoneType phoneType = phoneTypeJpaRepository.getPhoneType(phoneDetail.getPhoneTypeId());
		final AddressDetail addressDetail = addressDetailJpaRepository.getAddressDetail(contactDetail.getAddressId());
		final CityInfo cityInfo = cityInfoJpaRepository.getCityInfo(addressDetail.getCityId());
		final StateInfo stateInfo = stateInfoJpaRepository.getStateInfo(addressDetail.getStateId());
		final CountryInfo countryInfo = countryInfoJpaRepository.getCountryInfo(addressDetail.getCountryId());
		final StudentProfileDao studentProfileDao = new StudentProfileDao(studentDetail, addressDetail, contactDetail,
				parentDetail, studentType, phoneDetail, phoneType, cityInfo, stateInfo, countryInfo);
		return studentProfileDao;
	}
}
