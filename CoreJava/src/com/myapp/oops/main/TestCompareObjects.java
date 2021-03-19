package com.myapp.oops.main;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.myapp.oops.liskov.Employee;
import com.myapp.oops.persistence.EmployeeRepository;

public class TestCompareObjects {
	
	public static void main(String args[]) {
		
		Comparator<Employee> comparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return ((Double)o1.getMonthlyIncome()).compareTo(o2.getMonthlyIncome());
			}
		};
		
		
		EmployeeRepository repository = new EmployeeRepository();
		
//		Set<Employee> set = new TreeSet<>(comparator);
		
//		Comparator<Employee> comparator1 = 
//				(Employee o1, Employee o2)->((Double)o1.getMonthlyIncome()).compareTo(o2.getMonthlyIncome());
//		
				
		Comparator<Employee> comparator1 = 
						(o1,  o2)->((Double)o1.getMonthlyIncome()).compareTo(o2.getMonthlyIncome());
							
//		Set<Employee> set = new TreeSet<>(comparator1);
						
		Set<Employee> set = new TreeSet<>((o1,o2)->((Double)o1.getMonthlyIncome()).compareTo(o2.getMonthlyIncome()));
		
		set.addAll(repository.findAll());
		
		System.out.println(set);
		
		
		
	}

}
