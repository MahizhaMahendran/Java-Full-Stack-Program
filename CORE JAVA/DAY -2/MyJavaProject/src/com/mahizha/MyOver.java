package com.mahizha;

//Method Overloading
public class MyOver {
	void myMethod(String name) {
		System.out.println("Welcome: " + name);
		
	}
	
	void myMethod(int a, int b) {
		System.out.println("Addition :" + (a + b));
		
	}
	
	void myMethod(int a, int b, int c) {
		System.out.println("Subtraction :" + (a - b - c));
		
	}
	
	void myMethod(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++)
			fact = fact * i;
		System.out.println("Factorial : " + fact);
		
	}

	public static void main(String[] args) {
		MyOver obj = new MyOver();
		obj.myMethod(6);
		obj.myMethod("Mahizha");
		obj.myMethod(10, 20);
		obj.myMethod(100, 25, 10);
				
		

	}

}
