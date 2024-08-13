package com.assignment;

class Employees {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 0;
    }
}

class HRManager extends Employees {
   
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee() {
        System.out.println("Adding a new employee");
    }
}

public class Employee {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();  
        hr.addEmployee();  
    }
}
