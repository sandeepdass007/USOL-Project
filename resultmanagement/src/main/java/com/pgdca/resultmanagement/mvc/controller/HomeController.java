package com.pgdca.resultmanagement.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {

	@GetMapping({"/", "/home"})
	public String showHomePage() {
		return "home-page";
	}
}
