package com.nttdata.ByteStrea;

import java.io.Serializable;

public class Employee implements Serializable {
	
	
	
	transient int a;
	static int b;
	String name;
	int age;
	public Employee(int a, String name, int age) {
		super();
		this.a = a;
		this.name = name;
		this.age = age;
	}
	
	
	void print(Employee e)
	{
		System.out.println("Transient value "+e.a+"\t"+"Name is :"+e.name+"\t"+"Age is"+e.age+"\t"+"static value of b"+e.b);
		
		
	}

}
