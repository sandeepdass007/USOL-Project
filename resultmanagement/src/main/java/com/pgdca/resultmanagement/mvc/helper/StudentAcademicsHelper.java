package com.pgdca.resultmanagement.mvc.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.jpa.JpaRepository;
import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;
import com.pgdca.resultmanagement.utils.CommonUtil;

@Component
public class StudentAcademicsHelper extends StudentHelper {

	@Autowired
	private JpaRepository jpaRepository;

	public HashMap<String, Object> getModelAttributes(String username) {
		final HashMap<String, Object> modelAttributes = new HashMap<String, Object>();
		final StudentDetailDao studentProfileDao = jpaRepository.getStudentDetailDao(username);
		final List<Object[]> courseWiseSubjectNames = jpaRepository.getCourseWiseSubjectNames(username);
		HashMap<String, List<String>> courseVsSubjects = new HashMap<String, List<String>>();
		
		for(Object[] entry : courseWiseSubjectNames) {
			String courseName = (String)entry[0];
			String subjectName = (String)entry[2];
			courseVsSubjects.compute(courseName, (key, list) -> {
				if(list == null) {
					list = new ArrayList<String>();
				}
				list.add(subjectName);
				return list;
			});
		}
		final String fullName = CommonUtil.getFullName(studentProfileDao.getFirstName(),
				studentProfileDao.getMiddleName(), studentProfileDao.getLastName());
		modelAttributes.put("studentFullName", fullName);
		modelAttributes.put("studentDetailDao", studentProfileDao);
		modelAttributes.put("courseVsSubjects", courseVsSubjects);
		return modelAttributes;
	}
}
