package com.lab;
class Employee {
	String name,jobTitle;
	int salary;
	
	void mymethod(String name,String jobTitle) {
		System.out.println("Employee Name : "+name);
		System.out.println("Job Title : "+jobTitle);
	}
	void mymethod(int salary) {
		System.out.println("Employee Salary : "+salary);
	}
}
public class Lab4 {
	public static void main(String args[]) {
		Employee obj = new Employee();
		obj.mymethod("Bharani","Architect");
		obj.mymethod(4500);
	}
}
