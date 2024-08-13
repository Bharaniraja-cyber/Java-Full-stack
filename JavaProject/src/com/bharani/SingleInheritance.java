package com.bharani;

class TwoWheeler {
	void wheels() {
		System.out.println("x7");
	}
}

class Bike extends TwoWheeler {
	void Brand() {
		System.out.println("BMW");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Bike bike = new Bike();
		
		bike.wheels();
		bike.Brand();
	}

}
