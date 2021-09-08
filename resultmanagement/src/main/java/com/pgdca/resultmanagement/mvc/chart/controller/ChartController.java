package com.pgdca.resultmanagement.mvc.chart.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pgdca.resultmanagement.chart.dao.YearCourseWiseEnrollmentDao;
import com.pgdca.resultmanagement.proxy.ChartServiceProxy;

@Controller
@RequestMapping("/chart")
public class ChartController {

	@Autowired
	private ChartServiceProxy chartServiceProxy;

	@GetMapping(value = "/course-wise-student-enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Cacheable(value = "publiccharts", key = "#root.methodName")
	public HashMap<String, Long> getCourseWiseStudentEnrollment(final HttpSession httpSession) {
		HashMap<String, Long> map = chartServiceProxy.getCourseWiseStudentEnrollment();
		return map;
	}
	
	@GetMapping(value = "/year-course-wise-enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<YearCourseWiseEnrollmentDao> getYearCourseWiseEnrollment(final HttpSession httpSession) {
		List<YearCourseWiseEnrollmentDao> listOfDao = chartServiceProxy.getYearCourseWiseEnrollment();
		return listOfDao;
	}
}
