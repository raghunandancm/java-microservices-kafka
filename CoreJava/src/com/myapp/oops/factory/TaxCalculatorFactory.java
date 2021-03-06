package com.myapp.oops.factory;

import com.myapp.oops.liskov.Employee;
import com.myapp.oops.liskov.FullTimeEmployee;
import com.myapp.oops.liskov.Interns;
import com.myapp.oops.liskov.PartTimeEmployee;
import com.myapp.oops.srp.FullTimeTaxCalculator;
import com.myapp.oops.srp.InternTaxCalculator;
import com.myapp.oops.srp.PartTimeTaxCalculator;
import com.myapp.oops.srp.TaxCalculator;

public class TaxCalculatorFactory {
	
	public static TaxCalculator create(Employee employee) {
		if(employee instanceof FullTimeEmployee) {
			return new FullTimeTaxCalculator();
			
		}
		if(employee instanceof PartTimeEmployee) {
			return new PartTimeTaxCalculator();
			
		}
		if(employee instanceof Interns) {
			return new InternTaxCalculator();
			
		}
		throw new RuntimeException("Invalid Employee type");
		
	}

}
