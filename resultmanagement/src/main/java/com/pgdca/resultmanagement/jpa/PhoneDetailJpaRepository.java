package com.pgdca.resultmanagement.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.PhoneDetail;
import com.pgdca.resultmanagement.mvc.dao.PhoneDetailDao;
import com.pgdca.resultmanagement.mvc.dao.builder.PhoneDetailDaoBuilder;

@Repository
@Transactional
public class PhoneDetailJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<PhoneDetail> getPhoneDetail(final String id) {
		final TypedQuery<PhoneDetail> phoneDetail = entityManager
				.createQuery("SELECT p FROM PhoneDetail p where phoneDetailId = :id", PhoneDetail.class)
				.setParameter("id", id);
		return phoneDetail.getResultList();
	}

	public List<PhoneDetailDao> getPhoneDetailDaoList(String phoneDetailId, JpaRepository jpaRepository) {
		final List<PhoneDetail> phoneDetailList = getPhoneDetail(phoneDetailId);
		List<PhoneDetailDao> phoneDetailDaoList = new ArrayList<PhoneDetailDao>();
		for(PhoneDetail phoneDetail : phoneDetailList) {
			final PhoneDetailDao phoneDetailDao = PhoneDetailDaoBuilder.getBuilder()
				.setPhoneType(jpaRepository.getPhoneTypeDao(phoneDetail.getPhoneTypeId()).getType())
				.setLandlineExt(phoneDetail.getLandlineExt())
				.setLandlineNo(phoneDetail.getLandlineNo())
				.setMobileCode(phoneDetail.getMobileCode())
				.setMobileNo(phoneDetail.getMobileNo())
				.build();
			phoneDetailDaoList.add(phoneDetailDao);
		}
		return phoneDetailDaoList;
	}
}

