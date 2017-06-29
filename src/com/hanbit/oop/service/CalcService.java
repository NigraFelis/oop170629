package com.hanbit.oop.service;

public class CalcService {
	public String calcBMI(double w,double h) {
		double bmi = w/(h*h);
		String result = null;	
		if(bmi<=24.9) {
			if(bmi<=18.5) {
				result = "low weight";	
			}
			else{
				result = "nomal";
			}
		}
		else if(bmi>24.9) {
			if(bmi>=29.9) {
				result = "over weight";	
			}
			else{
				result = "fat";
			}
		}		
		/*System.out.println("my weight is " + w);
		System.out.println("my height is " + h);
		System.out.println("my bmi is " + bmi);
		System.out.println("result is " + result);*/
		return result;
	}		
	public String calcPlus(String a, String b){
		return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
	}
	public String calcMinus(String a, String b){
		return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
	}
	public String calcBy(String a, String b){
		return String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
	}
	public String calcDivide(String a, String b){
		return String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
	}
	public String calcTax(String num1, String num2){	
		String result = "";
		return result;
	}
	public String calcTime(String second){	
		String result = "";
		return result;
	}	
}
