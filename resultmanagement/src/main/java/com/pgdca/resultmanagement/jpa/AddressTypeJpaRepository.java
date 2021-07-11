package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.AddressType;
import com.pgdca.resultmanagement.jdbc.entity.modelmapper.EntityModelMapper;
import com.pgdca.resultmanagement.mvc.dao.AddressTypeDao;

@Repository
@Transactional
public class AddressTypeJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private EntityModelMapper entityModelMapper;
	
	private AddressType getAddressType(final String id) {
		return entityManager.find(AddressType.class, id);
	}

	public AddressTypeDao getAddressTypeDao(String addressDetailTypeId) {
		final AddressType addressType = getAddressType(addressDetailTypeId);
		return entityModelMapper.mapAddressTypeEntityToDao(addressType);
	}
}
