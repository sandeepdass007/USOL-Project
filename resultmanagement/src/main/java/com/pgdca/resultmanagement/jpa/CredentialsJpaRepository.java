package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pgdca.resultmanagement.jdbc.entity.Credentials;

@Repository
@Transactional
public class CredentialsJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public boolean isUserValid(String username, String password) {
		final Credentials credentials = entityManager.find(Credentials.class, username);
		if(credentials == null) {
			return false;
		}
		return credentials.getPassword().equals(password);
	}
}
