package com.practice;

public class Rectangle {
	 double width;
	    double height;

	    Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    double calculateArea() {
	        return width * height;
	    }

	    double calculatePerimeter() {
	        return 2 * (width + height);
	    }

	    public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(5, 10);

	        System.out.println("Area: " + rectangle.calculateArea());
	        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
	    }
	}
