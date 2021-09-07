package com.pgdca.resultmanagement.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.PhoneDetail;
import com.pgdca.resultmanagement.jdbc.entity.modelmapper.EntityModelMapper;
import com.pgdca.resultmanagement.mvc.dao.PhoneDetailDao;

@Repository
@Transactional
public class PhoneDetailJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private EntityModelMapper entityModelMapper;
	
	private List<PhoneDetail> getPhoneDetail(final String id) {
		final TypedQuery<PhoneDetail> phoneDetail = entityManager
				.createQuery("SELECT p FROM PhoneDetail p where phoneDetailId = :id", PhoneDetail.class)
				.setParameter("id", id);
		return phoneDetail.getResultList();
	}

	public List<PhoneDetailDao> getPhoneDetailDaoList(String phoneDetailId) {
		final List<PhoneDetail> phoneDetailList = getPhoneDetail(phoneDetailId);
		List<PhoneDetailDao> phoneDetailDaoList = new ArrayList<PhoneDetailDao>();
		for(PhoneDetail phoneDetail : phoneDetailList) {
			
			final PhoneDetailDao phoneDetailDao = entityModelMapper.mapPhoneDetailEntityToDao(phoneDetail);
			phoneDetailDaoList.add(phoneDetailDao);
		}
		return phoneDetailDaoList;
	}
}

