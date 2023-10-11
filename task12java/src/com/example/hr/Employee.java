package com.example.hr;

public class Employee {
private String name;
private int id;
private double salary;


public void printname(String name, int id, double salary) {
	this.name = name;
	this.id =id;
	this.salary = salary;
	System.out.println("Employee Name is : " +name);
	System.out.println("Employee id is : " +id);
	
	}
public void printsalary() {
	
	System.out.println("salary for the employee "+name+ " will be : " +salary);
}
}
