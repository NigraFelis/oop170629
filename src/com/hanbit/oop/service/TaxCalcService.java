package com.hanbit.oop.service;

import java.util.Scanner;

public class TaxCalcService {
	public String ExTaxCalc(String name, int salar){
		
		double tax = 0;
		if(salar<=1200){
			tax = 0.08;
		}
		else if(salar>1200&&salar<=4600){
			tax = 0.17;
		}
		else if(salar>4600&&salar<=8800){
			tax = 0.26;
		}
		else if(salar>8800){
			tax = 0.35;
		}
		int result = (int)(salar * tax);;
			
		String Tax = ("********************************\n"
						+"이름  |  연봉  |  세율  |  납부할 세금\n"
						+name+"/t"+salar+"/t"+(int)(tax*100)+"/t"+result+"\n"
						+"********************************\n");
		return Tax;
				
	}
}