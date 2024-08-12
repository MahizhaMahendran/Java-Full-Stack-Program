
package com.vino;

import java.util.Scanner;

public class Student {
    int RegNo;
    String StudentName;
    int[] marks = new int[5];

    
    Student(int RegNo, String StudentName) {
        this.RegNo = RegNo;
        this.StudentName = StudentName;
    }

   
    void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

   
    void displayGrade() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        float average = sum / 5.0f;
        String grade;
        
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Sum of all marks: " + sum);
        System.out.println("Average of all marks: " + average);
        System.out.println("Grade: " + grade);
    }

    
    void display() {
        System.out.println("RegNo: " + RegNo);
        System.out.println("StudentName: " + StudentName);
    }

    public static void main(String[] args) {
      
        Student student = new Student(101, "Mahizha");

  
        student.display();

       
        student.getMarks();

       
        student.displayGrade();
    }
}
