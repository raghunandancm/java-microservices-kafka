package com.myapp.oops.liskov;

public class ServiceLevelAgreement {
	
	private double minUptimePercent;
	private double problemResolutionTimeDays;
	public ServiceLevelAgreement(double minUptimePercent, double problemResolutionTimeDays) {
		this.minUptimePercent = minUptimePercent;
		this.problemResolutionTimeDays = problemResolutionTimeDays;
	}
	
	
	
	public double getMinUptimePercent() {
		return minUptimePercent;
	}
	public double getProblemResolutionTimeDays() {
		return problemResolutionTimeDays;
	}
	
	
	
	
	

}
