package com.nttdata.collection.set;
import java.util.TreeSet;

public class StudentTree {
	
	public static void main(String[] args) {
		
		
		 TreeSet<Student> treeset=new TreeSet<>(new StudentComparatorId());
		 treeset.add(new Student(18,"Anu", "Hyd"));
			treeset.add(new Student(12, "Tanu", "AP"));
			treeset.add(new Student(17, "Manu", "Kur"));
			treeset.add(new Student(14,"Sanu","Banglore"));
			treeset.add(new Student(20,"Tanay","Mysore"));
			

			for (Student student : treeset) {
			System.out.println(student);
	}

}
}
