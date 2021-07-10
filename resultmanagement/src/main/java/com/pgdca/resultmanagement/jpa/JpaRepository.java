package com.pgdca.resultmanagement.jpa;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.chart.dao.DistributionTypePercentageDao;
import com.pgdca.resultmanagement.chart.dao.SemDistributionTypeMarksDao;
import com.pgdca.resultmanagement.chart.dao.SemMarksDao;
import com.pgdca.resultmanagement.chart.dao.SubjectMarksDao;
import com.pgdca.resultmanagement.chart.dao.YearCourseWiseEnrollmentDao;
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
public class JpaRepository {

	@Autowired
	private CredentialsJpaRepository credJpaRepository;

	@Autowired
	private StudentDetailsJpaRepository studentDetailsJpaRepository;

	@Autowired
	private StudentAcademicJpaRepository studentAcademicJpaRepository;

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

	public CredentialsDao getCredentials(final String username, final String password) {
		CredentialsDao credentials = credJpaRepository.getCredentials(username, password);
		return credentials;
	}

	public String getUserFullName(final String enrollmentNo) {
		return studentDetailsJpaRepository.getStudentFullName(enrollmentNo);
	}

	public StudentDetailDao getStudentDetailDao(String username) {
		StudentDetailDao studentDetailDao = studentDetailsJpaRepository.getStudentDetailDao(username);
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
		List<AddressDetailDao> addressDetailDaoList = addressDetailJpaRepository.getAddressDetailDaoList(addressId,
				this);
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
		for (Object[] entry : courseWiseStudentEnrollment) {
			Long count = (Long) entry[0];
			String courseName = (String) entry[1];
			map.put(courseName, count);
		}
		return map;
	}

	public List<YearCourseWiseEnrollmentDao> getCourseTypeWiseEnrollment() {
		List<YearCourseWiseEnrollmentDao> list = new LinkedList<YearCourseWiseEnrollmentDao>();
		final List<Object[]> courseTypeWiseEnrollment = courseInfoJpaRepository.getCourseTypeWiseEnrollment();

		for (Object[] entry : courseTypeWiseEnrollment) {
			Long count = (Long) entry[0];
			String courseType = (String) entry[1];
			Integer year = Integer.parseInt((String) entry[2]);
			list.add(new YearCourseWiseEnrollmentDao(count, courseType, year));
		}
		return list;
	}

	public List<Object[]> getCourseWiseSubjectNames(String username) {
		final List<Object[]> courseWiseSubjectNames = studentAcademicJpaRepository.getCourseWiseSubjectNames(username);
		return courseWiseSubjectNames;
	}

	public HashMap<Integer, List<SubjectMarksDao>> getStudentSemSubMarks(String univRegNo, String courseId) {
		final List<Object[]> studentSemSubMarks = studentAcademicJpaRepository.getStudentSemSubMarks(univRegNo,
				courseId);
		HashMap<Integer, List<SubjectMarksDao>> map = new HashMap<Integer, List<SubjectMarksDao>>();
		for (Object[] entry : studentSemSubMarks) {
			Integer semester = (Integer) entry[0];
			String subjectName = (String) entry[1];
			Integer marks = ((BigDecimal) entry[2]).intValue();
			map.compute(semester, (sem, val) -> {
				if (val == null) {
					val = new LinkedList<SubjectMarksDao>();
				}
				val.add(new SubjectMarksDao(subjectName, marks));
				return val;
			});
		}
		return map;
	}

	public boolean isUserValid(String username, String currentPassword) {
		return credJpaRepository.isUserValid(username, currentPassword);
	}

	public boolean changePassword(String username, String newPassword) {
		return credJpaRepository.changePassword(username, newPassword);
	}

	public List<SemMarksDao> getStudentAvgMarksBySem(String univRegNo, String courseId) {
		final List<Object[]> studentAvgMarksBySem = studentAcademicJpaRepository.getStudentAvgMarksBySem(univRegNo,
				courseId);
		List<SemMarksDao> avgMarksBySem = new LinkedList<SemMarksDao>();
		for (Object[] entry : studentAvgMarksBySem) {
			Float avgMarks = ((BigDecimal) entry[0]).floatValue();
			Integer semester = ((Integer) entry[1]);
			avgMarksBySem.add(new SemMarksDao(semester, avgMarks));
		}
		return avgMarksBySem;
	}

	public List<SemMarksDao> getClassAvgMarksBySem(String courseId) {
		final List<Object[]> studentAvgMarksBySem = studentAcademicJpaRepository.getClassAvgMarksBySem(courseId);
		List<SemMarksDao> classAvgMarksBySem = new LinkedList<SemMarksDao>();
		for (Object[] entry : studentAvgMarksBySem) {
			Float avgMarks = ((BigDecimal) entry[0]).floatValue();
			Integer semester = (Integer) entry[1];
			classAvgMarksBySem.add(new SemMarksDao(semester, avgMarks));
		}
		return classAvgMarksBySem;
	}

	public List<DistributionTypePercentageDao> getStudentDistributionWisePercentage(String univRegNo, String courseId) {
		final List<Object[]> studentDistributionWisePercentage = studentAcademicJpaRepository
				.getStudentDistributionWisePercentage(univRegNo, courseId);
		List<DistributionTypePercentageDao> list = new LinkedList<DistributionTypePercentageDao>();
		for (Object[] entry : studentDistributionWisePercentage) {
			String type = (String) entry[0];
			Float percentage = ((BigDecimal) entry[1]).floatValue();
			list.add(new DistributionTypePercentageDao(type, percentage));
		}
		return list;
	}

	public List<SemDistributionTypeMarksDao> getStudentSemDistributionTypeMarks(String univRegNo, String courseId) {
		final List<Object[]> studentSemDistributionTypeMarks = studentAcademicJpaRepository
				.getStudentSemDistributionTypeMarks(univRegNo, courseId);
		List<SemDistributionTypeMarksDao> list = new LinkedList<SemDistributionTypeMarksDao>();
		for (Object[] entry : studentSemDistributionTypeMarks) {
			Integer semester = (Integer) entry[0];
			String type = (String) entry[1];
			Integer marks = ((BigDecimal) entry[2]).intValue();
			list.add(new SemDistributionTypeMarksDao(type, marks, semester));
		}
		return list;
	}

	public List<CountryInfoDao> getAllCountries() {
		return countryInfoJpaRepository.getAllCountries();
	}
}
