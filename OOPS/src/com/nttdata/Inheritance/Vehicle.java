package com.nttdata.Inheritance;

public class Vehicle {
	
		int vno;
		String name;
		int wheels;
		Engine engine;
		public Vehicle(int vno, String name, int wheels, Engine engine) {

		this.vno = vno;
		this.name = name;
		this.wheels = wheels;
		this.engine = engine;
		}
		public void start()
		{
		System.out.println("Start vehilce");
		}
		 void stop()
		{
		System.out.println("Stop vehicle");
		}
		public void display()
		{
		System.out.println("Details of vehicle are :");
		System.out.println("Vehicle number is :  "+ vno);
		System.out.println("Vehicle name is :  "+ name);
		System.out.println("vehicle wheels are : " + wheels);
		System.out.println("engine power is specified as : " + engine.power);
		System.out.println("engine chamber is specified as : "+ engine.engchamber);
		System.out.println();
		System.out.println();
		}
		}



