package com.myapp.spring.api;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PutMapping("/{id}")
	
	public ResponseEntity<Product> updateExistingProduct(@PathVariable("id") Integer id,@RequestBody Product product) throws ProductNotFoundException{
		
		Product existingproduct=repository.findById(id).get();
		
		System.out.println("existing product id "+existingproduct.getProductId());
		if(existingproduct.getProductId() == 0) {
			System.out.println("Inside ProductId If ");
			throw new ProductNotFoundException("productId- "+id+" Not Found");
		}
		
		System.out.println("Outside ProductIdIf ");
		
			BeanUtils.copyProperties(product, existingproduct);
			existingproduct = repository.save(existingproduct);
		
		
		return new ResponseEntity<Product>(existingproduct, HttpStatus.OK);
		
	}
	
// http://localhost:8090/api/v1/products?productId=1&rating=3&description=
	
	@DeleteMapping()
	public ResponseEntity<String> deleteExistingProduct(@RequestParam("productId") Integer productId){
		
		repository.deleteById(productId);
		
		return new ResponseEntity<String>("Deleted", HttpStatus.NO_CONTENT);
		
		
	}
	
	
	
	
	

}
