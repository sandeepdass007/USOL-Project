package com.pgdca.resultmanagement.rest.service.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pgdca.resultmanagement.rest.dao.CountryInfoDao;

@SpringBootTest
public class CountryDataProviderServiceImplTest {

	@Autowired
	private CountryDataProviderServiceImpl countryDataProviderServiceImpl;

	@Test
	public void test_getAllCountries() {
		final List<CountryInfoDao> allCountries = countryDataProviderServiceImpl.getAllCountries();
		assertThat(allCountries).isNotNull().isNotEmpty()
				.anyMatch(x -> x.getName().equals("India") && x.getId().equals("IND"))
				.anyMatch(x -> x.getName().equals("British Indian Ocean Territory") && x.getId().equals("IOT"));

	}
}
