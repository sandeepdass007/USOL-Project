package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.StudentType;
import com.pgdca.resultmanagement.jdbc.entity.modelmapper.EntityModelMapper;
import com.pgdca.resultmanagement.mvc.dao.StudentTypeDao;

@Repository
@Transactional
public class StudentTypeJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private EntityModelMapper entityModelMapper;
	
	public StudentType getStudentType(final String id) {
		StudentType studentType = entityManager.find(StudentType.class, id);
		return studentType;
	}

	public StudentTypeDao getStudentTypeDao(String studentTypeId) {
		final StudentType studentType = getStudentType(studentTypeId);
		return entityModelMapper.mapStudentTypeToDao(studentType);
	}
}
