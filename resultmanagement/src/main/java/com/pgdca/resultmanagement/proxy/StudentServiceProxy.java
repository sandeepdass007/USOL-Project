//package com.pgdca.resultmanagement.proxy;
//
//import java.util.List;
//
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import com.pgdca.resultmanagement.mvc.dao.StudentDetailDao;
//
//@FeignClient(value = "api-gateway")
//@LoadBalancerClient(name = "student-service")
//public interface StudentServiceProxy {
//
//	@GetMapping("/student-detail/{username}")
//	public StudentDetailDao getStudentDetail(@PathVariable final String username);
//	
//	@GetMapping("/course-wise-subject-names/{username}")
//	public List<Object[]> getCourseWiseSubjectNames(@PathVariable final String username);
//}
