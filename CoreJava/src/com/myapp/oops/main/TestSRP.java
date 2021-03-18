package com.myapp.oops.main;

import com.myapp.oops.factory.TaxCalculatorFactory;
import com.myapp.oops.liskov.Employee;
import com.myapp.oops.liskov.FullTimeEmployee;
import com.myapp.oops.liskov.Interns;
import com.myapp.oops.liskov.PartTimeEmployee;
import com.myapp.oops.srp.TaxCalculator;

public class TestSRP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee employees[]= {
				new FullTimeEmployee("Ram Dev", 560000.00),
				new PartTimeEmployee("Sham Verma", 250000.00),
				new Interns("Bheem Sen",50000.00,25)
		};
		
		//Employee manager = new FullTimeEmployee("Steve Jobs",500000.5);

		
		for(Employee employee:employees) {
			TaxCalculator taxCalculator = TaxCalculatorFactory.create(employee);
			double tax=taxCalculator.calcuateTax(employee);
			System.out.println("Total Tax "+tax);
			
		}

	}

}
