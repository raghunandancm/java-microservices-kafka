package com.myapp.spring.aop;

import org.springframework.stereotype.Component;



@Component
public class LoginManagerBean {
	
	private static ThreadLocal<LoginBean> threadLocal = new ThreadLocal<>();
	
	public void login(String username,String password) {
		LoginBean loginBean = threadLocal.get();
		if(loginBean == null) {
			loginBean = new LoginBean(username, password);
			threadLocal.set(loginBean);
		}
		
	}
	
	public void logout() {
		if(threadLocal.get()!=null) {
			threadLocal.remove();
		}
		
	}
	
	public LoginBean getLoggedInUser() {
		return threadLocal.get();
	}

}
