package com.nttdata.collection.Queue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedH {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,Product> hashMap=new LinkedHashMap<>();
		hashMap.put(1, new Product(11,"TV","Sony",10000));
		hashMap.put(null,new Product(14,"Phone","Samsung",12000));
		hashMap.put(4,new Product(19,"Laptop","DELL",45000));
		hashMap.put(7,new Product(15,"Computer","Lenovo",25000));
		
		for(Map.Entry<Integer, Product> m:hashMap.entrySet())
		{
			System.out.println("Key is :"+m.getKey()+ "\t"+"value is"+m.getValue());
		}

		
	}

}
