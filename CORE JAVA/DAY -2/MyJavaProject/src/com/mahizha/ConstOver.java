package com.mahizha;

//Constructor Overloading
public class ConstOver {
	ConstOver(String name){
		System.out.println("Welcome : " + name);
		
	}
	
	ConstOver(int a, int b){
		this("Mahizha");
		System.out.println("Addition : " + (a + b));
	}
	ConstOver(int n){
		this(10, 20);
		int fact = 1;
		for(int i=1; i<=n; i++)
			fact = fact * i;
		System.out.println("Factorial : " + fact);
	}

	public static void main(String[] args) {
		ConstOver obj1 = new ConstOver(5);
		
		
	}

}
