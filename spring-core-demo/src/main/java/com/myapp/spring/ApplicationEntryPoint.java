package com.myapp.spring;

import org.springframework.aop.support.AopUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.myapp.spring.aop.LoginManagerBean;
import com.myapp.spring.config.AppConfig;
import com.myapp.spring.repository.ProductRepository;

public class ApplicationEntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Container is initialised
		
		AbstractApplicationContext container = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductRepository repository = container.getBean("impl2",ProductRepository.class);
		LoginManagerBean loginManagerBean=container.getBean(LoginManagerBean.class);
		
		
//		ProductRepository repository1 = container.getBean("impl2",ProductRepository.class);
//		
//		
//		System.out.println(repository == repository1);
		
		
		//repository.findAll().forEach(System.out::println);
		
		System.out.println("Aop Proxy "+AopUtils.isAopProxy(repository));
		
		loginManagerBean.login("admin", "pass");
		
		repository.searchByName("ipad").forEach(System.out::println);
		
		container.close();
		
		
		
		
		
		

	}

}

// OOPS Concepts (Encapsulation,INheritance,Polymorphism,Abstraction)
// SOLID Principles
// AOP (Aspect Oriented Programming)







