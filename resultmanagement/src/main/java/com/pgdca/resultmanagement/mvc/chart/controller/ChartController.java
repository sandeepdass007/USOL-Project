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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.pgdca.resultmanagement.chart.dao.DistributionTypePercentageDao;
import com.pgdca.resultmanagement.chart.dao.SemDistributionTypeMarksDao;
import com.pgdca.resultmanagement.chart.dao.SemMarksDao;
import com.pgdca.resultmanagement.chart.dao.SubjectMarksDao;
import com.pgdca.resultmanagement.chart.dao.YearCourseWiseEnrollmentDao;
import com.pgdca.resultmanagement.jpa.JpaRepository;

@Controller
@RequestMapping("/chart")
public class ChartController {

	@Autowired
	private JpaRepository jpaRepository;

	@GetMapping(value = "/course-wise-student-enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Cacheable(value = "publiccharts", key = "#root.methodName")
	public HashMap<String, Long> getCourseWiseStudentEnrollment(final HttpSession httpSession) {
		HashMap<String, Long> map = jpaRepository.getCourseWiseStudentEnrollment();
		return map;
	}

	@GetMapping(value = "/year-course-wise-enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Cacheable(value = "publiccharts", key = "#root.methodName")
	public List<YearCourseWiseEnrollmentDao> getYearCourseWiseEnrollment(final HttpSession httpSession) {
		List<YearCourseWiseEnrollmentDao> listOfDao = jpaRepository.getCourseTypeWiseEnrollment();
		return listOfDao;
	}

	@GetMapping(value = "/student-sem-sub-marks", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Cacheable(value = "studentcharts", key = "#httpSession.getAttribute('username')")
	public HashMap<Integer, List<SubjectMarksDao>> getStudentSemSubMarks(
			@RequestParam(name = "courseId") String courseId, HttpSession httpSession) {
		final String univRegNo = (String) httpSession.getAttribute("username");
		HashMap<Integer, List<SubjectMarksDao>> map = jpaRepository.getStudentSemSubMarks(univRegNo, courseId);
		return map;
	}

	@GetMapping(value = "/student-class-avg-marks-by-sem", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Cacheable(value = "studentcharts", key = "{#root.methodName, #courseId, #httpSession.getAttribute('username')}")
	public String getStudentClassAvgMarksBySem(@RequestParam(name = "courseId") String courseId,
			HttpSession httpSession) {
		final String univRegNo = (String) httpSession.getAttribute("username");
		List<SemMarksDao> avgMarksBySem = jpaRepository.getStudentAvgMarksBySem(univRegNo, courseId);
		List<SemMarksDao> classAvgMarksBySem = jpaRepository.getClassAvgMarksBySem(courseId);
		JsonObject jResponse = new JsonObject();
		jResponse.add("student", new Gson().toJsonTree(avgMarksBySem));
		jResponse.add("class", new Gson().toJsonTree(classAvgMarksBySem));
		return jResponse.toString();
	}

	@GetMapping(value = "/student-avg-marks-by-sem", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Cacheable(value = "studentcharts", key = "{#root.methodName, #courseId, #httpSession.getAttribute('username')}")
	public List<SemMarksDao> getStudentAvgMarksBySem(@RequestParam(name = "courseId") String courseId,
			HttpSession httpSession) {
		final String univRegNo = (String) httpSession.getAttribute("username");
		List<SemMarksDao> avgMarksBySem = jpaRepository.getStudentAvgMarksBySem(univRegNo, courseId);
		return avgMarksBySem;
	}

	@GetMapping(value = "/student-dist-wise-per", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Cacheable(value = "studentcharts", key = "{#root.methodName, #courseId, #httpSession.getAttribute('username')}")
	public List<DistributionTypePercentageDao> getStudentDistributionWisePercentage(
			@RequestParam(name = "courseId") String courseId, HttpSession httpSession) {
		final String univRegNo = (String) httpSession.getAttribute("username");
		List<DistributionTypePercentageDao> studentDistributionWisePercentage = jpaRepository
				.getStudentDistributionWisePercentage(univRegNo, courseId);
		return studentDistributionWisePercentage;
	}

	@GetMapping(value = "/student-sem-dist-type-wise-marks", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Cacheable(value = "studentcharts", key = "{#root.methodName, #courseId, #httpSession.getAttribute('username')}")
	public List<SemDistributionTypeMarksDao> getStudentSemDistributionTypeMarks(
			@RequestParam(name = "courseId") String courseId, HttpSession httpSession) {
		final String univRegNo = (String) httpSession.getAttribute("username");
		List<SemDistributionTypeMarksDao> studentSemDistributionTypeMarks = jpaRepository
				.getStudentSemDistributionTypeMarks(univRegNo, courseId);
		return studentSemDistributionTypeMarks;
	}
}
