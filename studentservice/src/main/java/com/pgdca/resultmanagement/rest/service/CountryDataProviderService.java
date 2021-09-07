package com.pgdca.resultmanagement.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pgdca.resultmanagement.rest.dao.CountryInfoDao;

@Service
public interface CountryDataProviderService {

	List<CountryInfoDao> getAllCountries();

}
