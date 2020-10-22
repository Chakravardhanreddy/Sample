package com.nttdata.collection.Queue;

import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Product> queue=new PriorityQueue<>();
		queue.add(new Product(11,"TV","Sony",10000));
		queue.add(new Product(14,"Phone","Samsung",12000));
		queue.add(new Product(19,"Laptop","DELL",45000));
		queue.add(new Product(15,"Computer","Lenovo",25000));
		for(Product product:queue)
		{
			System.out.println(product);
		}
		
		queue.remove();
		System.out.println("After removing one product");
		for(Product product :queue)
			System.out.println(product);
	}

}
