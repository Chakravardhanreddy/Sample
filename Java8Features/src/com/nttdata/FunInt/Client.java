package com.nttdata.FunInt;

import java.util.function.Function;
import java.util.function.Predicate;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String name="chakri";
		Greet g1=(s1)->{System.out.println(s1+" Hello");};
		g1.greeting(name);

		String name1="rajesh";
		Greet g2=(s2)->{System.out.println(s2+" Hello");};
		g2.greeting(name1);*/
		
		Predicate<Integer> p=I->(I>25);
		System.out.println("Java "+p.test(4));
		
		Predicate<String>  s1=s->(s.length()>5);
		
		System.out.println(s1.test("chakri"));
		
		
		Function <String ,Integer> f=s->s.length();
		System.out.println(f.apply("welcome"));
		System.out.println(f.apply("Hyderabad"));
	}

}
