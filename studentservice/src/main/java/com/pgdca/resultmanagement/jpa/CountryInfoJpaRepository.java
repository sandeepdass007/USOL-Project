package com.pgdca.resultmanagement.jpa;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.CountryInfo;
import com.pgdca.resultmanagement.jdbc.entity.modelmapper.EntityModelMapper;
import com.pgdca.resultmanagement.mvc.dao.CountryInfoDao;

@Repository
@Transactional
public class CountryInfoJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private EntityModelMapper entityModelMapper;

	private CountryInfo getCountryInfo(final String id) {
		return entityManager.find(CountryInfo.class, id);
	}

	public CountryInfoDao getCountryInfoDao(String countryId) {
		final CountryInfo countryInfo = getCountryInfo(countryId);
		return entityModelMapper.mapCountryInfoToDao(countryInfo);
	}

	public List<CountryInfoDao> getAllCountries() {
		final List<CountryInfo> countryInfoList = entityManager
				.createQuery("select countryInfo from CountryInfo countryInfo", CountryInfo.class).getResultList();
		List<CountryInfoDao> countryInfoDaoList = new LinkedList<CountryInfoDao>();
		countryInfoList.forEach(countryInfo -> {
			
			final CountryInfoDao countryInfoDao = entityModelMapper.mapCountryInfoToDao(countryInfo);
			countryInfoDaoList.add(countryInfoDao);
		});
		return countryInfoDaoList;
	}
}
