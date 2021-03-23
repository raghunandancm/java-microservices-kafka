package com.myapp.oops.main;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
						(o1,  o2)-> ((Double)o1.getMonthlyIncome()).compareTo(o2.getMonthlyIncome());
							
//		Set<Employee> set = new TreeSet<>(comparator1);
						
		Set<Employee> set = new TreeSet<>((o1,o2)->((Double)o1.getMonthlyIncome()).compareTo(o2.getMonthlyIncome()));
		
		set.addAll(repository.findAll());
		
		
		Predicate<Employee> predicate = e -> e.getNbHoursPerWeek()>30;
		
		//Consumer<Employee> consumer = e -> System.out.println(e);
		
		Consumer<Employee> consumer = System.out::println;
		
//		set.stream().filter(predicate).forEach(consumer);
		
//		System.out.println(set.stream().filter(predicate)
//				.mapToDouble(Employee::getMonthlyIncome).average());
		
		
//		System.out.println(set.stream().filter(predicate)
//				.mapToDouble(e1->e1.getMonthlyIncome()).average());
		
		DoubleSummaryStatistics statistics=
		set.stream().filter(predicate)
				.mapToDouble(e1->e1.getMonthlyIncome()).summaryStatistics();
		System.out.println("Min Sal "+statistics.getMin());
		System.out.println("Max Sal "+statistics.getMax());
		System.out.println("Average "+statistics.getAverage());
		System.out.println("Sum "+statistics.getSum());
		
		
		//System.out.println(set);
		
		
		
	}

}
