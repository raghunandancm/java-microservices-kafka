package com.myapp.spring.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Persistent Class
// Objects of Type Product will be persisted using hibernate
@Entity
@Table(name = "jpaproducts")
public class Product {
	
	// Field Will Be mapped to a primary key

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	@Column(name = "PRODUCT_NAME",nullable = false)
	private String productName;
	
	@Column(name = "PRODUCT_PRICE",nullable = false)
	private double price;
	
	@Column(name = "PRODUCT_DESCRIPTION",nullable = false)
	private String description;
	
	
	@Column(name = "STAR_RATING",nullable = false)
	private double starRating;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product( String productName, double price, String description, double starRating) {
		
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.starRating = starRating;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getStarRating() {
		return starRating;
	}


	public void setStarRating(double starRating) {
		this.starRating = starRating;
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, price, productId, productName, starRating);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return Objects.equals(description, other.description)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& productId == other.productId && Objects.equals(productName, other.productName)
				&& Double.doubleToLongBits(starRating) == Double.doubleToLongBits(other.starRating);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [productId=");
		builder.append(productId);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", price=");
		builder.append(price);
		builder.append(", description=");
		builder.append(description);
		builder.append(", starRating=");
		builder.append(starRating);
		builder.append("]");
		return builder.toString();
	}

	
	

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Product [productId=");
//		builder.append(productId);
//		builder.append(", productName=");
//		builder.append(productName);
//		builder.append(", price=");
//		builder.append(price);
//		builder.append(", description=");
//		builder.append(description);
//		builder.append(", starRating=");
//		builder.append(starRating);
//		builder.append("]");
//		return builder.toString();
//	}
	
	
	
	
	
	

}
