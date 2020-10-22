package com.nttdata;

public class Student {
	int studentId;
	String studentName;
	String studentAddress;
	double studentMarks;
	
	void inputStudentdetails(int id,String name,String address,double marks)
	{
		studentId=id;
		studentName=name;
		studentAddress=address;
		studentMarks=marks;
	}
	void displayStudentdetails()
	{
		System.out.println("The details of student :");
		System.out.println("Student Id :"+studentId+ "\t "+"Student Name :"+studentName+ "\t "+"Student Address"+studentAddress+ "\t "+"Student Marks"+studentMarks);
	}

}
