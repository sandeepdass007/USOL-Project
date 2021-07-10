package com.pgdca.resultmanagement.rest;

import java.util.LinkedList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgdca.resultmanagement.rest.dao.CountryInfoDao;
import com.pgdca.resultmanagement.rest.dao.Select2ResponseResultsDao;
import com.pgdca.resultmanagement.rest.service.CountryDataProviderService;
import com.pgdca.resultmanagement.utils.Constants;

@RestController
@RequestMapping(value = "/country")
public class CountryDataProvider {

	@Autowired
	private CountryDataProviderService countryDataProviderService;

	@GetMapping(value = { Constants.EMPTY_STRING, "/" }, produces = MediaType.APPLICATION_JSON_VALUE)
	@Cacheable(value = "staticcache", key = "#root.methodName")
	public List<CountryInfoDao> getAllCountries() {
		System.out.println("Fetching from database!");
		final List<CountryInfoDao> allCountriesDao = countryDataProviderService.getAllCountries();
		return allCountriesDao;
	}

	@GetMapping(value = "/select2", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Select2ResponseResultsDao> getAllCountriesAsSelect2Response() {
		final List<CountryInfoDao> allCountriesDao = getAllCountries();
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.typeMap(CountryInfoDao.class, Select2ResponseResultsDao.class).addMappings(mapper -> {
			mapper.map(src -> src.getId(), Select2ResponseResultsDao::setId);
			mapper.map(src -> src.getName(), Select2ResponseResultsDao::setText);
		});
		List<Select2ResponseResultsDao> result = new LinkedList<Select2ResponseResultsDao>();
		allCountriesDao.forEach(countryDao -> {
			result.add(modelMapper.map(countryDao, Select2ResponseResultsDao.class));
		});
		return result;
	}

}
