package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.ContactDetail;

@Repository
@Transactional
public class ContactDetailJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public ContactDetail getContactDetail(final String id) {
		ContactDetail contactDetail = entityManager.find(ContactDetail.class, id);
		return contactDetail;
	}
}
