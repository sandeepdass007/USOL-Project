package com.pgdca.resultmanagement.proxy;

import java.util.HashMap;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.pgdca.resultmanagement.chart.dao.YearCourseWiseEnrollmentDao;

@FeignClient(name = "chart-service")
public interface ChartServiceProxy {

	@GetMapping(value = "/course-wise-student-enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Long> getCourseWiseStudentEnrollment();

	@GetMapping(value = "/year-course-wise-enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<YearCourseWiseEnrollmentDao> getYearCourseWiseEnrollment();

}
