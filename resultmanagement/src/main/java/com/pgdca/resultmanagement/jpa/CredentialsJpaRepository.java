package com.pgdca.resultmanagement.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.pgdca.resultmanagement.jdbc.entity.Credentials;
import com.pgdca.resultmanagement.mvc.dao.CredentialsDao;

@Repository
@Transactional
public class CredentialsJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public CredentialsDao getCredentials(String username, String password) {
		final Credentials credentials = entityManager.find(Credentials.class, username);
		if(credentials == null || !credentials.getPassword().equals(password)) {
			return null;
		}
		CredentialsDao credentialsDao = new CredentialsDao(credentials.getUsername(), credentials.getUserType());
		return credentialsDao;
	}

	public boolean isUserValid(String username, String currentPassword) {
		final Credentials credentials = entityManager.find(Credentials.class, username);
		if(credentials != null && StringUtils.hasText(credentials.getPassword()) && credentials.getPassword().equals(currentPassword)) {
			return true;
		}
		return false;
	}

	public boolean changePassword(String username, String newPassword) {
		final Credentials credentials = entityManager.find(Credentials.class, username);
		try {
			credentials.setPassword(newPassword);
			return true;
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return false;
	}
}
