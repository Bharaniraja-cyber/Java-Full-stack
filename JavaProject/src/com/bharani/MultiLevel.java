package com.bharani;
class Fruit{
	void engine1() {
		System.out.println("450cc Engine");
	}
}
class Orange extends Fruit{
	void wheels1() {
		System.out.println("x7");
	}
}

class Mango extends Orange {
	void Brand1() {
		System.out.println("BMW");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		Mango bike= new Mango();
		bike.engine1();
		bike.wheels1();
		bike.Brand1();
	}

}
