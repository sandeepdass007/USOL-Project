package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.StateInfo;
import com.pgdca.resultmanagement.mvc.dao.StateInfoDao;
import com.pgdca.resultmanagement.mvc.dao.builder.StateInfoDaoBuilder;

@Repository
@Transactional
public class StateInfoJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public StateInfo getStateInfo(final String id) {
		return entityManager.find(StateInfo.class, id);
	}

	public StateInfoDao getStateInfoDao(String stateId) {
		final StateInfo stateInfo = getStateInfo(stateId);
		return StateInfoDaoBuilder.getBuilder()
			.setId(stateInfo.getId())
			.setName(stateInfo.getName())
			.build();
	}
}
