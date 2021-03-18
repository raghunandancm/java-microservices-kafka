package com.myapp.oops.ocp;

public class PersonalLoanValidator implements LoanValidator  {

	@Override
	public  boolean isValid(double bankBalance) {
		// TODO Auto-generated method stub
		
		if(bankBalance > 5000.00)
			return true;
		else
		return false;
	}

	

}
