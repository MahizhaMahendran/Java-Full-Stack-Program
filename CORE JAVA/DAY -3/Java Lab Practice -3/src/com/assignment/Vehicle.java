package com.assignment;

class Vehicles {
	void drive() {
		System.out.println("Driving a Vehicle");
	}
}
class Car extends Vehicles {
	void drive() {
		System.out.println("Repairing a Car");
	}
}

public class Vehicle {

	public static void main(String[] args) {
		Vehicles Car = new Car();
		Car.drive();

	}

}
