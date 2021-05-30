package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.PhoneDetail;

@Repository
@Transactional
public class PhoneDetailJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public PhoneDetail getPhoneDetail(final String id) {
		return entityManager.find(PhoneDetail.class, id);
	}
}
