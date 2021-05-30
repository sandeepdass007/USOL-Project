package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.CountryInfo;

@Repository
@Transactional
public class CountryInfoJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public CountryInfo getCountryInfo(final String id) {
		return entityManager.find(CountryInfo.class, id);
	}
}
