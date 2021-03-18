package com.myapp.oops.srp;

import com.myapp.oops.liskov.Employee;

public class FullTimeTaxCalculator implements TaxCalculator {
	
	private final int INCOME_TAX_PERCENTAGE =16;
	
	private final int BASE_HEALTH_INSURANCE =100;
	

	@Override
	public double calcuateTax(Employee employee) {
		// TODO Auto-generated method stub
		return BASE_HEALTH_INSURANCE+(employee.getMonthlyIncome()*INCOME_TAX_PERCENTAGE)/100;
	}

}
