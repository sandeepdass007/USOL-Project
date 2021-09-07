package com.pgdca.resultmanagement.mvc.helper;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;
import com.pgdca.resultmanagement.proxy.StudentServiceProxy;
import com.pgdca.resultmanagement.utils.CommonUtil;

@Component
public class StudentHomeHelper extends StudentHelper {

	@Autowired
	private StudentServiceProxy studentServiceProxy;

	public HashMap<String, Object> getModelAttributes(String username) {
		final HashMap<String, Object> modelAttributes = new HashMap<String, Object>();
		final StudentDetailDao studentProfileDao = studentServiceProxy.getStudentDetail(username);
		final String fullName = CommonUtil.getFullName(studentProfileDao.getFirstName(),
				studentProfileDao.getMiddleName(), studentProfileDao.getLastName());
		modelAttributes.put("studentFullName", fullName);
		modelAttributes.put("studentDetailDao", studentProfileDao);
		return modelAttributes;
	}
}
