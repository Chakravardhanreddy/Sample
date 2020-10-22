package InheritanceAssignments;

public class Computer extends ElectronicDevice {
	int rom;

	public Computer(String name, int cost, Ram ram, int rom) {
	super(name, cost, ram);
	this.rom = rom;
	}




}
