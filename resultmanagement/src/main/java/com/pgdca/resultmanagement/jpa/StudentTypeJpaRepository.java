package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.StudentType;

@Repository
@Transactional
public class StudentTypeJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public StudentType getStudentType(final String id) {
		StudentType studentType = entityManager.find(StudentType.class, id);
		return studentType;
	}
}
