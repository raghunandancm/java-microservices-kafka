package com.myapp.spring.repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Product;

// Annotations

// Spring Managed Bean (Spring Bean Container will manage objects of type ProductRepository 
// and also takes care of dependency management as well)

// @Repository, @Service, @Controller, @RestController, @Component, @Configuration

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	// Dependency Injection
	
	
	@Autowired
	private Map<Integer, Product> map;
	

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		map.put(product.getProductId(), product);

	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return map.values().stream().collect(Collectors.toList());
	}

	@Override
	public List<Product> searchByName(String productName) {
		// TODO Auto-generated method stub
		return map.values().stream()
				.filter(p->p.getProductName().equalsIgnoreCase(productName)).collect(Collectors.toList());
	}

	@Override
	public void delete(int productId) {
		// TODO Auto-generated method stub
		
		map.remove(productId);
		

	}

}
