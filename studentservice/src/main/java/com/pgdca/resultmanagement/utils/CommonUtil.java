package com.pgdca.resultmanagement.utils;

import java.util.StringJoiner;

import org.springframework.util.StringUtils;

public abstract class CommonUtil {

	public final static String getFullName(final String firstName, final String middleName, final String lastName) {
		StringJoiner stringJoiner = new StringJoiner(Constants.SPACE);
		if(StringUtils.hasText(firstName)) {
			stringJoiner.add(firstName);
		}
		
		if(StringUtils.hasText(middleName)) {
			stringJoiner.add(middleName);
		}
		
		if(StringUtils.hasText(lastName)) {
			stringJoiner.add(lastName);
		}
		return stringJoiner.toString();
	}
}
