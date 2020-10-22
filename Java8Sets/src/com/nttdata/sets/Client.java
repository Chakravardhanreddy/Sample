package com.nttdata.sets;

import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Product> list=new TreeSet<>((p1,p2)->p1.getPname().compareTo(p2.getPname()));
		list.add(new Product(101,"Samsung",200));
		list.add(new Product(134,"Redmi",220));
		list.add(new Product(202,"oppo",320));
		list.add(new Product(131,"honor",620));
		list.add(new Product(441,"nokia",210));
		list.add(new Product(147,"apple",750));
		list.add(new Product(652,"dell",185));
		list.add(new Product(741,"asus",750));
		

		//Set<Double> d1=list.stream().filter(p->p.price>350).map(p->p.price).collect(Collectors.toSet());
	
		list.forEach(s->System.out.println(s));

	}

}
