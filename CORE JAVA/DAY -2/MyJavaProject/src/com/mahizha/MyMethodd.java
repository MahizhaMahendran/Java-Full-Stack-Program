package com.mahizha;

//this keyword refers current class object
public class MyMethodd {
	String name;
	
	MyMethodd(String name){
		this(10, 20);
		this.name = name;
		this.greeting();
	}
	
	MyMethodd(int a, int b){
		System.out.println("Sum : " + (a + b));
	}
	void greeting() {
		System.out.println("Welcome : " + name);
	}

	public static void main(String[] args) {
		MyMethodd obj = new MyMethodd("Mahizha");
	
		
		
	}

}
