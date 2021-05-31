package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.PhoneType;
import com.pgdca.resultmanagement.mvc.dao.PhoneTypeDao;
import com.pgdca.resultmanagement.mvc.dao.builder.PhoneTypeDaoBuilder;

@Repository
@Transactional
public class PhoneTypeJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public PhoneType getPhoneType(final String id) {
		return entityManager.find(PhoneType.class, id);
	}

	public PhoneTypeDao getPhoneTypeDao(String phoneTypeId) {
		final PhoneType phoneType = getPhoneType(phoneTypeId);
		return PhoneTypeDaoBuilder.getBuilder()
			.setId(phoneType.getId())
			.setType(phoneType.getType())
			.build();
	}
}
