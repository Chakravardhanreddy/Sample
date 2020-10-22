package com.nttdata.abs;

public class Client {

	public static void main(String[] args) {
		Ram ram=new Ram("8GB");
		MotherBoard mb = new MotherBoard(ram,"intel");
		Processor p=new Processor("16GB");
		Computer c=new Computer("Dell","white",mb,80000);
		c.startDevice(c);
		c.displayComputerDetails();
		c.stopDevice(c);
		Mobile m=new Mobile("Samsung"," Black",p,45000.0);
		m.startDevice(m);
		m.mobiledetailsSpecifications();
		m.stopDevice(m);



	}

}
