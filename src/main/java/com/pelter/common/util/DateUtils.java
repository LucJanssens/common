package com.pelter.common.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	private static Calendar calendar;
	
	public static String getCurrentTime(String pattern){
		return getCalendarTime(pattern, getCurrentTime());
	}
	
	public static Date getCurrentTime(){
		if(calendar == null)
			calendar = Calendar.getInstance();
		return calendar.getTime();
	}
	public static String getCalendarTime(String pattern, Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	
	public static int getAge(LocalDate createDate) throws NullPointerException{
		return Period.between(createDate, LocalDate.now()).getYears();		
	}
}
