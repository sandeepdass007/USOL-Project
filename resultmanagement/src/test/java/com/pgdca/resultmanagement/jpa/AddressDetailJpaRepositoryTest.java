package com.pgdca.resultmanagement.jpa;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pgdca.resultmanagement.mvc.dao.AddressDetailDao;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
public class AddressDetailJpaRepositoryTest {

	@Autowired
	private AddressDetailJpaRepository addressDetailJpaRepository;
	
	@Test
	public void test_getAllAddressIds() {
		final Set<String> allAddressIds = addressDetailJpaRepository.getAllAddressIds();
		assertThat(allAddressIds).isNotNull().isNotEmpty();
	}
	
	@Test
	@RepeatedTest(value = 10)
	public void test_getAddressDetailDaoList() {
		final Set<String> allAddressIds = addressDetailJpaRepository.getAllAddressIds();
		final String randomAddressId = allAddressIds.stream().findAny().get();
		
		final List<AddressDetailDao> addressDetailDaoList = addressDetailJpaRepository.getAddressDetailDaoList(randomAddressId);
		assertThat(addressDetailDaoList).isNotNull().isNotEmpty();
		final AddressDetailDao addressDetailDao = addressDetailDaoList.stream().findAny().get();
		
		assertThat(addressDetailDao).isNotNull();
		assertThat(addressDetailDao.getBuildingHouseNo()).isNotBlank();
		assertThat(addressDetailDao.getCity()).isNotBlank();
		assertThat(addressDetailDao.getCountry()).isNotBlank();
		assertThat(addressDetailDao.getPincode()).isNotBlank();
		assertThat(addressDetailDao.getState()).isNotBlank();
		assertThat(addressDetailDao.getType()).isNotBlank();
		
	}
}
