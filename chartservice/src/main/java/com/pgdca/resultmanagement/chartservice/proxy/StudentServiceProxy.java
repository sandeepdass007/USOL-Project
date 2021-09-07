package com.pgdca.resultmanagement.chartservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "student-service", url = "localhost:8000")
@FeignClient(name = "student-service")
public interface StudentServiceProxy {

	@GetMapping("/student/{name}")
	public String getMessage(@PathVariable String name);
	
}
