package com.nttdata.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;




public class StudentHash {
	
	public static void main(String[] args) {
		
		
		HashSet<Student> hset=new HashSet<>();
		 
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
