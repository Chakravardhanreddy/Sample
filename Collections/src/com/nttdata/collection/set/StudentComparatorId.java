package com.nttdata.collection.set;

import java.util.Comparator;

public class StudentComparatorId implements Comparator<Student> {
	
	@Override
	public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	if(o1.getSid()>o2.getSid())
	{
	return 1;
	}
	else if(o1.getSid()<o2.getSid())
	{
	return -1;
	}
	return 0;
	}


}
