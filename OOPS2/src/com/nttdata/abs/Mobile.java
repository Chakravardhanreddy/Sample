package com.nttdata.abs;

public class Mobile implements ElectroDevice {
	String mname;
	String color;
	Processor pro;
	double cost;
	public Mobile(String mname, String color, Processor pro, double cost) {
	super();
	this.mname = mname;
	this.color = color;
	this.pro = pro;
	this.cost = cost;
	}
	@Override
	public void startDevice(ElectroDevice e) {
	Mobile m=(Mobile)e;
	System.out.println(" Started device name "+m.mname);


	}
	@Override
	public void stopDevice(ElectroDevice e) {
	// TODO Auto-generated method stub
	System.out.println("Mobile stopped");

	}
	public void mobiledetailsSpecifications()
	{
	System.out.println("Device color "+color);
	System.out.println("Device cost "+cost);
	System.out.println("Device mother board ramsize "+ pro.memorySize);
	}


}
