package com.myapp.oops;

public abstract class Shape  extends Object{
	
	private double width,height;
	
	// Constructor
	public Shape(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
    public double getWidth() {
    	 
		return width;
	}
    
    public double getHeight() {
    	
		return height;
	}
    
    public abstract double calculateArea();
	
	
}
