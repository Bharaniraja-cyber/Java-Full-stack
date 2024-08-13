package com.bharani;

class KSR {
	void AI() {
		System.out.println("Bharaniraja");
	}
}

class ECE extends KSR{
	void DS() {
		System.out.println("nesan");
	}
}

class MECH extends KSR{
	void Auto() {
		System.out.println("Abisake");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		ECE obj = new ECE();
		obj.AI();
		obj.DS();
		
		MECH obj1 = new MECH();
		obj1.AI();
		obj1.Auto();
	}

}
