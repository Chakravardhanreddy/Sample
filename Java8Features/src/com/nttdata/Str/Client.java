package com.nttdata.Str;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product>list=new ArrayList<>();
		list.add(new Product(12,"Laptop",40000));
		list.add(new Product(4,"Mobile",20000));
		list.add(new Product(10,"Computer",50000));
		list.add(new Product(15,"TV",15000));
		list.add(new Product(11,"AC",10000));
		
		List<Double> listD=new ArrayList<>();
		
	
		for(Product p:list) {
			if(p.price <20000)
			{
				listD.add(p.price);
				
			}
			
			System.out.println(listD);
			
			
	
		
		
		}

	}

}