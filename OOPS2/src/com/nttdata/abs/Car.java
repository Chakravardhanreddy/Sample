package com.nttdata.abs;

public class Car implements Vehicle {
	String cName;
	String color;
	double cost;
	Engine engine;
	public Car(String cName, String color, double cost, Engine engine) {
	super();
	this.cName = cName;
	this.color = color;
	this.cost = cost;
	this.engine = engine;
	}
	@Override
	public void startVehicle(Vehicle v) {
	Car c=(Car)v;
	System.out.println("Vehicle has started and its name is"+c.cName);


}
	public void carDetails()
	{
	System.out.println("Car color is :"+color);
	System.out.println("Car cost is :"+cost);
	System.out.println("Car engine power is"+ engine.power);
	System.out.println("Car engine chamber is"+ engine.engchamber);

	}
	@Override
	public void stopVehicle(Vehicle v) {
	// TODO Auto-generated method stub
	System.out.println("Car has stopped");
	}
		
	}

