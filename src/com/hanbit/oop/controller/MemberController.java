package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.service.MemberService;

public class MemberController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("enter number\n");
			MemberService memberService = new MemberService();
			
			String menu = s.next();
		
			switch(menu){
				case "0": 
					System.out.print("end");
				return;
				
				case "1":
					System.out.println("Name?");
					String name = s.next();
					memberService.setName(name);
					System.out.println("ID?");
					String id = s.next();
					memberService.setId(id);
					System.out.println("PassWord?");
					String pass = s.next();
					memberService.setPassword(pass);
					System.out.println("SSN?");
					String ssn = s.next();
					memberService.setSNN(ssn);
					System.out.println("welcome");
					break;

				case "2":
					System.out.println("가입된 아이디 "+ memberService.getId());
					System.out.println("ID?");
					String loginId = s.next();
					memberService.setloginId(loginId);
					System.out.println("PassWord?");
					String loginPw = s.next();
					memberService.setloginPw(loginPw);
					memberService.setlogin();
					
					System.out.println(memberService.getlogin());
					break;
				
				default:
					break;
			}
		}
	}
	
}
