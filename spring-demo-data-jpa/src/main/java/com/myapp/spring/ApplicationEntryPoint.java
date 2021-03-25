package com.myapp.spring;

import java.util.Arrays;

import org.springframework.aop.support.AopUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.myapp.spring.config.JpaConfig;
import com.myapp.spring.model.Product;
import com.myapp.spring.repository.ProductRepository;

public class ApplicationEntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Container is initialised
		
		AbstractApplicationContext container = 
				new AnnotationConfigApplicationContext(JpaConfig.class);
		
		ProductRepository repository = container.getBean(ProductRepository.class);
		
		System.out.println("AOP Proxy "+AopUtils.isAopProxy(repository));
		
		
		repository.findByProductNameLikeOrderByPriceDesc("iphone").get().forEach(System.out::println);
		
		
//		repository.saveAll(Arrays.asList(new Product("Iphone", 48754.5, "Iphone12Pro", 3.9),
//				new Product("Iphone", 58754.5, "Iphone11", 4.2),
//				new Product("Iphone", 38754.5, "Iphone8", 3.9)));
	
	//	repository.findAll().forEach(System.out::println);
		
		container.close();
		
		
		
		
		
		

	}

}

// OOPS Concepts (Encapsulation,INheritance,Polymorphism,Abstraction)
// SOLID Principles
// AOP (Aspect Oriented Programming)







