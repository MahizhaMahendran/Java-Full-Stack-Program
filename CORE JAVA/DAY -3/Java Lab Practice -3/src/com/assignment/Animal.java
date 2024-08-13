package com.assignment;

class Animals {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animals {
    
    void makeSound() {
        System.out.println("Cat as meyows");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animals Cat = new Cat();
        Cat.makeSound();  
    }
}


