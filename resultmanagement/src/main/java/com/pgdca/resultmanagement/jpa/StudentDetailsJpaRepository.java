package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.StudentDetail;
import com.pgdca.resultmanagement.jdbc.entity.modelmapper.EntityModelMapper;
import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;
import com.pgdca.resultmanagement.utils.CommonUtil;

@Repository
@Transactional
public class StudentDetailsJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private EntityModelMapper entityModelMapper;
	
	public String getStudentFullName(final String uniRegNo) {
		final StudentDetail studentDetail = entityManager.createQuery("SELECT sd from StudentDetail sd where sd.universityRegNo=:uniRegNo", StudentDetail.class).setParameter("uniRegNo", uniRegNo)
				.getSingleResult();
		if(studentDetail == null) {
			return null;
		}
		String firstName = studentDetail.getFirstName();
		String middleName = studentDetail.getMiddleName();
		String lastName = studentDetail.getLastName();
		String fullName = CommonUtil.getFullName(firstName, middleName, lastName);
		return fullName;
	}

	public StudentDetail getStudentDetail(String uniRegNo) {
		final StudentDetail studentDetail = entityManager.createQuery("SELECT sd from StudentDetail sd where sd.universityRegNo=:uniRegNo", StudentDetail.class).setParameter("uniRegNo", uniRegNo)
			.getResultStream().findFirst().get();
		return studentDetail;
	}

	public StudentDetailDao getStudentDetailDao(String enrollmentNo) {
		final StudentDetail studentDetail = getStudentDetail(enrollmentNo);
		return entityModelMapper.mapStudentEntityToDao(studentDetail);
	}
}
