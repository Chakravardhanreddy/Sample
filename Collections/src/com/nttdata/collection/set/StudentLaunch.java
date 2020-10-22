package com.nttdata.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StudentLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list=new ArrayList<>();

		list.add(new Student(108,"Naveen", "Hyd"));
		list.add(new Student(102, "Nav", "AP"));
		list.add(new Student(107, "Chak", "Kur"));
		list.add(new Student(104,"Anu","Banglore"));
		list.add(new Student(105,"Tanu","Mysore"));
		System.out.println("Forward direction");
		//Collections.sort(list);
		System.out.println("Sort By Student Id");
		Collections.sort(list, new StudentComparatorId());
		ListIterator<Student> itr= list.listIterator();

		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}

		System.out.println();
		System.out.println("-----------------------");

		System.out.println("Sort By Student Name");
		Collections.sort(list, new StudentComparatorName());
		ListIterator<Student> itrn= list.listIterator();
		while(itrn.hasNext())
		{
		System.out.println(itrn.next());
		}

	}

	}



