package com.myapp.spring.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.myapp.spring.model.Product;


//Spring Managed Bean (Spring Bean Container will manage objects of type ProductRepository 
//and also takes care of dependency management as well)

@Configuration
@ComponentScan(basePackages = "com.myapp.spring")
public class AppConfig {
	
	@Bean
	public Map<Integer, Product> map(){
		
		Map<Integer, Product> map = new HashMap<>();
		
		map.put(1, new Product(1, "Iphone12", 76543.50, "Iphone12Pro", 4.5));
		
		map.put(4, new Product(4, "Ipad", 46543.50, "Ipad11Pro", 4.2));
		
		map.put(5, new Product(1, "Macbook", 176543.50, "Macbook15Pro", 4.7));
		
		return map;
		
	}

}
