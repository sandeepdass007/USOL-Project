package com.pgdca.resultmanagement.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping({"/", "/home"})
	public String getHome(Model model, HttpSession httpSession) {
		String username = (String)httpSession.getAttribute("username");
		// if username session attribute is not present, that means it is a security breach
		// so redirect the user to home page.
		if(!StringUtils.hasText(username)) {
			return "redirect:/";
		}
		model.addAttribute("student-name", username);
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
