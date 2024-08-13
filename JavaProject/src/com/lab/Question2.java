package com.lab;

class Vehicle{
	void drive() {
		System.out.println("Servie free for upto 1000km");
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a car");
	}
}

public class Question2 {

	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		obj.drive();
		
		Vehicle obj1 = new Car();
		obj1.drive();

	}

}
