package com.pgdca.resultmanagement.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pgdca.resultmanagement.dto.LoginCredentials;
import com.pgdca.resultmanagement.dto.LoginCredentials.Debug;
import com.pgdca.resultmanagement.dto.LoginResponse;

@Controller
@RequestMapping(path = "/login")
public class LoginController {

	@PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public LoginResponse login(@RequestBody LoginCredentials loginCredentials, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// final String username = loginCredentials.getUsername();
		// final String password = loginCredentials.getPassword();
		/*
		 * Logic to validate username and password from database
		 * */
		Debug debug = loginCredentials.getDebug();
		if(debug != null && debug.isEnable() && debug.isForceFail()) {
			return new LoginResponse(false, "Force Fail");
		}
		return new LoginResponse(true, null);
	}
}
