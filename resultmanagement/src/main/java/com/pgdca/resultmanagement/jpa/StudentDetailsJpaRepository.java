package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.StudentDetail;
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

	public StudentDetail getStudentDetails(String enrollmentNo) {
		StudentDetail studentDetail = entityManager.find(StudentDetail.class, enrollmentNo);
		return studentDetail;
	}
}
