package com.vino;

//Hierarical Inheritance in Java
class Vehicless {
	void noOfEngine () {
		System.out.println("I have one engine");
	}
}
class Twowheel extends Vehicless {
	void noOfWheels () {
		System.out.println("I have two wheels");
	}
}

class Bikkee extends Twowheel {
	void brandName () {
		System.out.println("Brand Name is Honda");
	}
}

class Scooty extends Twowheel {
	void brandName () {
		System.err.println("Brand Name is Active");
	}
}

public class MyClaass {

	public static void main(String[] args) {
		Bikkee bike = new Bikkee();
		bike.noOfEngine ();
		bike.noOfWheels();
		bike.brandName();

		Scooty scooty = new Scooty();
		scooty.noOfEngine ();
		scooty.noOfWheels();
		scooty.brandName();

	}

}
