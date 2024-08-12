package com.mahizha;

//Types of variables in Java
public class MyClasss {
	int b = 20; //Instance or Object Variable
	static int c = 30; //Static or Class Variable

	public static void main(String[] args) {
		int a = 10; //Local Variable
		System.out.println("Local Variable : " + a);
		
		MyClasss obj = new MyClasss();
		System.out.println(obj.b);
		
		System.out.println(MyClasss.c);

	}

}
