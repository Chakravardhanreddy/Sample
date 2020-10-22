package com.nttdata.Str;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithStr {
	
	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<>();
		list.add(new Product(101,"Samsung",200));
		list.add(new Product(134,"redmi",220));
		list.add(new Product(202,"oppo",320));
		list.add(new Product(131,"nokia",620));
		list.add(new Product(441,"micromax",210));
		list.add(new Product(741,"apple",750));
		list.add(new Product(652,"honor",185));

		//List<Double> listD=new ArrayList<>();
		List<Double>d=list.stream().filter(p->p.price<350).map(p->p.price).collect(Collectors.toList());
		System.out.println(d);
		//Stream.iterate(1,e->e+1).filter(e->e%2==0).limit(5).forEach(System.out::println);

		//list.stream().filter(p->p.price>350).forEach(p->System.out.println(p.price));
		Double dd=list.stream().map(p->p.price).reduce(0.0, (sum,price)->(sum+price));
		System.out.println(dd);
		
		
		
	}

}
