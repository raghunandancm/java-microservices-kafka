package com.myapp.oops.main;

import java.util.Comparator;

import com.myapp.oops.liskov.Employee;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return ((Double)o1.getMonthlyIncome()).compareTo(o2.getMonthlyIncome());
	}

}
