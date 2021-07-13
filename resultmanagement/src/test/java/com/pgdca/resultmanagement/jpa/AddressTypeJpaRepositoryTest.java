package com.pgdca.resultmanagement.jpa;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pgdca.resultmanagement.mvc.dao.AddressTypeDao;

@SpringBootTest
public class AddressTypeJpaRepositoryTest {

	@Autowired
	private AddressTypeJpaRepository addressTypeJpaRepository;

	@Test
	public void test_getAllAddressTypeIds() {
		final Set<String> allAddressTypeIds = addressTypeJpaRepository.getAllAddressTypeIds();
		assertThat(allAddressTypeIds).isNotNull().isNotEmpty();
	}
	
	@Test
	public void test_getAddressTypeDaoList() {
		final Set<String> allAddressTypeIds = addressTypeJpaRepository.getAllAddressTypeIds();
		final String randomAddressTypeId = allAddressTypeIds.stream().findAny().get();
		
		final AddressTypeDao addressTypeDao = addressTypeJpaRepository.getAddressTypeDao(randomAddressTypeId);
		assertThat(addressTypeDao).isNotNull();
		
		assertThat(addressTypeDao.getId()).isNotBlank();
		assertThat(addressTypeDao.getType()).isNotBlank();
		
	}
}
