package com.pgdca.resultmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ResultManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResultManagementApplication.class, args);
	}

}
