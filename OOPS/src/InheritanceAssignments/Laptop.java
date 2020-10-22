package InheritanceAssignments;

public class Laptop extends ElectronicDevice {
	int rom;

	public Laptop(String name, int cost, Ram ram, int rom) {
	super(name, cost, ram);
	this.rom = rom;
	}


}
