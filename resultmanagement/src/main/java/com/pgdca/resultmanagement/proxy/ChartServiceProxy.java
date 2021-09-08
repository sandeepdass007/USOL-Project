package com.pgdca.resultmanagement.proxy;

import java.util.HashMap;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pgdca.resultmanagement.chart.dao.DistributionTypePercentageDao;
import com.pgdca.resultmanagement.chart.dao.SemDistributionTypeMarksDao;
import com.pgdca.resultmanagement.chart.dao.SemMarksDao;
import com.pgdca.resultmanagement.chart.dao.SubjectMarksDao;
import com.pgdca.resultmanagement.chart.dao.YearCourseWiseEnrollmentDao;

@FeignClient(name = "chart-service")
public interface ChartServiceProxy {

	@GetMapping(value = "/course-wise-student-enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Long> getCourseWiseStudentEnrollment();

	@GetMapping(value = "/year-course-wise-enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<YearCourseWiseEnrollmentDao> getYearCourseWiseEnrollment();
	
	@GetMapping(value = "/student-sem-sub-marks", produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<Integer, List<SubjectMarksDao>> getStudentSemSubMarks(@RequestParam(name = "univRegNo") String univRegNo, @RequestParam(name = "courseId") String courseId);
	
	@GetMapping(value = "/student-class-avg-marks-by-sem", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getStudentClassAvgMarksBySem(@RequestParam(name = "univRegNo") String univRegNo, @RequestParam(name = "courseId") String courseId);
	
	@GetMapping(value = "/student-avg-marks-by-sem", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SemMarksDao> getStudentAvgMarksBySem(@RequestParam(name = "univRegNo") String univRegNo, @RequestParam(name = "courseId") String courseId);

	@GetMapping(value = "/student-dist-wise-per", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DistributionTypePercentageDao> getStudentDistributionWisePercentage(@RequestParam(name = "univRegNo") String univRegNo, @RequestParam(name = "courseId") String courseId);
	
	@GetMapping(value = "/student-sem-dist-type-wise-marks", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SemDistributionTypeMarksDao> getStudentSemDistributionTypeMarks(@RequestParam(name = "univRegNo") String univRegNo, @RequestParam(name = "courseId") String courseId);
}
