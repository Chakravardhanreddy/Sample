package com.nttdata.abs;

public class Bus implements Vehicle {
	String bName;
	String busType;
	double cost;
	Capacity capacity;
	public Bus(String bName, String busType, double cost, Capacity capacity) {
	super();
	this.bName = bName;
	this.busType = busType;
	this.cost = cost;
	this.capacity = capacity;
	}
	@Override
	public void startVehicle(Vehicle v) {
	Bus b=(Bus)v;
	System.out.println("Vehicle started and Vehicle name is "+b.bName);
	}

	public void busDetails()
	{
	System.out.println("Bus Type is :"+busType);
	System.out.println("Bus cost is :"+cost);
	
	System.out.println("Bus load  is"+ capacity.load);

	}
	@Override
	public void stopVehicle(Vehicle v) {
	// TODO Auto-generated method stub
	System.out.println("Bus has stopped");
	}

}
