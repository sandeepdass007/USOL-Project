package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.CityInfo;

@Repository
@Transactional
public class CityInfoJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public CityInfo getCityInfo(final String id) {
		return entityManager.find(CityInfo.class, id);
	}
}
