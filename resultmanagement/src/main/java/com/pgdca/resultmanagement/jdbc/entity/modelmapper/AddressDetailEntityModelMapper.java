package com.pgdca.resultmanagement.jdbc.entity.modelmapper;

import javax.annotation.PostConstruct;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.jdbc.entity.AddressDetail;
import com.pgdca.resultmanagement.jpa.JpaRepository;
import com.pgdca.resultmanagement.mvc.dao.AddressDetailDao;

@Component
public class AddressDetailEntityModelMapper {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private JpaRepository jpaRepository;

	@PostConstruct
	public void postConstruct() {
		ModelMapper modelMapper = new ModelMapper();

		modelMapper.typeMap(AddressDetail.class, AddressDetailDao.class).addMappings(mapper -> {
			mapper.using(new Converter<String, String>() {

				@Override
				public String convert(MappingContext<String, String> context) {
					return jpaRepository.getCityInfoDao(context.getSource()).getName();
				}
			}).map(AddressDetail::getCityId, AddressDetailDao::setCity);

			mapper.using(new Converter<String, String>() {

				@Override
				public String convert(MappingContext<String, String> context) {
					return jpaRepository.getCountryInfoDao(context.getSource()).getName();
				}
			}).map(AddressDetail::getCountryId, AddressDetailDao::setCountry);
			
			mapper.using(new Converter<String, String>() {

				@Override
				public String convert(MappingContext<String, String> context) {
					return jpaRepository.getStateInfoDao(context.getSource()).getName();
				}
			}).map(AddressDetail::getStateId, AddressDetailDao::setState);
			
			mapper.using(new Converter<String, String>() {

				@Override
				public String convert(MappingContext<String, String> context) {
					return jpaRepository.getAddressTypeDao(context.getSource()).getType();
				}
			}).map(AddressDetail::getAddressTypeId, AddressDetailDao::setType);
		});

		this.modelMapper = modelMapper;
	}

	public AddressDetailDao map(AddressDetail addressDetail) {
		return modelMapper.map(addressDetail, AddressDetailDao.class);
	}

}
