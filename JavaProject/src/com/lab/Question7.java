package com.lab;

class Person1{
	void getFirstName() {
		System.out.println("First name : Bharani");
	}
	void getLastName() {
		System.out.println("Last name : Raja");
	}
}

class Employee2 extends Person1{
	void getFirstName() {
		System.out.println("First name : Bharani");
	}
	void getLastName() {
		System.out.println("Last name : Raja");
	}
	void getEmployeeId() {
		System.out.println("Employee Id : 101");
	}
	void EmployeeJobTitle() {
		System.out.println("Job Title : Security");
	}
}

public class Question7 {

	public static void main(String[] args) {
		Person1 emp = new Person1();
		emp.getFirstName();
		emp.getLastName();

		Person1 emp1 = new Employee2();
		emp1.getFirstName();
		emp1.getLastName();
		
		Employee2 emp3 = new Employee2();
		emp3.getEmployeeId();
		emp3.EmployeeJobTitle();
		
	}

}
