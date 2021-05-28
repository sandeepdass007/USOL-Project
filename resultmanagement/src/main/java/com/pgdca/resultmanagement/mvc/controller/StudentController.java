package com.pgdca.resultmanagement.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping({"/", "/home"})
	public String getHome() {
		return "student-home";
	}
	
	@GetMapping("/profile")
	public String getProfile() {
		return "student-profile";
	}
	
	@GetMapping("/account")
	public String getAccount() {
		return "student-account";
	}
	
	@GetMapping("/academics")
	public String getAcademics() {
		return "student-academics";
	}
}
