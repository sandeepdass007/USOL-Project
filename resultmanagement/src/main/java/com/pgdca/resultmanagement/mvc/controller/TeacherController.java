package com.pgdca.resultmanagement.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@GetMapping({ "/", "/home" })
	public String getHome(HttpSession httpSession) {
		String username = (String) httpSession.getAttribute("username");
		// if username session attribute is not present, that means it is a security
		// breach so redirect the user to home page.
		if (!StringUtils.hasText(username)) {
			return "redirect:/";
		}
		
		return "teacher-home";
	}
}
