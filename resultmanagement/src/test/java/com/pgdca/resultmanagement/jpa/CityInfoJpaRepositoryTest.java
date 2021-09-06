package com.pgdca.resultmanagement.jpa;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pgdca.resultmanagement.mvc.dao.CityInfoDao;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
public class CityInfoJpaRepositoryTest {

	@Autowired
	private CityInfoJpaRepository cityInfoJpaRepository;
	
	@Test
	public void test_getAllCityIds() {
		final Set<String> allCityIds = cityInfoJpaRepository.getAllCityIds();
		assertThat(allCityIds).isNotNull().isNotEmpty();
	}
	
	@Test
	public void test_getCityInfoDaoList() {
		final Set <String> allCityIds = cityInfoJpaRepository.getAllCityIds();
		final String randomCityId = allCityIds.stream().findAny().get();
		
		final CityInfoDao cityInfoDao = cityInfoJpaRepository.getCityInfoDao(randomCityId);
		assertThat(cityInfoDao).isNotNull();
		assertThat(cityInfoDao.getId()).isNotBlank();
		assertThat(cityInfoDao.getName()).isNotBlank();
	}

}
