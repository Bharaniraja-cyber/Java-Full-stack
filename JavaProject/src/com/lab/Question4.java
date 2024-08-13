package com.lab;

class Employee1{
	void work() {
		System.out.println("Senior Web Developer");
	}
	void getSalary() {
		System.out.println("Salary : 100000");
	}
}

class HRManager extends Employee1{
	void work() {
		System.out.println("Junior Web Developer");
	}
	void addEmployee() {
		System.out.println("New Employee Salary is 50000");
	}
}

public class Question4 {

	public static void main(String[] args) {
		Employee1 obj = new Employee1();
		obj.work();
		obj.getSalary();
		
		Employee1 obj1 = new HRManager();
		obj1.work();
		
		HRManager obj2 = new HRManager();
		obj2.addEmployee();

	}

}
