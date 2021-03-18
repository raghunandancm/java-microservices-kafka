package com.myapp.oops.liskov;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String fullName, double monthlyIncome) {
		super(fullName, monthlyIncome);
		this.setNbHoursPerWeek(40);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestTimeOff(int nbOfDays, Employee manager) {
		// TODO Auto-generated method stub
		
		System.out.println("Time off request for full time employee "
		+this.getFirstName()+" ;Nb of days "+nbOfDays+ "; Approved From "+manager.getFullName());

	}

}
