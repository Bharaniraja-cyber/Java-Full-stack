package com.bharani;

class D{
	D() {
		super();
		System.out.println("A");
	}
    D(int a) {
		this();
		System.out.println("A "+a);
	}
}
class E extends D{
	E() {
		super(4);
		System.out.println("B");
	}
}
public class Myclass2 {
	 static public void main(String[] args) {
		E obj = new E();

	}
	
}
