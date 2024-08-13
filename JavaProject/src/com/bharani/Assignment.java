package com.bharani;
import java.util.Scanner;
class Student{
	int registerNumber;
	String studentName;
	int subject[] = new int[5];
	
	Student(int registerNumber,String studentName) {
		this.registerNumber = registerNumber;
		this.studentName = studentName;
	}
	
	void getMarks() {
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<subject.length;i++) {
			subject[i] = sc.nextInt();
		}
 	}
	
	void displayGrade() {
		System.out.println("Registration number : "+ registerNumber);
		System.out.println("Student Name : "+ studentName);
		int grade=0;
		float average;
		for(int i=0;i<subject.length;i++)
			grade = grade + subject[i];
			average = grade/subject.length;
			System.out.println("Total Marks :"+grade);
		System.out.println("Average is : "+average);
		if(average>90) {
			System.out.println("Student Grade is 'O' ");
		}
		else if(average>80 && average<=90) {
			System.out.println("Student Grade is 'A+' ");
		}
		else if(average>70 && average<=80) {
			System.out.println("Student Grade is 'A' ");
		}
		else if(average>60 && average<=70) {
			System.out.println("Student Grade is 'B+' ");
		}
		else if(average>50 && average<=60) {
			System.out.println("Student Grade is 'B' ");
		}
		else {
			System.out.println("Student Grade is 'C' ");
		}
	}
	

}

public class Assignment {

	public static void main(String[] args) {
		Student obj = new Student(2126108,"Bharaniraja");
		obj.getMarks();
		obj.displayGrade();

	}

}
