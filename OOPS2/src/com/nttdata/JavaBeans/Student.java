package com.nttdata.JavaBeans;

public class Student implements MarksDao {
	String studName;

	public Student(String studName)
	{
	super();
	this.studName = studName;
	}


	@Override
	public Marks createMarks(Marks marks)
	{
	System.out.println("Marks of Student "+studName+" is");
	System.out.println("Maths Marks: "+marks.getMathsMarks());
	System.out.println("Chemistry  Marks: "+marks.getChemistryMarks());
	System.out.println("Physics Marks: "+marks.getPhysicsMarks());
	return marks;
	}

}
