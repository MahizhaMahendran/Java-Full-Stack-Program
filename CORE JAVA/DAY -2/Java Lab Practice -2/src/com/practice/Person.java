package com.practice;

public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		 System.out.println("Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) {
		Person person1 = new Person("Mahizha", 20);
		Person person2 = new Person("Swetha", 22);
		
		person1.display();
		person2.display();
	}
	
}
