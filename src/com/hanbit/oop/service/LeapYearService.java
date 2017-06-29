package com.hanbit.oop.service;

public class LeapYearService {
	public String ExLeapYear(int y) {
		
		String result = "";
		
			if(y%4==0){
				if(y%100==0){
					result = "nomal year";	
					if(y%400==0){
					result = "leap year";
					}
				}			
			}
			else {
				result = "nomal year";
			}
		return result;	
	}
}