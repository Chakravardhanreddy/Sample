package com.nttdata.collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	
	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("forward direction");
		ListIterator<Integer> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("backward direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
	}

}
