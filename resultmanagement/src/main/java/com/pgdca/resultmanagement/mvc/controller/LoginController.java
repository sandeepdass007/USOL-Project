package com.pgdca.resultmanagement.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pgdca.resultmanagement.dao.LoginCredentials;
import com.pgdca.resultmanagement.dao.LoginResponse;
import com.pgdca.resultmanagement.dao.LoginCredentials.Debug;
import com.pgdca.resultmanagement.jpa.JpaRepository;
import com.pgdca.resultmanagement.mvc.dao.CredentialsDao;
import com.pgdca.resultmanagement.utils.Constants;

@Controller
@RequestMapping(path = "/login")
public class LoginController {
	
	@Autowired
	private JpaRepository jpaRepository;

	@PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public LoginResponse login(@RequestBody LoginCredentials loginCredentials,
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession httpSession) throws ServletException, IOException {
		final String username = loginCredentials.getUsername();
		final String password = loginCredentials.getPassword();
		Debug debug = loginCredentials.getDebug();
		if(debug != null && debug.isEnable() && debug.isForceFail()) {
			return new LoginResponse(false, "Force Fail", null);
		}
		/*
		 * Logic to validate username and password from database
		 * */
		String error = "Username/Password combination doesn't match";
		String userType = Constants.EMPTY_STRING;
		CredentialsDao credentials = jpaRepository.getCredentials(username, password);
		if(credentials != null) {
			httpSession.setAttribute("username", username);
			httpSession.setAttribute("userType", credentials.getUserType());
			error = Constants.EMPTY_STRING;
			userType = credentials.getUserType();
		}
		return new LoginResponse(credentials != null, error, userType);
	}
}
