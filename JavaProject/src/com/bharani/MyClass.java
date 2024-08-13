package com.bharani;

class Employee {
	int employeeId;
	String employeeName;
	int employeeSalary;
	//constructor
	Employee(int employeeId,String employeeName,int employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	void display() {
		System.out.println("EmployeeId : "+employeeId);
		System.out.println("EmployeeName : "+employeeName);
		System.out.println("EmployeeSalary : "+employeeSalary);
	}
	
public class Myclass {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"Bharani",200);
		emp1.display();
		
		Employee emp2 = new Employee(102,"Bharaniraja",2000);
		emp2.display();
	 }
	}

}
