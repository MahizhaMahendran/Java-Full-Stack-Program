package com.vino;

//Single Inheritance in Java
class TwoWheeler {
	void noOfWheels () {
		System.out.println("I hava two wheels");
	}
}

class Bike extends TwoWheeler {
	void brandName () {
		System.out.println("Brand Name is Honda");
	}
}

public class MyClass {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.noOfWheels();
		bike.brandName();

	}

}
