package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {
	public static void main(String args[]) {
		Employee emp1 = new Employee();
		
		emp1.printname("ajith kumar",62,25000);
		emp1.printsalary();
		Employee emp2 = new Employee();
		emp2.printname("vijay",68,30000);
		emp2.printsalary();
	}

}
