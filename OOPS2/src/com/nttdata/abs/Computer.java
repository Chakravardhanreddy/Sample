package com.nttdata.abs;

public class Computer implements ElectroDevice {
	String cName;
	String color;
	MotherBoard motherBoard;
	double cost;
	public Computer(String cName, String color, MotherBoard motherBoard, double cost) {
	super();
	this.cName = cName;
	this.color = color;
	this.motherBoard = motherBoard;
	this.cost = cost;
	}
	@Override
	public void startDevice(ElectroDevice e) {
	Computer c=(Computer)e;
	System.out.println(" Started device name "+c.cName);

	}
	@Override
	public void stopDevice(ElectroDevice e) {

	System.out.println("Computer Stopped");

	}

	void displayComputerDetails()
	{

	System.out.println("Device color "+color);
	System.out.println("Device cost "+cost);
	System.out.println("Device mother board ramsize "+ motherBoard.ram.ramSize);
	System.out.println("Device mother board model "+motherBoard.model);


	}

}
