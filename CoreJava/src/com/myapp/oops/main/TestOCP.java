package com.myapp.oops.main;

import com.myapp.oops.ocp.BuisnessLoanValidator;
import com.myapp.oops.ocp.LoanRequestHandler;
import com.myapp.oops.ocp.LoanValidator;
import com.myapp.oops.ocp.PersonalLoanValidator;




public class TestOCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LoanValidator personalLoanValidator = new PersonalLoanValidator();
		
		LoanValidator businessLoanValidator = new BuisnessLoanValidator();
		
		LoanRequestHandler handler = new LoanRequestHandler(7500.4);
		
		String status = handler.approveLoan(businessLoanValidator);
		System.out.println("Loan Status  "+status);

		
		LoanRequestHandler handler2 = new LoanRequestHandler(7500.4);
		status=handler2.approveLoan(personalLoanValidator);
		System.out.println("Loan Status  "+status);
		
		
		System.out.println("handler1 == handler2 "+handler.equals(handler2));
		
	}

}
//abstract class Bird{


// public abstract void fly(int altitude); 

//}


// class Ostrich extends Bird{
// public void fly(int altitude){ return 0}

//}


// SOLID


// Single Responsibility
// OpenClosedPrinciple
// LiskovSubstitutionPrinciple
// Interface SeggregationPrinciple
// Dependency Inversion Principle




