package com.pgdca.resultmanagement.jdbc.entity.modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.rest.dao.CountryInfoDao;

@Component
public class MVCModelMapper {

	@Autowired
	private ModelMapper modelMapper;

	public CountryInfoDao mapCountryInfoToRestDao(com.pgdca.resultmanagement.mvc.dao.CountryInfoDao countryInfoDao) {
		return modelMapper.map(countryInfoDao, CountryInfoDao.class);
	}
}
