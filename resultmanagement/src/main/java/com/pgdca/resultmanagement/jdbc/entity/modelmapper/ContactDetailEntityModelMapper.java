package com.pgdca.resultmanagement.jdbc.entity.modelmapper;

import java.util.List;

import javax.annotation.PostConstruct;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.jdbc.entity.ContactDetail;
import com.pgdca.resultmanagement.jpa.JpaRepository;
import com.pgdca.resultmanagement.mvc.dao.AddressDetailDao;
import com.pgdca.resultmanagement.mvc.dao.ContactDetailDao;
import com.pgdca.resultmanagement.mvc.dao.PhoneDetailDao;

@Component
public class ContactDetailEntityModelMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private JpaRepository jpaRepository;
	
	@PostConstruct
	public void postConstruct() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.typeMap(ContactDetail.class, ContactDetailDao.class).addMappings(mapper -> {
			mapper.using(new Converter<String, List<PhoneDetailDao>>() {
				@Override
				public List<PhoneDetailDao> convert(MappingContext<String, List<PhoneDetailDao>> context) {
					return jpaRepository.getPhoneDetailDaoList(context.getSource());
				}

			}).map(ContactDetail::getPhoneDetailId, ContactDetailDao::setPhoneDetailDaoList);
			
			mapper.using(new Converter<String, List<AddressDetailDao>>() {

				@Override
				public List<AddressDetailDao> convert(MappingContext<String, List<AddressDetailDao>> context) {
					return jpaRepository.getAddressDetailDaoList(context.getSource());
				}
				
			}).map(ContactDetail::getAddressId, ContactDetailDao::setAddressDetailDaoList);
		});
		this.modelMapper = modelMapper;
	}

	public ContactDetailDao map(ContactDetail contactDetail) {
		return modelMapper.map(contactDetail, ContactDetailDao.class);
	}
	
}
