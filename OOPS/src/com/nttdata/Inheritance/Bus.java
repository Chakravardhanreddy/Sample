package com.nttdata.Inheritance;


	public class Bus extends Vehicle{
	
	String style;

	public Bus(int vno, String name, int wheels, Engine engine, String style) {
	super(vno, name, wheels, engine);
	this.style = style;
	}
	public void size()
	{
	System.out.println(" Size of bus is bigger");
	}
	}

