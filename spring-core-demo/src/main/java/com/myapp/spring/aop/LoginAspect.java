package com.myapp.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {
	
	@Autowired
	private LoginManagerBean loginManagerBean;
	
	// PointCut Expression Language
	
	// JoinPoints (@Before,@After, @AfterReturning, @AfterThrowing, @Around)
	@Before("execution (* com.myapp.spring.repository.*.*(..))")
	public void authorize() {
		
		LoginBean loginBean = loginManagerBean.getLoggedInUser();
		
		if(loginBean == null) {
			throw new SecurityException("U Must Login To Access The Methods");
		}
		else {
			if(loginBean.getUsername().equals("admin") && loginBean.getPassword().equals("pass")) {
				System.out.println("Welcome User ,"+loginBean.getUsername());
			}
			else {
				throw new SecurityException("Invalid username/password");
			}
		}
	}

}
