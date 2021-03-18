package com.myapp.oops.isp;

import java.time.Month;

import com.myapp.oops.liskov.Employee;
public class PaySlip implements ExportableText{
	
	private String employeeName;
	private double monthlyIncome;
	private Month month;
	
	

	public PaySlip(Employee  employee, Month month) {
		this.employeeName = employee.getFullName();
		this.monthlyIncome = employee.getMonthlyIncome();
		this.month = month;
	}



	@Override
	public String toTxt() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("MONTH:").append(this.month);
		sb.append(System.lineSeparator());
		sb.append("NAME:").append(this.employeeName);
		sb.append(System.lineSeparator());
		sb.append("Monthly Income :").append(this.monthlyIncome);
		sb.append(System.lineSeparator());
		
		return sb.toString();
	}

}
