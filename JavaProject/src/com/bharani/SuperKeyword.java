package com.bharani;

class A {
	int a = 10;
	A(String name) {
		System.out.println("Welcome "+ name);
	}
	void mymethod1() {
		System.out.println("I am here to assist you");
	}
}

class B extends A {
	B() {
		super(" 'Bharaniraja' ");
	}
	void mymethod2() {
		System.out.println("the integer is : "+ super.a);
		super.mymethod1();
	}
}


public class SuperKeyword {

	public static void main(String[] args) {
		B obj = new B();
		obj.mymethod2();

	}

}
