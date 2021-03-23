package com.myapp.spring.repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
@Scope("prototype")
public class ProductRepositoryImpl2 implements ProductRepository {
	
	// Dependency Injection
	
	
	@Autowired
	@Qualifier("map2")
	private Map<Integer, Product> map1;
	

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		map1.put(product.getProductId(), product);

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
		
		map1.remove(productId);
		

	}

}
