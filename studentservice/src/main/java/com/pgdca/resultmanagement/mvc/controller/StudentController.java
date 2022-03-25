package com.pgdca.resultmanagement.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgdca.resultmanagement.jpa.JpaRepository;
import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;

@RestController
@RequestMapping("/student-service")
public class StudentController {

	@Autowired
	private JpaRepository jpaRepository;

	@GetMapping("/student-detail/{username}")
	public StudentDetailDao getStudentDetail(@PathVariable final String username) {
		return jpaRepository.getStudentDetailDao(username);
	}
	
	@GetMapping("/course-wise-subject-names/{username}")
	public List<Object[]> getCourseWiseSubjectNames(@PathVariable final String username) {
		return jpaRepository.getCourseWiseSubjectNames(username);
	}
}
