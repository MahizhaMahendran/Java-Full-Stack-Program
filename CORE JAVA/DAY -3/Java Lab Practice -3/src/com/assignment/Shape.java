package com.assignment;

class Shapes {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shapes {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    double getArea() {
        return length * width;
    }
}

public class Shape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(6, 4);
        System.out.println("Area of Rectangle: " + rect.getArea());  
    }
}
