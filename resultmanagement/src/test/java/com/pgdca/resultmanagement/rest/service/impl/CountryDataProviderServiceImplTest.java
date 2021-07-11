package com.pgdca.resultmanagement.rest.service.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.pgdca.resultmanagement.jpa.JpaRestRepository;
import com.pgdca.resultmanagement.rest.dao.CountryInfoDao;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ExtendWith(MockitoExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
public class CountryDataProviderServiceImplTest {

	@InjectMocks
	private CountryDataProviderServiceImpl countryDataProviderServiceImpl;
	@Mock
	private JpaRestRepository jpaRestRepository;

	@BeforeAll
	public void configureJpaRestRepositoryMocks() {

	}

	@Test
	public void test_getAllCountries() {
		final List<CountryInfoDao> listOfCountries = Stream
				.of(new CountryInfoDao("IND", "India"), new CountryInfoDao("IOT", "British Indian Ocean Territory"))
				.collect(Collectors.toList());
		Mockito.when(jpaRestRepository.getAllCountries()).thenReturn(listOfCountries);
		final List<CountryInfoDao> allCountries = countryDataProviderServiceImpl.getAllCountries();
		assertThat(allCountries).isNotNull().isNotEmpty()
				.anyMatch(x -> x.getName().equals("India") && x.getId().equals("IND"))
				.anyMatch(x -> x.getName().equals("British Indian Ocean Territory") && x.getId().equals("IOT"));

	}
}
