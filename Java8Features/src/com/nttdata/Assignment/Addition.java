package com.nttdata.Assignment;

import java.util.function.BiFunction;

public class Addition {
	
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static float add1(int a,float b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		
		
		BiFunction<Integer, Integer,Integer>add=Addition::add;
		int res=add.apply(30, 40);
		System.out.println("Addition "+res);
		
		BiFunction<Integer, Float,Float>add1=Addition::add1;
		Float result=add1.apply(30, 40.98f);
		System.out.println("FloatAddition "+result);
		
		
	}

}
