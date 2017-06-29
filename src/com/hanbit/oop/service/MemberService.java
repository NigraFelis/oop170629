package com.hanbit.oop.service;

public class MemberService {
	
	private String id, password, name, ssn, gender, age, login, loginId, loginPw;
	
	public void setloginId(String id){
		this.loginId = id;
	}
	public String getloginId(){
		return loginId;
	}
	
	public void setloginPw(String pw){
		this.loginPw = pw;
	}
	public String getloginPw(){
		return loginPw;
	}
	
	public void setId(String id){
		this.id = id;
		System.out.println("입력된 아이디"+id);
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
	
	public String setSNN(String ssn){
		return ssn;
	}
	public String getSSN(){
		return ssn;
	}

	public String setGender(String gender){
		return gender;
	}
	public String getGender(){
		return gender;
	}
	
	public String setAge(String age){
		return age;
	}
	public String getAge(){
		return age;
	}
	
	public void setlogin() {
		
		if(!id.equals(loginId)){
			System.out.print("ID is not exeist");
			return;
		}
		else if(id.equals(loginId)) {
			if(!password.equals(loginPw)){
			login = "wrong password";
			}
			else {
				login = toString();
			}
		}
		
	}
	public String getlogin() {
		return login;
	}
	
	public String toString(){
		return "Welcome" +name+ "("+gender+","+ age+")";
	}
	
}
