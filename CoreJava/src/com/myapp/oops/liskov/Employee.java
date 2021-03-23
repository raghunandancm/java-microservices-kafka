package com.myapp.oops.liskov;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private double monthlyIncome;
	private int nbHoursPerWeek;
	
	public Employee(String fullName,double monthlyIncome) {
		// TODO Auto-generated constructor stub
		setMonthlyIncome(monthlyIncome);
		String []names = fullName.split(" ");
		this.firstName = names[0];
		this.lastName = names[1];
		
	}
	
	public String getFullName() {
		return this.firstName+" "+this.lastName;
	}
	
	public String getEmail() {
		return this.firstName+"."+this.lastName+"@abc.com";
	}
	
	public abstract void requestTimeOff(int nbOfDays,Employee manager) ;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(double monthlyIncome) {
		
		if(monthlyIncome < 0) {
			throw new IllegalArgumentException("Monthly Income must be a positive value");
		}
		this.monthlyIncome = monthlyIncome;
	}
	public int getNbHoursPerWeek() {
		return nbHoursPerWeek;
	}
	public void setNbHoursPerWeek(int nbHoursPerWeek) {
		
		if(nbHoursPerWeek < 0) {
			throw new IllegalArgumentException("Hours per week must be a positive value");
		}
		this.nbHoursPerWeek = nbHoursPerWeek;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", monthlyIncome=");
		builder.append(monthlyIncome);
		builder.append(", nbHoursPerWeek=");
		builder.append(nbHoursPerWeek);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
