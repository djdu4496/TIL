package com.kh.practice.leap.controller;

import java.util.Calendar;


public class LeapController {
	public boolean isLeapYear(int year) {	
		
		boolean T =false;
		
		if((year%4==0&&year%100!=0)||year%400==0) {
			T=true;
		} else {
			T=false;
		}
		return T;
	}
	
	public long leapDate(Calendar c) {
		
		long totalDate = 0;	
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
				
		for(int i=1;i<year;i++) {
			if((i%4==0&&i%100!=0)||i%400==0) {
				totalDate +=366;
			} else {
				totalDate +=365;
			}
		}
		
		for(int i=1;i<month;i++) {
			switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				totalDate +=31; break;
			case 4:
			case 6:
			case 9:
			case 11: 
				totalDate +=30; break;
			case 2:
				if((i%4==0&&i%100!=0)||i%400==0) {
				totalDate +=29; 
				} else {
					totalDate +=28;
				}
				break;
			}
		}
			totalDate+=date;
		return totalDate;

	}
}
