package com.myapp.spring.model;

import java.util.Objects;

public class Product {
	
	private int productId;
	
	private String productName;
	
	private double price;
	
	private String description;
	
	private double starRating;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int productId, String productName, double price, String description, double starRating) {
		this.productId = productId;
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
