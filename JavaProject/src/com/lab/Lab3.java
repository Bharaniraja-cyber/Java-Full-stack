package com.lab;

class Circle {
	int radius;
	final double pi = 3.14;
	double area;
	double circumference;
	Circle(int radius) {
		this.radius = radius;
		area = pi*(radius*radius);
		circumference = 2*pi*radius;
		System.out.println("Area = "+area);
		System.out.println("Circumference = "+circumference);
	}
}

public class Lab3 {
	public static void main(String[] args) {
		Circle obj = new Circle(3);
	}

}
