package com.vino;

//Multilevel Inheritance in Java
class Vehicles {
	void noOfEngine () {
		System.out.println("I have one engine");
	}
}
class Twowheels extends Vehicles {
	void noOfWheels () {
		System.out.println("I have two wheels");
	}
}

class Bikee extends Twowheels {
	void brandName () {
		System.out.println("Brand Name is Honda");
	}
}

public class MyClasss {

	public static void main(String[] args) {
		Bikee bike = new Bikee();
		bike.noOfEngine ();
		bike.noOfWheels();
		bike.brandName();

	}

}
