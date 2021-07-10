package com.pgdca.resultmanagement.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.jpa.JpaRestRepository;
import com.pgdca.resultmanagement.rest.dao.CountryInfoDao;
import com.pgdca.resultmanagement.rest.service.CountryDataProviderService;

@Component
public class CountryDataProviderServiceImpl implements CountryDataProviderService {


	@Autowired
	private JpaRestRepository jpaRestRepository;
	
	@Override
	public List<CountryInfoDao> getAllCountries() {
		List<CountryInfoDao> countryInfoDaoList = jpaRestRepository.getAllCountries();
		return countryInfoDaoList;
	}

}
