package com.lab;

class Shape{
	void getArea(int a,int b) {
		System.out.println("The Area of Rectangle is "+a*b);
	}
}
class square extends Shape{
	void getArea(int a,int b) {
		System.out.println("The Area of Rectangle is "+a*b);
	}
}

public class Question3 {

	public static void main(String[] args) {
		Shape obj1 = new Shape();
		obj1.getArea(5, 6);

		Shape obj2 = new square();
		obj2.getArea(9, 6);
		
	}

}
