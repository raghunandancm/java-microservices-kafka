package com.myapp.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.spring.model.Product;


// Spring DATA


@Repository
@Transactional(propagation = Propagation.REQUIRED)
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	
	// select * from products where price>=
	Optional<List<Product>> findByPriceGreaterThanEqual(Double price);
	
	// select * from products where  productName=? or price>=?
	Optional<List<Product>> findByProductNameOrPriceGreaterThanEqual(String productName,Double price);
	
	
	Optional<List<Product>> findByProductNameLikeOrderByPriceDesc(String productName);
	
	Optional<List<Product>> findByProductNameLike(String productName);
	
	Optional<List<Product>> findByPriceIn(List<Double> prices);
	
	Optional<List<Product>> findByProductNameIgnoreCase(String productName);
	
	
	@Query("select p from Product p where p.productName like %?1")
	Optional<List<Product>> findByProductName(String productName);
	
	
	@Query("select p from Product p where p.price >=:price")
	Optional<List<Product>> findByPrice(@Param("price")Double price);
	
	

	
	

}
