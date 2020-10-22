package com.nttdata.Inheritance;


	public class Car extends Vehicle{
		int cmodel;

		public Car(int vno, String name, int wheels, Engine engine, int cmodel) {
		super(vno, name, wheels, engine);
		this.cmodel = cmodel;
		}
		public void size()
		{
		System.out.println("size of car is smaller");
		}

		}
	
	


