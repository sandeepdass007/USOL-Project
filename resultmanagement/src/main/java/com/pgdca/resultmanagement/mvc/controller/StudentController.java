package com.pgdca.resultmanagement.mvc.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pgdca.resultmanagement.jpa.JpaRepository;
import com.pgdca.resultmanagement.mvc.helper.StudentProfileHelper;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private JpaRepository jpaRepository;
	
	@Autowired
	private StudentProfileHelper studentProfileHelper;

	@GetMapping({ "/", "/home" })
	public String getHome(Model model, HttpSession httpSession) {
		String username = (String) httpSession.getAttribute("username");
		// if username session attribute is not present, that means it is a security
		// breach
		// so redirect the user to home page.
		if (!StringUtils.hasText(username)) {
			return "redirect:/";
		}
		String studentFullName = jpaRepository.getUserFullName(username);

		if (!StringUtils.hasText(studentFullName)) {
			httpSession.invalidate();
			return "redirect:/";
		}
		model.addAttribute("studentname", studentFullName);
		return "student-home";
	}

	@GetMapping("/profile")
	public String getProfile(Model model, HttpSession httpSession) {
		String username = (String) httpSession.getAttribute("username");
		// if username session attribute is not present, that means it is a security
		// breach
		// so redirect the user to home page.
		if (!StringUtils.hasText(username)) {
			return "redirect:/";
		}

		HashMap<String, Object> modelAttributes = studentProfileHelper.getModelAttributes(username);
		model.addAllAttributes(modelAttributes);
		return "student-profile";
	}

	@GetMapping("/account")
	public String getAccount(Model model, HttpSession httpSession) {
		String username = (String) httpSession.getAttribute("username");
		// if username session attribute is not present, that means it is a security
		// breach
		// so redirect the user to home page.
		if (!StringUtils.hasText(username)) {
			return "redirect:/";
		}
		String studentFullName = jpaRepository.getUserFullName(username);

		if (!StringUtils.hasText(studentFullName)) {
			return "redirect:/";
		}
		model.addAttribute("studentname", studentFullName);
		return "student-account";
	}

	@GetMapping("/academics")
	public String getAcademics(Model model, HttpSession httpSession) {
		String username = (String) httpSession.getAttribute("username");
		// if username session attribute is not present, that means it is a security
		// breach
		// so redirect the user to home page.
		if (!StringUtils.hasText(username)) {
			return "redirect:/";
		}
		String studentFullName = jpaRepository.getUserFullName(username);

		if (!StringUtils.hasText(studentFullName)) {
			return "redirect:/";
		}
		model.addAttribute("studentname", studentFullName);
		return "student-academics";
	}
}
