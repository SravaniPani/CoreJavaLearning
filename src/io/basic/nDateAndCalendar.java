package io.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class nDateAndCalendar {

	public static void main(String[] args) {
		
		
		Date d = new Date();
		SimpleDateFormat sd= new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
		System.out.println(sdf.format(d));
		//There will be some extra features in calendar compared to date format.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.DATE));


	}

}
