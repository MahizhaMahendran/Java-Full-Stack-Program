package com.mahizha;

class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	//constructor
	Employee(int employeeId, String employeeName, float employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;	
		
		
	}
	
	//Method
	void display() {
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee Salary : " + employeeSalary);
		
	}
}
public class MyClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Mahizha", 2000.00f);
		emp1.display();
		Employee emp2 = new Employee(102, "Vino", 3000.00f);
		emp2.display();
		

	}
}
