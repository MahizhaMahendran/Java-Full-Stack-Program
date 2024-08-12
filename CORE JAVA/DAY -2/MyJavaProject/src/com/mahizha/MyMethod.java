package com.mahizha;


//Types of Methods Java 
public class MyMethod {
	void myMethod1() {
		System.out.println("Instance or object Method");
	}
	
	static void myMethod2() {
		System.out.println("Static or Class Method");
	}

	public static void main(String[] args) {
		MyMethod obj = new MyMethod();
		obj.myMethod1();
		
		MyMethod.myMethod2();
		
	}

}
