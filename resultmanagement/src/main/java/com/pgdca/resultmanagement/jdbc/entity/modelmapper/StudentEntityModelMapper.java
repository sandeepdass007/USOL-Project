package com.pgdca.resultmanagement.jdbc.entity.modelmapper;

import java.sql.Date;

import javax.annotation.PostConstruct;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.jdbc.entity.StudentDetail;
import com.pgdca.resultmanagement.jpa.JpaRepository;
import com.pgdca.resultmanagement.mvc.dao.ContactDetailDao;
import com.pgdca.resultmanagement.mvc.dao.DateDao;
import com.pgdca.resultmanagement.mvc.dao.ParentDetailDao;
import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;

@Component
public class StudentEntityModelMapper {

	@Autowired
	private JpaRepository jpaRepository;
	
	private ModelMapper modelMapper;
	
	@PostConstruct
	public void postConstruct() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.typeMap(StudentDetail.class, StudentDetailDao.class)
		.addMappings(mapper -> {
			mapper.using(new Converter<String, String>() {

				@Override
				public String convert(MappingContext<String, String> context) {
					return jpaRepository.getStudentTypeDao(context.getSource()).getType();
				}
				
			}).map(StudentDetail::getStudentTypeId, StudentDetailDao::setStudentType);
			
			mapper.using(new Converter<String, ParentDetailDao>() {

				@Override
				public ParentDetailDao convert(MappingContext<String, ParentDetailDao> context) {
					return jpaRepository.getParentDetailDao(context.getSource());
				}

			}).map(StudentDetail::getParentDetailsId, StudentDetailDao::setParentDetailDao);
			
			mapper.using(new Converter<String, ContactDetailDao>() {

				@Override
				public ContactDetailDao convert(MappingContext<String, ContactDetailDao> context) {
					return jpaRepository.getContactDetailDao(context.getSource());
				}

			}).map(StudentDetail::getContactDetailId, StudentDetailDao::setContactDetailDao);
			
			mapper.using(new Converter<Date, DateDao>() {

				@Override
				public DateDao convert(MappingContext<Date, DateDao> context) {
					return new DateDao(context.getSource());
				}

			}).map(StudentDetail::getDateOfBirth, StudentDetailDao::setDateOfBirth);
		});
		this.modelMapper = modelMapper;
	}

	public StudentDetailDao map(StudentDetail studentDetail) {
		return modelMapper.map(studentDetail, StudentDetailDao.class);
	}
}
