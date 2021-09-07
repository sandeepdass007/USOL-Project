package com.pgdca.resultmanagement.mvc.dao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateDao {

	private Date date;
	private Calendar calendar = Calendar.getInstance();

	@SuppressWarnings("unused")
	private DateDao() {
	}
	
	public DateDao(Date date) {
		super();
		this.date = date;
		calendar.setTime(this.date);
	}
	
	public int getDate() {
		return calendar.get(Calendar.DATE);
	}
	
	public int getMonth() {
		return calendar.get(Calendar.MONTH);
	}
	
	public String getMonthName() {
		return new SimpleDateFormat("MMM").format(calendar.getTime());
	}
	
	public int getYear() {
		return calendar.get(Calendar.YEAR);
	}
}
