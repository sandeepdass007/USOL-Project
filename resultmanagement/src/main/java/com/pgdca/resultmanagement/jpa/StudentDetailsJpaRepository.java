package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.pgdca.resultmanagement.jdbc.entity.StudentDetails;
import com.pgdca.resultmanagement.utils.Constants;

@Repository
@Transactional
public class StudentDetailsJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public String getStudentFullName(final String enrollmentNo) {
		StudentDetails studentDetail = entityManager.find(StudentDetails.class, enrollmentNo);
		if(studentDetail == null) {
			return null;
		}
		String firstName = studentDetail.getFirstName();
		String middleName = studentDetail.getMiddleName();
		String lastName = studentDetail.getLastName();
		String fullName = firstName + (StringUtils.hasText(middleName) ? Constants.SPACE + middleName : Constants.EMPTY_STRING)
				+ (StringUtils.hasText(lastName) ? " " + lastName : Constants.EMPTY_STRING);
		return fullName;
	}
}
