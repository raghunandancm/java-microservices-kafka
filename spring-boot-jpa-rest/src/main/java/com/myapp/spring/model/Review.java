package com.myapp.spring.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="reviews")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="REVIEW_ID")
	private int id;
	
	@Column(name="REVIEW_DETAILS")
	private String review;
	
	
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	public Map<Integer, Product> mapReview = new HashMap<>();
	
	
	public Review() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

	public Review(String review) {
		this.review = review;
	}






	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}






	public Map<Integer, Product> getMapReview() {
		return mapReview;
	}






	public void setMapReview(Map<Integer, Product> mapReview) {
		this.mapReview = mapReview;
	}
	
	

}
