package com.nttdata.abs;

public class ClientS {
public static void main(String[] args) {
	Student student=new Student(12,"Chakri","Hyd");
	Marks marks=new Marks("maths",95);
	student.printStudentDetails(marks);
	marks.printMarksDetails(student);
}
}
