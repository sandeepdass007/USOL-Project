package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.PhoneType;
import com.pgdca.resultmanagement.jdbc.entity.modelmapper.EntityModelMapper;
import com.pgdca.resultmanagement.mvc.dao.PhoneTypeDao;

@Repository
@Transactional
public class PhoneTypeJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private EntityModelMapper entityModelMapper;
	
	private PhoneType getPhoneType(final String id) {
		return entityManager.find(PhoneType.class, id);
	}

	public PhoneTypeDao getPhoneTypeDao(String phoneTypeId) {
		final PhoneType phoneType = getPhoneType(phoneTypeId);
		return entityModelMapper.mapPhoneTypeToDao(phoneType);
	}
}
