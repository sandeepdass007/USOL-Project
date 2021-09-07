package com.pgdca.resultmanagement.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.mvc.dao.CredentialsDao;

@Component
public class JpaRepository {

	@Autowired
	private CredentialsJpaRepository credJpaRepository;

	public CredentialsDao getCredentials(final String username, final String password) {
		CredentialsDao credentials = credJpaRepository.getCredentials(username, password);
		return credentials;
	}
	
	public boolean isUserValid(String username, String currentPassword) {
		return credJpaRepository.isUserValid(username, currentPassword);
	}
	
	public boolean changePassword(String username, String newPassword) {
		return credJpaRepository.changePassword(username, newPassword);
	}
}
