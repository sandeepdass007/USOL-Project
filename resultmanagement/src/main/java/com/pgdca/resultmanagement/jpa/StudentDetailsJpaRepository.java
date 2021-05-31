package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.StudentDetail;
import com.pgdca.resultmanagement.mvc.dao.DateDao;
import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;
import com.pgdca.resultmanagement.mvc.dao.builder.StudentDetailDaoBuilder;
import com.pgdca.resultmanagement.utils.CommonUtil;

@Repository
@Transactional
public class StudentDetailsJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public String getStudentFullName(final String enrollmentNo) {
		StudentDetail studentDetail = entityManager.find(StudentDetail.class, enrollmentNo);
		if(studentDetail == null) {
			return null;
		}
		String firstName = studentDetail.getFirstName();
		String middleName = studentDetail.getMiddleName();
		String lastName = studentDetail.getLastName();
		String fullName = CommonUtil.getFullName(firstName, middleName, lastName);
		return fullName;
	}

	public StudentDetail getStudentDetail(String enrollmentNo) {
		StudentDetail studentDetail = entityManager.find(StudentDetail.class, enrollmentNo);
		return studentDetail;
	}

	public StudentDetailDao getStudentDetailDao(String enrollmentNo, JpaRepository jpaRepository) {
		final StudentDetail studentDetail = getStudentDetail(enrollmentNo);
		return StudentDetailDaoBuilder.getBuilder()
			.setFirstName(studentDetail.getFirstName())
			.setMiddleName(studentDetail.getMiddleName())
			.setLastName(studentDetail.getLastName())
			.setEnrollmentNo(studentDetail.getEnrollmentNo())
			.setStudentType(jpaRepository.getStudentTypeDao(studentDetail.getStudentTypeId()).getType())
			.setDateOfBirth(new DateDao(studentDetail.getDateOfBirth()))
			.setParentDetailDao(jpaRepository.getParentDetailDao(studentDetail.getParentDetailsId()))
			.setContactDetailDao(jpaRepository.getContactDetailDao(studentDetail.getContactDetailId()))
			.build();
	}
}
