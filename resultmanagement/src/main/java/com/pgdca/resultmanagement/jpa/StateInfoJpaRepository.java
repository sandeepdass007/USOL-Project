package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.StateInfo;

@Repository
@Transactional
public class StateInfoJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public StateInfo getStateInfo(final String id) {
		return entityManager.find(StateInfo.class, id);
	}
}
