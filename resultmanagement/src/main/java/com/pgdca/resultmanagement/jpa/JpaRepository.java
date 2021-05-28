package com.pgdca.resultmanagement.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.dto.ValidationResponse;

@Component
public class JpaRepository {

	@Autowired
	private CredentialsJpaRepository credJpaRepository;
	
	public ValidationResponse isUserValid(final String username, final String password) {
		boolean userValid = credJpaRepository.isUserValid(username, password);
		return new ValidationResponse(userValid, userValid ? null : "Invalid username or password");
	}
	
}
