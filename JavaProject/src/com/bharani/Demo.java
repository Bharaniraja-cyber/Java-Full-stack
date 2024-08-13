package com.bharani;

public class Demo {
	String name;
	
	Demo(String name){
		this(10,20);
		this.name = name;
		this.greeting();
	}
	Demo(int a ,int b){
		System.out.println("Sum :"+(a+b));
	}
	
	void greeting() {
		System.out.println("Welcome " + name);
	}
	public static void main(String[] args) {
		Demo obj = new Demo("Bharani");
	}

}
