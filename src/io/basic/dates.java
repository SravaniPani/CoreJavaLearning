package io.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dates {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new  SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
	}

}
