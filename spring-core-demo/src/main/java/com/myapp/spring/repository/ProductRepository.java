package com.myapp.spring.repository;

import java.util.List;

import com.myapp.spring.model.Product;

public interface ProductRepository {
	
	void add(Product product);
	
	List<Product> findAll();
	
	List<Product> searchByName(String productName);
	
	void delete(int productId);

}
