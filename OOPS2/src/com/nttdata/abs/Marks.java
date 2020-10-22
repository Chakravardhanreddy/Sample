package com.nttdata.abs;

public class Marks {
	String subjectName;
	int marks;
	
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Marks(String subjectName, int marks) {
		super();
		this.subjectName = subjectName;
		this.marks = marks;
	}
	void printMarksDetails(Student s)
	{
		System.out.println("Student details as :");
		System.out.println("Student Id"+s.getStudentId()+"\t"+"Student name:"+s.getStudentName()+"\t"+"Student Address:"+s.getStudentAddress());
	}
	

}
