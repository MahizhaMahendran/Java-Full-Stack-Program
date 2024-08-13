package com.practice;

public class Employee {
	String name;
    String jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    void display() {
        System.out.println("Name: " + name );
        System.out.println("Job Title : " + jobTitle);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Mahizha", "Full Stack Developer", 80000);

        employee.display();
        employee.updateSalary(90000);
        employee.display();
    }
}

