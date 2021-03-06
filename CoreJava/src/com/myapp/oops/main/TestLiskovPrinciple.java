package com.myapp.oops.main;

import com.myapp.oops.liskov.Employee;
import com.myapp.oops.liskov.FullTimeEmployee;
import com.myapp.oops.liskov.Interns;
import com.myapp.oops.liskov.PartTimeEmployee;
import com.myapp.oops.liskov.ServiceLevelAgreement;
import com.myapp.oops.liskov.Subcontractor;

public class TestLiskovPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employees[]= {
				new FullTimeEmployee("Ram Dev", -6),
				new PartTimeEmployee("Sham Verma", 250000.00),
				new Interns("Bheem Sen",50000.00,25)
		};
		
		Employee manager = new FullTimeEmployee("Steve Jobs",500000.5);
//		for(int i=0;i<employees.length;i++) {
//			employees[i].requestTimeOff(5, manager);
//		}
		
		for(Employee employee:employees) {
			employee.requestTimeOff(5, manager);
		}
		
		Subcontractor subcontractors[]= {
		
		new Subcontractor("contractor1", "contractor1@gmail.com", 30000.0, 15),
		new Subcontractor("contractor2", "contractor2@gmail.com", 35000.0, 25),
		new Subcontractor("contractor3", "contractor3@gmail.com", 25000.0, 15),
		};
		
		ServiceLevelAgreement sla = new ServiceLevelAgreement(98, 3);
		for(Subcontractor subcontractor: subcontractors) {
			subcontractor.approveSLA(sla);
			
		}
		
		

	}

}
