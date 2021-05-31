package com.pgdca.resultmanagement.mvc.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pgdca.resultmanagement.mvc.helper.StudentAcademicsHelper;
import com.pgdca.resultmanagement.mvc.helper.StudentAccountHelper;
import com.pgdca.resultmanagement.mvc.helper.StudentHomeHelper;
import com.pgdca.resultmanagement.mvc.helper.StudentProfileHelper;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentHomeHelper studentHomeHelper;
	
	@Autowired
	private StudentProfileHelper studentProfileHelper;
	
	@Autowired
	private StudentAccountHelper studentAccountHelper;
	
	@Autowired
	private StudentAcademicsHelper studentAcademicsHelper;

	@GetMapping({ "/", "/home" })
	public String getHome(ModelMap modelMap, HttpSession httpSession) {
		String username = (String) httpSession.getAttribute("username");
		// if username session attribute is not present, that means it is a security
		// breach
		// so redirect the user to home page.
		if (!StringUtils.hasText(username)) {
			return "redirect:/";
		}
		
		HashMap<String, Object> modelAttributes = studentHomeHelper.getModelAttributes(username);
		modelMap.addAllAttributes(modelAttributes);
		return "student-home";
	}

	@GetMapping("/profile")
	public String getProfile(ModelMap modelMap, HttpSession httpSession) {
		String username = (String) httpSession.getAttribute("username");
		// if username session attribute is not present, that means it is a security
		// breach
		// so redirect the user to home page.
		if (!StringUtils.hasText(username)) {
			return "redirect:/";
		}

		HashMap<String, Object> modelAttributes = studentProfileHelper.getModelAttributes(username);
		modelMap.addAllAttributes(modelAttributes);
		return "student-profile";
	}

	@GetMapping("/account")
	public String getAccount(ModelMap modelMap, HttpSession httpSession) {
		String username = (String) httpSession.getAttribute("username");
		// if username session attribute is not present, that means it is a security
		// breach
		// so redirect the user to home page.
		if (!StringUtils.hasText(username)) {
			return "redirect:/";
		}
		
		HashMap<String, Object> modelAttributes = studentAccountHelper.getModelAttributes(username);
		modelMap.addAllAttributes(modelAttributes);
		return "student-account";
	}

	@GetMapping("/academics")
	public String getAcademics(ModelMap modelMap, HttpSession httpSession) {
		String username = (String) httpSession.getAttribute("username");
		// if username session attribute is not present, that means it is a security
		// breach
		// so redirect the user to home page.
		if (!StringUtils.hasText(username)) {
			return "redirect:/";
		}
		
		HashMap<String, Object> modelAttributes = studentAcademicsHelper.getModelAttributes(username);
		modelMap.addAllAttributes(modelAttributes);
		return "student-academics";
	}
}
