package com.nttdata.Assignment;

public class MethodReferenceInstance {
	
	void hello()
	{
		System.out.println(" this is instance method");
	}
	
	public static void main(String[] args) {
		
		
		MethodReferenceInstance m=new MethodReferenceInstance();
		Greeter g=m::hello;
		g.greeting();
		
	}

}
