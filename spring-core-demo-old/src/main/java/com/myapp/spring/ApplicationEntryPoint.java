package com.myapp.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.myapp.spring.config.AppConfig;
import com.myapp.spring.repository.ProductRepository;

public class ApplicationEntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Container is initialised
		
		AbstractApplicationContext container = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductRepository repository = container.getBean(ProductRepository.class);
		
		//repository.findAll().forEach(System.out::println);
		
		repository.searchByName("ipad").forEach(System.out::println);
		
		container.close();
		
		
		
		
		
		

	}

}
