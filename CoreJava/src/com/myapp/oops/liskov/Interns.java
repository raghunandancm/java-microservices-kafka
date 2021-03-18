package com.myapp.oops.liskov;

public class Interns extends Employee {

	public Interns(String fullName, double monthlyIncome,int nbOfHours) {
		super(fullName, monthlyIncome);
		setNbHoursPerWeek(nbOfHours);
		
	}

	@Override
	public void requestTimeOff(int nbOfDays, Employee manager) {
		// TODO Auto-generated method stub
		
		System.out.println("Time off request for intern employee "
		+this.getFirstName()+" ;Nb of days "+nbOfDays+ "; Approved From "+manager.getFullName());

	}

}
