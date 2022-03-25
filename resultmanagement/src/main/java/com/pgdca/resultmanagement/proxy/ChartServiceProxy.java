package com.pgdca.resultmanagement.proxy;

import java.util.HashMap;
import java.util.List;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.pgdca.resultmanagement.chart.dao.DistributionTypePercentageDao;
import com.pgdca.resultmanagement.chart.dao.SemDistributionTypeMarksDao;
import com.pgdca.resultmanagement.chart.dao.SemMarksDao;
import com.pgdca.resultmanagement.chart.dao.SubjectMarksDao;
import com.pgdca.resultmanagement.chart.dao.YearCourseWiseEnrollmentDao;
import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;

@FeignClient(name = "api-gateway")
@LoadBalancerClients({
		@LoadBalancerClient(name = "chart-service"),
		@LoadBalancerClient(name = "student-service")})
public interface ChartServiceProxy {

	@GetMapping(value = "/chart-service/course-wise-student-enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Long> getCourseWiseStudentEnrollment();

	@GetMapping(value = "/chart-service/year-course-wise-enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<YearCourseWiseEnrollmentDao> getYearCourseWiseEnrollment();
	
	@GetMapping(value = "/chart-service/student-sem-sub-marks", produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<Integer, List<SubjectMarksDao>> getStudentSemSubMarks(@RequestParam(name = "univRegNo") String univRegNo, @RequestParam(name = "courseId") String courseId);
	
	@GetMapping(value = "/chart-service/student-class-avg-marks-by-sem", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getStudentClassAvgMarksBySem(@RequestParam(name = "univRegNo") String univRegNo, @RequestParam(name = "courseId") String courseId);
	
	@GetMapping(value = "/chart-service/student-avg-marks-by-sem", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SemMarksDao> getStudentAvgMarksBySem(@RequestParam(name = "univRegNo") String univRegNo, @RequestParam(name = "courseId") String courseId);

	@GetMapping(value = "/chart-service/student-dist-wise-per", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DistributionTypePercentageDao> getStudentDistributionWisePercentage(@RequestParam(name = "univRegNo") String univRegNo, @RequestParam(name = "courseId") String courseId);
	
	@GetMapping(value = "/chart-service/student-sem-dist-type-wise-marks", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SemDistributionTypeMarksDao> getStudentSemDistributionTypeMarks(@RequestParam(name = "univRegNo") String univRegNo, @RequestParam(name = "courseId") String courseId);
	
	@GetMapping("/student-service/student-detail/{username}")
	public StudentDetailDao getStudentDetail(@PathVariable final String username);
	
	@GetMapping("/student-service/course-wise-subject-names/{username}")
	public List<Object[]> getCourseWiseSubjectNames(@PathVariable final String username);
}
