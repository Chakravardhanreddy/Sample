package com.nttdata.collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class DeqEx {
	
	public static void main(String[] args) {
		
		
		Deque<Product> deque=new ArrayDeque<Product>();
		deque.add(new Product(11,"TV","Sony",10000));
		deque.add(new Product(14,"Phone","Samsung",12000));
		deque.add(new Product(19,"Laptop","DELL",45000));
		deque.add(new Product(15,"Computer","Lenovo",25000));
		for(Product product:deque)
		{
			System.out.println(product);
		}
		
		deque.remove();
		System.out.println("After removing one product");
		for(Product product :deque)
			System.out.println(product);
	}

}
