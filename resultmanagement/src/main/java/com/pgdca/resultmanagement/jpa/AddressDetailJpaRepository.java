package com.pgdca.resultmanagement.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.AddressDetail;
import com.pgdca.resultmanagement.mvc.dao.AddressDetailDao;
import com.pgdca.resultmanagement.mvc.dao.builder.AddressDetailDaoBuilder;

@Repository
@Transactional
public class AddressDetailJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<AddressDetail> getAddressDetail(final String addressId) {
		final TypedQuery<AddressDetail> addressDetail = entityManager
				.createQuery("SELECT addrsDtl FROM AddressDetail addrsDtl where addressDetailId = :id", AddressDetail.class)
				.setParameter("id", addressId);
		return addressDetail.getResultList();
	}

	public List<AddressDetailDao> getAddressDetailDaoList(String addressId, JpaRepository jpaRepository) {
		final List<AddressDetail> addressDetailList = getAddressDetail(addressId);
		List<AddressDetailDao> addressDetailDaoList = new ArrayList<AddressDetailDao>();
		for(AddressDetail addressDetail : addressDetailList) {
			final AddressDetailDao addressDetailDao = AddressDetailDaoBuilder.getBuilder()
				.setBuildingHouseNo(addressDetail.getBuildingHouseNo())
				.setPincode(addressDetail.getPincode())
				.setCity(jpaRepository.getCityInfoDao(addressDetail.getCityId()).getName())
				.setState(jpaRepository.getStateInfoDao(addressDetail.getStateId()).getName())
				.setCountry(jpaRepository.getCountryInfoDao(addressDetail.getCountryId()).getName())
				.build();
			addressDetailDaoList.add(addressDetailDao);
		}
		return addressDetailDaoList;
	}
}
