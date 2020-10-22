package InheritanceAssignments;

public class ElectronicDevice {
	String name;
	int cost;
	Ram ram;
	public ElectronicDevice(String name, int cost, Ram ram) {
	super();
	this.name = name;
	this.cost = cost;
	this.ram = ram;
	}

	public void display()
	{
	System.out.println("Name of Electronic Device: "+name);
	System.out.println("Cost of Electronic Device: "+cost);
	System.out.println(" ram size :"+ ram.ramsize);
	System.out.println(" Processor  used is :"+ram.processor);
	System.out.println();
	System.out.println();
	}
	}

