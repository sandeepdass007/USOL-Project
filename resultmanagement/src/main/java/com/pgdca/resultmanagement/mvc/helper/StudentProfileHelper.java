package com.pgdca.resultmanagement.mvc.helper;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.jdbc.entity.StudentDetail;
import com.pgdca.resultmanagement.jdbc.entity.StudentType;
import com.pgdca.resultmanagement.jpa.JpaRepository;
import com.pgdca.resultmanagement.mvc.dao.StudentProfileDao;
import com.pgdca.resultmanagement.utils.CommonUtil;

@Component
public class StudentProfileHelper extends StudentHelper {

	@Autowired
	private JpaRepository jpaRepository;
	
	public HashMap<String, Object> getModelAttributes(String username) {
		final HashMap<String, Object> modelAttributes = new HashMap<String, Object>();
		
		final StudentProfileDao studentProfileDao = jpaRepository.getStudentProfile(username);
		final StudentDetail studentDetails = studentProfileDao.getStudentDetails();
		final StudentType studentType = studentProfileDao.getStudentType();
		
		modelAttributes.put("studentFirstName", studentDetails.getFirstName());
		modelAttributes.put("studentMiddleName", studentDetails.getMiddleName());
		modelAttributes.put("studentLastName", studentDetails.getLastName());
		modelAttributes.put("studentname", CommonUtil.getFullName(studentDetails.getFirstName(),
				studentDetails.getMiddleName(), studentDetails.getLastName()));
		modelAttributes.put("studentType", studentType.getType());
		return modelAttributes;
	}

}
