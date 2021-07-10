package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.ParentDetail;
import com.pgdca.resultmanagement.jdbc.entity.modelmapper.EntityModelMapper;
import com.pgdca.resultmanagement.mvc.dao.ParentDetailDao;

@Repository
@Transactional
public class ParentDetailJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private EntityModelMapper entityModelMapper;
	
	public ParentDetail getParentDetail(final String id) {
		ParentDetail parentDetail = entityManager.find(ParentDetail.class, id);
		return parentDetail;
	}

	public ParentDetailDao getParentDetailDao(String parentDetailId) {
		final ParentDetail parentDetail = getParentDetail(parentDetailId);
		return entityModelMapper.mapParentDetailToDao(parentDetail);
	}
}
