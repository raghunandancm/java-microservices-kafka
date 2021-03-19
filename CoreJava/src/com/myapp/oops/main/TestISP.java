package com.myapp.oops.main;

import com.myapp.oops.isp.PaySlip;
import com.myapp.oops.liskov.Employee;
import com.myapp.oops.liskov.FullTimeEmployee;
import com.myapp.oops.liskov.Interns;
import com.myapp.oops.liskov.PartTimeEmployee;
import com.myapp.oops.persistence.EmployeeRepository;
import com.sun.corba.se.spi.activation.Repository;

import java.time.Month;
import java.util.List;
public class TestISP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRepository repository = new EmployeeRepository();
		List<Employee> employees= repository.findAll();
		
		for(Employee employee:employees) {
			PaySlip payslip = new PaySlip(employee, Month.FEBRUARY);
		String exportableText=	payslip.toTxt().toUpperCase();
		System.out.println(exportableText);
		}

	}

}
