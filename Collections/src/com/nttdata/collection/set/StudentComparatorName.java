package com.nttdata.collection.set;

import java.util.Comparator;

public class StudentComparatorName implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	return o1.getSname().compareTo(o2.getSname());
	}

}
