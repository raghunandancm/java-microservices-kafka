package com.myapp.spring.aop;

public class LoginBean {
	
	private String username,password;

	public LoginBean(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}

}
