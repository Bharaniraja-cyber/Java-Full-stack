package com.lab;

class Animal1{
	void move() {
		System.out.println("Animal");
	}
}
class Cheetah extends Animal1{
	void move() {
		System.out.println("Cheetah is running");
	}
}

public class Question6 {

	public static void main(String[] args) {
		Animal1 ani = new Animal1();
		ani.move();
		
		Animal1 ani1 = new Cheetah();
		ani1.move();

	}

}
