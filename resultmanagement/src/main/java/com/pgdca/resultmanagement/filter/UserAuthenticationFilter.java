package com.pgdca.resultmanagement.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.util.StringUtils;

@WebFilter(urlPatterns = {"/student/*", "/chart/student*"})
public class UserAuthenticationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		HttpSession httpSession = request.getSession();
		String username = (String)httpSession.getAttribute("username");
		if(StringUtils.hasText(username)) {
			chain.doFilter(servletRequest, servletResponse);
		} else {
			response.sendRedirect("/");
		}
	}

}
