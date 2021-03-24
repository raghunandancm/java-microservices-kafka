package com.myapp.spring.repository;

import java.security.Principal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Product;

// Annotations

// Spring Managed Bean (Spring Bean Container will manage objects of type ProductRepository 
// and also takes care of dependency management as well)

// @Repository, @Service, @Controller, @RestController, @Component, @Configuration

@Repository("impl2")
//@Scope("prototype")
public  class ProductRepositoryImpl2 implements ProductRepository {
	
	// Dependency Injection
	
	
	
	private Map<Integer, Product> map1;
	
	
	
	@Autowired
	public ProductRepositoryImpl2(@Qualifier("map2") Map<Integer, Product> map1) {
		this.map1 = map1;
	}

	@PostConstruct
	public void intialize() {
		System.out.println("Inside Initialize");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside Destroy");
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
//		Principal principal =null;
//		String role=principal.getName();
//		if(role.equals("admin")) {
		
		map1.put(product.getProductId(), product);
		//}

	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return map1.values().stream().collect(Collectors.toList());
	}

	@Override
	public List<Product> searchByName(String productName) {
		
		// TODO Auto-generated method stub
		return map1.values().stream()
				.filter(p->p.getProductName().equalsIgnoreCase(productName)).collect(Collectors.toList());
	}

	@Override
	public void delete(int productId) {
		// TODO Auto-generated method stub
//		Principal principal =null;
//		String role=principal.getName();
//		if(role.equals("admin")) {
		map1.remove(productId);
		}
		

	//}

}
