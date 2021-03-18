package com.myapp.oops.srp;

import com.myapp.oops.liskov.Employee;

public class InternTaxCalculator implements TaxCalculator {
	
	private final int INCOME_TAX_PERCENTAGE =12;
	
	

	@Override
	public double calcuateTax(Employee employee) {
		// TODO Auto-generated method stub
		if(employee.getMonthlyIncome()<35000) {
		return 0;
		}
		return (employee.getMonthlyIncome()*INCOME_TAX_PERCENTAGE)/100;
		}

}
