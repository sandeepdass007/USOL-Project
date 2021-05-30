package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.ParentDetail;

@Repository
@Transactional
public class ParentDetailJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public ParentDetail getParentDetail(final String id) {
		ParentDetail parentDetail = entityManager.find(ParentDetail.class, id);
		return parentDetail;
	}
}
