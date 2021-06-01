package com.pgdca.resultmanagement.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {

	@GetMapping({"/", "/welcome"})
	public String showHomePage(HttpSession httpSession) {
		String username = (String) httpSession.getAttribute("username");
		if(StringUtils.hasText(username)) {
			return "redirect:/student/";
		}
		return "home-page";
	}
}
