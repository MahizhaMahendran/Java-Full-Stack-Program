package com.assignment;

class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employe extends Person {
    String jobTitle;
    int employeeId;

    Employe(String firstName, String lastName, String jobTitle, int employeeId) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
    }

   
    String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }

    int getEmployeeId() {
        return employeeId;
    }
}

public class Main {
    public static void main(String[] args) {
        Employe emp = new Employe("Mahizha", "Mahendran", "Java FullStack Developer", 101);
        System.out.println(emp.getFirstName() + " " + emp.getLastName());  
        System.out.println("Employee ID: " + emp.getEmployeeId());  
    }
}
