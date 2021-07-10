package com.pgdca.resultmanagement.jdbc.entity.modelmapper;

import javax.annotation.PostConstruct;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.jdbc.entity.PhoneDetail;
import com.pgdca.resultmanagement.jpa.JpaRepository;
import com.pgdca.resultmanagement.mvc.dao.PhoneDetailDao;

@Component
public class PhoneDetailEntityModelMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private JpaRepository jpaRepository;
	
	@PostConstruct
	public void postConstruct() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.typeMap(PhoneDetail.class, PhoneDetailDao.class)
		.addMappings(mapper -> {
			mapper.using(new Converter<String, String>() {

				@Override
				public String convert(MappingContext<String, String> context) {
					return jpaRepository.getPhoneTypeDao(context.getSource()).getType();
				}
				
			}).map(PhoneDetail::getPhoneTypeId, PhoneDetailDao::setPhoneType);
		});
		this.modelMapper = modelMapper;
	}

	public PhoneDetailDao map(PhoneDetail phoneDetail) {
		return modelMapper.map(phoneDetail, PhoneDetailDao.class);
	}
}
