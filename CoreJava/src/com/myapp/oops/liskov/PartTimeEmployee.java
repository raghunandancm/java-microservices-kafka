package com.myapp.oops.liskov;

public class PartTimeEmployee extends Employee {

	public PartTimeEmployee(String fullName, double monthlyIncome) {
		super(fullName, monthlyIncome);
		this.setNbHoursPerWeek(20);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestTimeOff(int nbOfDays, Employee manager) {
		// TODO Auto-generated method stub
		
		System.out.println("Time off request for part time employee "
		+this.getFirstName()+" ;Nb of days "+nbOfDays+ "; Approved From "+manager.getFullName());

	}

}
