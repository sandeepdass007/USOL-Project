package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.ContactDetail;
import com.pgdca.resultmanagement.jdbc.entity.modelmapper.EntityModelMapper;
import com.pgdca.resultmanagement.mvc.dao.ContactDetailDao;

@Repository
@Transactional
public class ContactDetailJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private EntityModelMapper entityModelMapper;

	public ContactDetail getContactDetail(final String id) {
		ContactDetail contactDetail = entityManager.find(ContactDetail.class, id);
		return contactDetail;
	}

	public ContactDetailDao getContactDetailDao(String contactDetailId, JpaRepository jpaRepository) {
		final ContactDetail contactDetail = getContactDetail(contactDetailId);
		
		return entityModelMapper.mapContactDetailEntityToDao(contactDetail);
	}
}
