package com.bharani;

public class Example5 {
	void mymethod() {
		System.out.println("Instance or Object method");
	}
	
	static void mymethod2() {
		System.out.println("Static or Class method");
	}
	public static void main(String[] args) {
		Example5 obj = new Example5();
		obj.mymethod();
		
		Example5.mymethod2();
	}

}
