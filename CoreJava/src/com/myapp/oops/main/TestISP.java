package com.myapp.oops.main;

import com.myapp.oops.isp.PaySlip;
import com.myapp.oops.liskov.Employee;
import com.myapp.oops.liskov.FullTimeEmployee;
import com.myapp.oops.liskov.Interns;
import com.myapp.oops.liskov.PartTimeEmployee;
import java.time.Month;
public class TestISP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employees[]= {
				new FullTimeEmployee("Ram Dev", 560000.00),
				new PartTimeEmployee("Sham Verma", 250000.00),
				new Interns("Bheem Sen",50000.00,25)
		};
		for(Employee employee:employees) {
			PaySlip payslip = new PaySlip(employee, Month.FEBRUARY);
		String exportableText=	payslip.toTxt().toUpperCase();
		System.out.println(exportableText);
		}
		
		try {
			
		}catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}

	}

}
