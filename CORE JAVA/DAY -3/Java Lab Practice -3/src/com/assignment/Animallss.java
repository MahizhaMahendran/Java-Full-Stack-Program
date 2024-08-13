package com.assignment;

class Animaal {
    void move() {
        System.out.println("Animal moves");
    }
}

class Cheetah extends Animaal {
	
    void move() {
        System.out.println("Cheetah runs fast");
    }
}

public class Animallss {
    public static void main(String[] args) {
        Animaal cheetah = new Cheetah();
        cheetah.move();  
    }
}
