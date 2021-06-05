package com.pgdca.resultmanagement.jpa;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.chart.dao.YearCourseWiseEnrollmentDao;
import com.pgdca.resultmanagement.dto.ValidationResponse;
import com.pgdca.resultmanagement.mvc.dao.AddressDetailDao;
import com.pgdca.resultmanagement.mvc.dao.AddressTypeDao;
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
	private CourseInfoJpaRepository courseInfoJpaRepository;

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
	private AddressTypeJpaRepository addressTypeJpaRepository;
	
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

	public AddressTypeDao getAddressTypeDao(String addressTypeId) {
		final AddressTypeDao addressType = addressTypeJpaRepository.getAddressTypeDao(addressTypeId, this);
		return addressType;
	}

	public HashMap<String, Long> getCourseWiseStudentEnrollment() {
		HashMap<String, Long> map = new HashMap<String, Long>();
		final List<Object[]> courseWiseStudentEnrollment = courseInfoJpaRepository.getCourseWiseStudentEnrollment();
		for(Object[] entry : courseWiseStudentEnrollment) {
			Long count = (Long)entry[0];
			String courseName = (String)entry[1];
			map.put(courseName, count);
		}
		return map;
	}
	
	public List<YearCourseWiseEnrollmentDao> getCourseTypeWiseEnrollment() {
		List<YearCourseWiseEnrollmentDao> list = new LinkedList<YearCourseWiseEnrollmentDao>();
		final List<Object[]> courseTypeWiseEnrollment = courseInfoJpaRepository.getCourseTypeWiseEnrollment();
		
		for(Object[] entry : courseTypeWiseEnrollment) {
			Long count = (Long)entry[0];
			String courseType = (String)entry[1];
			Integer year = Integer.parseInt((String)entry[2]);
			list.add(new YearCourseWiseEnrollmentDao(count, courseType, year));
		}
		return list;
	}
}
