package com.myapp.spring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.model.Product;
import com.myapp.spring.repository.ProductRepository;

// This is a Rest Resource Class

// Any Request having the url as /api/v1/products will be processed by objects of type ProductController

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	
	@Autowired
	private ProductRepository repository;
	
	
	// This is a resource which is a noun which has general purpose action as Get
	
	// http://localhost:8090/api/v1/products
	@GetMapping()
	
	public ResponseEntity<List<Product>> loadAllProducts(){
		
		List<Product> products= repository.findAll();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		
	}
	
	@PostMapping()
	
	public ResponseEntity<Product> addNewProduct(@RequestBody Product product){
		
		Product newProduct = repository.save(product);
		return new ResponseEntity<Product>(newProduct, HttpStatus.CREATED);
		
	}
	
	

}
