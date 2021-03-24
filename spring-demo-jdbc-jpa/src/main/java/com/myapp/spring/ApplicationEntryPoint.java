package com.myapp.spring;

import org.springframework.aop.support.AopUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.myapp.spring.config.JdbcConfig;
import com.myapp.spring.model.Product;
import com.myapp.spring.repository.ProductRepository;

public class ApplicationEntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Container is initialised
		
		AbstractApplicationContext container = 
				new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		ProductRepository repository = container.getBean(ProductRepository.class);
		
		System.out.println("AOP Proxy "+AopUtils.isAopProxy(repository));
		
		//repository.add(new Product(5, "Iphone12", 86754, "Iphone12Retina", 4.2));
		
//		repository.searchByName("Iphone12").forEach(System.out::println);
		
		repository.findAll().forEach(System.out::println);
		
		container.close();
		
		
		
		
		
		

	}

}

// OOPS Concepts (Encapsulation,INheritance,Polymorphism,Abstraction)
// SOLID Principles
// AOP (Aspect Oriented Programming)







