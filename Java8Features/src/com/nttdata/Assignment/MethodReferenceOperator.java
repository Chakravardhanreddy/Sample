package com.nttdata.Assignment;

public class MethodReferenceOperator {
	
	static void foo()
	{
		System.out.println(" this is static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello h=MethodReferenceOperator::foo;
		System.out.println(h);
		h.print();
		

	}

}
