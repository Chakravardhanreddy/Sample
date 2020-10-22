package InheritanceAssignments;

public class ElectronicDeviceSimulation {
	public static void main(String[] args) {
		Ram r=new Ram(11,"intel");
		Computer co=new Computer("Computer",42000,r,3600);
		co.display();
		Laptop l=new Laptop("Laptop",21000,r,9000);
		l.display();

}
}
