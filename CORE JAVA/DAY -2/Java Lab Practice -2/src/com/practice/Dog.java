package com.practice;

public class Dog {
	String name;
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    void display() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Bulldog");

        dog1.setName("Charlie");
        dog1.setBreed("Labrador");

        dog1.display();
        dog2.display();
    }
}
