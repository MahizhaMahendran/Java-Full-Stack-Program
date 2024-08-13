package com.vino;

class D {
	D () {
		System.out.println("A");
	}
	D(int a){
		this();
		System.out.println("A 1");
	}
}
class M extends D {
	M () {
		super(6);
		System.out.println("B");
	}
	M( int a) {
		System.out.println("B 1");
	}
}
public class KeyConst {

	static public void main(String[] args) {
		M b = new M(5);
	}

}