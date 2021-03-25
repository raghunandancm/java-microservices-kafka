package com.myapp.spring.repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.spring.model.Product;

// Annotations

// Spring Managed Bean (Spring Bean Container will manage objects of type ProductRepository 
// and also takes care of dependency management as well)

// @Repository, @Service, @Controller, @RestController, @Component, @Configuration

@Repository
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.SERIALIZABLE,timeout = 500)
public class ProductRepositoryImpl implements ProductRepository {
	
	// Dependency Injection
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	//@Transactional(propagation = Propagation.REQUIRED)
	public void add(Product product) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into products(productId,productName,[description],price,starRating) values(?,?,?,?,?)", product.getProductId(),product.getProductName(),
				product.getDescription(),product.getPrice(),product.getStarRating());
		

	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
//		return jdbcTemplate.query("select * from products", new BeanPropertyRowMapper<Product>(Product.class));
		
		
		return jdbcTemplate.query("select * from products",(ResultSet rs,int rowNum)->{
			Product product =new Product();
			product.setProductId(rs.getInt("productId"));
			product.setProductName(rs.getString("productName"));
			product.setDescription(rs.getString("description"));
			product.setPrice(rs.getDouble("price"));
			product.setStarRating(rs.getDouble("starRating"));
			
			
			return product;
		});
	}

	@Override
	public List<Product> searchByName(String productName) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from products where productName=?", new BeanPropertyRowMapper<Product>(Product.class), productName);
				
	}

	@Override
	public void delete(int productId) {
		// TODO Auto-generated method stub
		
		
		

	}

}


// JPA


// JAVA Application

// PERSISTENCE API

// PERSISTENCE Provider (Hibernate)

// JDBC Calls

// PERSIST The DATA



