package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.ParentDetail;
import com.pgdca.resultmanagement.mvc.dao.ParentDetailDao;
import com.pgdca.resultmanagement.mvc.dao.builder.ParentDetailDaoBuilder;

@Repository
@Transactional
public class ParentDetailJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public ParentDetail getParentDetail(final String id) {
		ParentDetail parentDetail = entityManager.find(ParentDetail.class, id);
		return parentDetail;
	}

	public ParentDetailDao getParentDetailDao(String parentDetailId) {
		final ParentDetail parentDetail = getParentDetail(parentDetailId);
		return ParentDetailDaoBuilder.getBuilder()
			.setFatherName(parentDetail.getFatherName())
			.setFatherOccupation(parentDetail.getFatherOccupation())
			.setMotherName(parentDetail.getMotherName())
			.setMotherOccupation(parentDetail.getMotherOccupation())
			.build();
	}
}
