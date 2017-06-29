package com.hanbit.oop.service;

public class MemberService {
	
	private String id, password, name, ssn, gender, age, result, loginId, loginPw;
	
	public void setloginId(String loginId){
		this.loginId = loginId;
	}
	public String getloginId(){
		return loginId;
	}
	
	public void setloginPw(String loginPw){
		this.loginPw = loginPw;
	}
	public String getloginPw(){
		return loginPw;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}

	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return password;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setSNN(String ssn){
		this.ssn = ssn;
	}
	public String getSSN(){
		return ssn;
	}

	public void setGender(){
		char ch = ssn.charAt(7);
		switch (ch){
			case '1' :
				gender = "male";
			break;
			case '2' :
				gender = "female";
			break;
			case '3' :
				gender = "male";
			break;
			case '4' :
				gender = "female";
			break;
			case '5' :
				gender = "foreigner";
			break;
			case '6' :
				gender = "foreigner";
			break;
			default: 
				gender = "error";
			break;
		}
	}
	public String getGender(){
		return gender;
	}
	
	public void setAge(){
		int year = Integer.parseInt(ssn.substring(0,2));
		
		if(17-year>=0){
			age = String.valueOf(17-year);
		}
		else {
			age = String.valueOf(2017-1900-year);
		}
	}
	public String getAge(){
		return age;
	}
	
	
	public void setlogin() {
		if(!id.equals(loginId)){
			result = "ID is not exeist";
		}
		else if(id.equals(loginId)) {
			if(!password.equals(loginPw)){
				result = "wrong password";
			}
			else {
				result = toString();
			}
		}
	}
	public String getlogin(){
		return result;
	}
	public String toString(){
		return "Welcome" +name+ "("+gender+","+ age+")";
	}
	
}
