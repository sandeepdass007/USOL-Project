package com.pgdca.resultmanagement.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pgdca.resultmanagement.dao.LogoutResponse;

@Controller
@RequestMapping(path = "/logout")
public class LogoutController {
	
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public LogoutResponse logout(HttpServletRequest request,
			HttpServletResponse response,
			HttpSession httpSession) throws ServletException, IOException {
		try {
			httpSession.invalidate();
		} catch(Exception exception) {
			exception.printStackTrace();
			return new LogoutResponse(false, exception.getMessage());
		}
		return new LogoutResponse(true, null);
	}

}
