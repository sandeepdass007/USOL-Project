package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.AddressType;
import com.pgdca.resultmanagement.mvc.dao.AddressTypeDao;
import com.pgdca.resultmanagement.mvc.dao.builder.AddressTypeDaoBuilder;

@Repository
@Transactional
public class AddressTypeJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public AddressType getAddressType(final String id) {
		return entityManager.find(AddressType.class, id);
	}

	public AddressTypeDao getAddressTypeDao(String addressDetailTypeId, JpaRepository jpaRepository) {
		final AddressType addressType = getAddressType(addressDetailTypeId);
		return AddressTypeDaoBuilder.getBuilder()
			.setId(addressType.getId())
			.setType(addressType.getType())
			.build();
	}
}
