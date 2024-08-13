package com.lab;
class Person{
	String name;
	int age;
	
	Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Person Name : "+name);
		System.out.println("Person age : "+age);
	}
}
public class Lab1 {
	public static void main(String args[]){
		Person obj = new Person("Ram",20);
		obj.display();
	}
}
