package com.myapp.oops.liskov;

public class Subcontractor {
	
	private final double monthlyIncome;
	private double nbHoursPerWeek;
	private String email,name;
	public Subcontractor(String name, String email, double monthlyIncome, double nbHoursPerWeek) {
		this.name = name;
		this.email = email;
		this.monthlyIncome = monthlyIncome;
		this.nbHoursPerWeek = nbHoursPerWeek;
	}
	public double getMonthlyIncome() {
		return monthlyIncome;
	}
	public double getNbHoursPerWeek() {
		return nbHoursPerWeek;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	
	
	public boolean approveSLA(ServiceLevelAgreement sla) {
		
		boolean result = false;
		if(sla.getMinUptimePercent()>=98 && sla.getProblemResolutionTimeDays()<=3) {
			result =true;
		}
		
		System.out.println("SLA Approved for "+this.name+" status : "+result);
		
		return result;
		
		
	}
	
	
	
	

	
	
	

}
