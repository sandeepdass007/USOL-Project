package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.ContactDetail;
import com.pgdca.resultmanagement.mvc.dao.ContactDetailDao;
import com.pgdca.resultmanagement.mvc.dao.builder.ContactDetailDaoBuilder;

@Repository
@Transactional
public class ContactDetailJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public ContactDetail getContactDetail(final String id) {
		ContactDetail contactDetail = entityManager.find(ContactDetail.class, id);
		return contactDetail;
	}

	public ContactDetailDao getContactDetailDao(String contactDetailId, JpaRepository jpaRepository) {
		final ContactDetail contactDetail = getContactDetail(contactDetailId);
		return ContactDetailDaoBuilder.getBuilder()
			.setPhoneDetailDaoList(jpaRepository.getPhoneDetailDaoList(contactDetail.getPhoneDetailId()))
			.setAddressDetailDaoList(jpaRepository.getAddressDetailDaoList(contactDetail.getAddressId())) // TODO
			.build();
	}
}
