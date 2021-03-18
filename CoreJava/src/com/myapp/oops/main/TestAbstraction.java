package com.myapp.oops.main;

import com.myapp.oops.Rectangle;
import com.myapp.oops.Shape;
import com.myapp.oops.Triangle;

public class TestAbstraction {
	
	public static void display(Shape shape) {
		System.out.println("Area of  "+shape.getClass().getSimpleName()+" is " +shape.calculateArea());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Java Stores Primitives and NonPrimitives
		
		// Primitive are stored in Stack Memory
		
		// Reference Types are Stored in Heap Memory
		
		//primitive array are reference types or object types
		
		int array [] = new int[5];
		
		
		
		
		new Rectangle(23.4,45.5);
		
		
		//new Shape(23.4,43.5);

		Shape triangle = new Triangle(23.4, 34.5);
		
		Shape rectangle = new Rectangle(23.4, 34.5);
		
		display(rectangle);
		display(triangle);
		
		triangle = null;
		
		
		
		
	}

}
