package com.pgdca.resultmanagement.jpa;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.jdbc.entity.modelmapper.MVCModelMapper;
import com.pgdca.resultmanagement.rest.dao.CountryInfoDao;

@Component
public class JpaRestRepository {

	@Autowired
	private JpaRepository jpaRepository;
	
	@Autowired
	private MVCModelMapper mvcModelMapper;
	
	public List<CountryInfoDao> getAllCountries() {
		final List<com.pgdca.resultmanagement.mvc.dao.CountryInfoDao> countryInfoDaoList = jpaRepository.getAllCountries();
		List<CountryInfoDao> list = new LinkedList<CountryInfoDao>();
		countryInfoDaoList.forEach(countryInfoDao -> {
			final CountryInfoDao mappedCountryInfoDao = mvcModelMapper.mapCountryInfoToRestDao(countryInfoDao);
			list.add(mappedCountryInfoDao);
		});
		return list;
	}
}
