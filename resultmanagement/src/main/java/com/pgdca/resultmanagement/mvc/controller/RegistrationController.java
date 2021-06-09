package com.pgdca.resultmanagement.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

	@GetMapping("/student")
	public String registerStudent() {
		return "student-registration";
	}
}
