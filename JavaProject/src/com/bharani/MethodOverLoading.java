package com.bharani;

public class MethodOverLoading {
	void mymethod(String name) {
		System.out.println("Welcome "+ name);
	}
	void mymethod(int a,int b) {
		System.out.println("Sum :"+(a+b));
	}
	void mymethod(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) 
			fact = fact*i;
		System.out.println("Factorial of "+n+" is "+fact);
		
	}
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.mymethod(5);
		obj.mymethod("Bharani");
		obj.mymethod(10,20);
		

	}

}
