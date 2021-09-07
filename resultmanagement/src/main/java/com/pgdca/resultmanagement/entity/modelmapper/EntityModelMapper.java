package com.pgdca.resultmanagement.entity.modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.entity.Credentials;
import com.pgdca.resultmanagement.mvc.dao.CredentialsDao;

@Component
public class EntityModelMapper {

	@Autowired
	private ModelMapper modelMapper;
	

	public CredentialsDao mapCredentialsToDao(Credentials credentials) {
		return modelMapper.map(credentials, CredentialsDao.class);
	}
}
