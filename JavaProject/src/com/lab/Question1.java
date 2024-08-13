package com.lab;

class Animal{
	void makeSound() {
		System.out.println("cat is ");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Bark");
	}
}

public class Question1 {

	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.makeSound();

		Animal obj1 = new Cat();
		obj1.makeSound();
	}

}
