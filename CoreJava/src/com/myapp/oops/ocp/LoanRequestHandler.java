package com.myapp.oops.ocp;

import java.util.Objects;

public class LoanRequestHandler {
	
	private double bankBalance;
	
	public LoanRequestHandler(double bankBalance) {
	this.bankBalance = bankBalance;
	}
	
	public String approveLoan(LoanValidator validator) {
		if(validator.isValid(bankBalance)) {
			return "APROOVED";
		}
		else
			return "REJECTED";
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankBalance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LoanRequestHandler))
			return false;
		LoanRequestHandler other = (LoanRequestHandler) obj;
		return Double.doubleToLongBits(bankBalance) == Double.doubleToLongBits(other.bankBalance);
	}

	

	
	

}
