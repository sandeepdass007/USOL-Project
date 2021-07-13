package com.pgdca.resultmanagement.jpa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.CityInfo;
import com.pgdca.resultmanagement.jdbc.entity.modelmapper.EntityModelMapper;
import com.pgdca.resultmanagement.mvc.dao.CityInfoDao;

@Repository
@Transactional
public class CityInfoJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private EntityModelMapper entityModelMapper;
	
	private CityInfo getCityInfo(final String id) {
		return entityManager.find(CityInfo.class, id);
	}

	public CityInfoDao getCityInfoDao(String cityId) {
		final CityInfo cityInfo = getCityInfo(cityId);
		return entityModelMapper.mapCityInfoEntityToDao(cityInfo);
	}
	
	public Set<String> getAllCityIds() {
		final List<CityInfo> resultList = entityManager.createQuery("SELECT cityInfo from CityInfo cityInfo",CityInfo.class).getResultList();
		final Set<String> cityIds = new HashSet<String>();
		resultList.forEach(x -> {
			cityIds.add(x.getId());
		});
		return cityIds;
	}
 	
}
