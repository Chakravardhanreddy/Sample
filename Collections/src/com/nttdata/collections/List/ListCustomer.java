package com.nttdata.collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListCustomer {
	
	public static void main(String[] args) {
		
		
		List<Customer> list =new ArrayList<>();
		
		list.add(new Customer(11,  "Chakri"  ,"Hyderabad") );
		list .add(new Customer(12,  "Rajesh",  "Gachibowli"));
		list.add(new Customer(13,  "Madhu",  "Hitec city"));
		list.add(new Customer(15,  "anudeep",  "Banglore"));
		System.out.println("Forward direction");
		ListIterator<Customer> itr=list.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("Backward Direction");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
