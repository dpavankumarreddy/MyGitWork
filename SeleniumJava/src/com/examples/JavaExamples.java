package com.examples;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class JavaExamples {
	
	public static void main(String[] args) {
		
		// Date d=new Date();
		Calendar cal=Calendar.getInstance();
		
		//SimpleDateFormat sdf=new SimpleDateFormat("M/dd//yyyy");
		SimpleDateFormat sf=new SimpleDateFormat("M/dd//yyyy hh:M:SS");
		System.out.println(sf.format(cal.getTime()));
			System.out.println(cal.get(Calendar.AM_PM));	
		//System.out.println(sdf.format(d));
		//System.out.println(sf.format(d));
		//System.out.println(d.toString());
         
	
		
		
		
	}

}
