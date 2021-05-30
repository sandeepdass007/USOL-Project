package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.AddressDetail;

@Repository
@Transactional
public class AddressDetailJpaRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public AddressDetail getAddressDetail(final String addressId) {
		AddressDetail addressDetail = entityManager.find(AddressDetail.class, addressId);
		return addressDetail;
	}
}
