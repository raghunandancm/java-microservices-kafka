package com.myapp.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.myapp.spring.model.Product;
import com.myapp.spring.model.Review;
import com.myapp.spring.repository.ProductRepository;

@SpringBootApplication
public class SpringBootDemoJpaApplication {
	
	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoJpaApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			
//			repository.saveAll(Arrays.asList(new Product("Iphone", 48754.5, "Iphone12Pro", 3.9),
//					new Product("Iphone", 58754.5, "Iphone11", 4.2),
//					new Product("Iphone", 38754.5, "Iphone8", 3.9)));
			
			Product oneplusNord =repository.findById(1).get();
			
			Review review1 = new Review("My Comment3");
			Review review2 = new Review("My Comment4");
			
			Map<Integer, Review> reviews = new HashMap<>();
			reviews.put(4, review1);
			reviews.put(5, review2);
			oneplusNord.setReviews(reviews);
			
			repository.save(oneplusNord);
			
		};
		
	}

}

//@SpringBootApplication = @Configuration, @ComponentScan, @EnableAutoConfiguration

// Spring Boot Application StartUp Procedure

// Step1. Entry Class which has main method where SpringApplication.run() will be executed

// Step2. SpringBootApplication Annotation is processed and ComponentScan is loaded where it starts autoscanning of classes
// like @Repository, @Service, @Controller, @RestController

// Step3 Environment Properties are loaded (starts looking for application.properties)

// Step4 Enable Auto Configuration will auto load the beans based on the environment setup

// Step5 AutoWiring Of The Beans are completed

// Step6 Starts The Embedded Tomcat Server

// Step7 Application is ready for use
