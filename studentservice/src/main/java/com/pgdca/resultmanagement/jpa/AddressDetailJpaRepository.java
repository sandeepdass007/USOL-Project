package com.pgdca.resultmanagement.jpa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.AddressDetail;
import com.pgdca.resultmanagement.jdbc.entity.modelmapper.EntityModelMapper;
import com.pgdca.resultmanagement.mvc.dao.AddressDetailDao;

@Repository
@Transactional
public class AddressDetailJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private EntityModelMapper entityModelMapper;
	
	private List<AddressDetail> getAddressDetail(final String addressId) {
		final TypedQuery<AddressDetail> addressDetail = entityManager
				.createQuery("SELECT addrsDtl FROM AddressDetail addrsDtl where addressDetailId = :id", AddressDetail.class)
				.setParameter("id", addressId);
		return addressDetail.getResultList();
	}
	
	public Set<String> getAllAddressIds() {
		final List<AddressDetail> resultList = entityManager.createQuery("SELECT addrsDtl from AddressDetail addrsDtl", AddressDetail.class).getResultList();
		final Set<String> addressIds = new HashSet<String>();
		resultList.forEach(x -> {
			addressIds.add(x.getAddressDetailId());
		});
		return addressIds;
	}

	public List<AddressDetailDao> getAddressDetailDaoList(String addressId) {
		final List<AddressDetail> addressDetailList = getAddressDetail(addressId);
		List<AddressDetailDao> addressDetailDaoList = new ArrayList<AddressDetailDao>();
		for(AddressDetail addressDetail : addressDetailList) {
			final AddressDetailDao addressDetailDao = entityModelMapper.mapAddressEntityToDao(addressDetail);
			addressDetailDaoList.add(addressDetailDao);
		}
		return addressDetailDaoList;
	}
}
