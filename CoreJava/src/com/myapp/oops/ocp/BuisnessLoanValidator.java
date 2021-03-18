package com.myapp.oops.ocp;

public class BuisnessLoanValidator implements LoanValidator  {

	@Override
	public  boolean isValid(double bankBalance) {
		// TODO Auto-generated method stub
		
		if(bankBalance > 50000.00)
			return true;
		else
		return false;
	}

	

}
