package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.CityInfo;
import com.pgdca.resultmanagement.mvc.dao.CityInfoDao;
import com.pgdca.resultmanagement.mvc.dao.builder.CityInfoDaoBuilder;

@Repository
@Transactional
public class CityInfoJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public CityInfo getCityInfo(final String id) {
		return entityManager.find(CityInfo.class, id);
	}

	public CityInfoDao getCityInfoDao(String cityId) {
		final CityInfo cityInfo = getCityInfo(cityId);
		return CityInfoDaoBuilder.getBuilder()
			.setId(cityInfo.getId())
			.setName(cityInfo.getName())
			.build();
	}
}
