package com.pgdca.resultmanagement.utils;

import org.springframework.util.StringUtils;

public abstract class CommonUtil {

	public final static String getFullName(final String firstName, final String middleName, final String lastName) {
		String fullName = firstName + (StringUtils.hasText(middleName) ? Constants.SPACE + middleName : Constants.EMPTY_STRING)
				+ (StringUtils.hasText(lastName) ? " " + lastName : Constants.EMPTY_STRING);
		return fullName;
	}
}
