package com.pgdca.resultmanagement.mvc.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.dao.CourseWiseSubjects;
import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;
import com.pgdca.resultmanagement.proxy.StudentServiceProxy;
import com.pgdca.resultmanagement.utils.CommonUtil;

@Component
public class StudentAcademicsHelper extends StudentHelper {

	@Autowired
	private StudentServiceProxy studentServiceProxy;

	public HashMap<String, Object> getModelAttributes(String username) {
		final HashMap<String, Object> modelAttributes = new HashMap<String, Object>();
		final StudentDetailDao studentProfileDao = studentServiceProxy.getStudentDetail(username);
		final List<Object[]> courseWiseSubjectNames = studentServiceProxy.getCourseWiseSubjectNames(username);
		List<CourseWiseSubjects> courseWiseSubjectsList = new ArrayList<CourseWiseSubjects>();
		for (Object[] entry : courseWiseSubjectNames) {
			String courseId = (String) entry[0];
			final Optional<CourseWiseSubjects> queriedCourseWiseSubject = courseWiseSubjectsList.stream()
					.filter(x -> x.getCourseId().equals(courseId)).findFirst();
			CourseWiseSubjects courseWiseSubjects = new CourseWiseSubjects();
			if(queriedCourseWiseSubject.isPresent()) {
				courseWiseSubjects = queriedCourseWiseSubject.get();
			} else {
				courseWiseSubjectsList.add(courseWiseSubjects);
			}
			String courseName = (String) entry[1];
			String subjectName = (String) entry[3];
			courseWiseSubjects.setCourseId(courseId);
			courseWiseSubjects.setCourseName(courseName);
			courseWiseSubjects.getSubjects().add(subjectName);
		}
		final String fullName = CommonUtil.getFullName(studentProfileDao.getFirstName(),
				studentProfileDao.getMiddleName(), studentProfileDao.getLastName());
		modelAttributes.put("studentFullName", fullName);
		modelAttributes.put("studentDetailDao", studentProfileDao);
		modelAttributes.put("courseWiseSubjectsList", courseWiseSubjectsList);
		return modelAttributes;
	}
}
