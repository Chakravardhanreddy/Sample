package com.nttdata.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class StudentLinkedhash {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<Student> hset=new LinkedHashSet<>();
		 
		hset.add(new Student(18,"Anu", "Hyd"));
		hset.add(new Student(12, "Tanu", "AP"));
		hset.add(new Student(17, "Manu", "Kur"));
		hset.add(new Student(14,"Sanu","Banglore"));
		hset.add(new Student(20,"Tanay","Mysore"));
		

		for (Student student : hset) {
		System.out.println(student);
		}
	}

}
