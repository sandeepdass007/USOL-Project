package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.PhoneType;

@Repository
@Transactional
public class PhoneTypeJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public PhoneType getPhoneType(final String id) {
		return entityManager.find(PhoneType.class, id);
	}
}
