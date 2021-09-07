package com.pgdca.resultmanagement.mvc.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;
import com.pgdca.resultmanagement.dao.ChangePasswordDao;
import com.pgdca.resultmanagement.mvc.helper.StudentAcademicsHelper;
import com.pgdca.resultmanagement.mvc.helper.StudentAccountHelper;
import com.pgdca.resultmanagement.mvc.helper.StudentHomeHelper;
import com.pgdca.resultmanagement.mvc.helper.StudentProfileHelper;
import com.pgdca.resultmanagement.utils.Constants;

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
	
	@PostMapping(value = "/account/change-password", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String changePassword(@RequestBody ChangePasswordDao changePasswordDao, HttpSession httpSession) {
		String username = (String) httpSession.getAttribute("username");
		// if username session attribute is not present, that means it is a security
		// breach
		// so redirect the user to home page.
		if (!StringUtils.hasText(username)) {
			return "redirect:/";
		}
		final String currentPassword = changePasswordDao.getCurrentPassword();
		final String newPassword = changePasswordDao.getNewPassword();
		final String confirmNewPassword = changePasswordDao.getConfirmNewPassword();
		boolean userValid = studentAccountHelper.isUserValid(username, currentPassword);
		JsonObject jResponse = new JsonObject();
		if(userValid) {
			if(!StringUtils.hasText(newPassword) || !StringUtils.hasText(confirmNewPassword)) {
				jResponse.addProperty("success", false);
				jResponse.addProperty("error", "New Password/Confirm New Password cannot be null!");
			} if(newPassword.equals(confirmNewPassword)) {
				boolean changed = studentAccountHelper.changePassword(username, newPassword);
				if(changed) {
					jResponse.addProperty("success", true);
					jResponse.addProperty("error", Constants.EMPTY_STRING);
				} else {
					jResponse.addProperty("success", false);
					jResponse.addProperty("error", "Couldn't change the password. Contact the administrator.");
				}
			} else {
				jResponse.addProperty("success", false);
				jResponse.addProperty("error", "New Password and Confirm New Password do not match!");
			}
		} else {
			jResponse.addProperty("success", false);
			jResponse.addProperty("error", "Invalid Current Password!");
		}
		return jResponse.toString();
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
