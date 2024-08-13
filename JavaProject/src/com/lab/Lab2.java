package com.lab;


class Rectangle{
	int width;
	int height;
	int area;
	int perimeter;
	Rectangle(int width,int height) {
		this.width = width;
		this.height = height;
		this.area = height*width;
		this.perimeter = 2*(width+height);
		System.out.println("Area is : "+area);
		System.out.println("Perimeter is : "+perimeter);
	}
	

}
public class Lab2 {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(25,12);
	}

}
