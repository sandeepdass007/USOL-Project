package com.pgdca.resultmanagement.chart;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public HashMap<String, Long> getCourseWiseStudentEnrollment(final HttpSession httpSession) {
		HashMap<String, Long> map = jpaRepository.getCourseWiseStudentEnrollment();
		return map;
	}

	@GetMapping(value = "/year-course-wise-enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<YearCourseWiseEnrollmentDao> getYearCourseWiseEnrollment(final HttpSession httpSession) {
		List<YearCourseWiseEnrollmentDao> listOfDao = jpaRepository.getCourseTypeWiseEnrollment();
		return listOfDao;
	}

	@GetMapping(value = "/student-sem-sub-marks", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public HashMap<Integer, List<SubjectMarksDao>> getStudentSemSubMarks(
			@RequestParam(name = "courseId") String courseId, HttpSession httpSession) {
		final String univRegNo = (String) httpSession.getAttribute("username");
		HashMap<Integer, List<SubjectMarksDao>> map = jpaRepository.getStudentSemSubMarks(univRegNo, courseId);
		return map;
	}
}
