package com.myapp.oops.persistence;

import java.util.Arrays;
import java.util.List;

import com.myapp.oops.liskov.Employee;
import com.myapp.oops.liskov.FullTimeEmployee;
import com.myapp.oops.liskov.Interns;
import com.myapp.oops.liskov.PartTimeEmployee;

public class EmployeeRepository {
	
//	List list1 = new ArrayList();
//	List<String> list2 = new ArrayList<>();
	public EmployeeRepository() {
//		// TODO Auto-generated constructor stub
//		list1.add("");
//		list1.add(2);
//		
//		list2.add("dkjdjd");
//		list2.add(2);
	}
	
	
public List<Employee> findAll(){
	Employee ramdev=new FullTimeEmployee("Ram Dev", 560000.00);
	Employee shamverma=new PartTimeEmployee("Sham Verma", 250000.00);
	Employee bheemsen=new Interns("Bheem Sen",50000.00,45);
	List<Employee> list=Arrays.asList(ramdev,shamverma,bheemsen);
	return list;
	
	}


}
