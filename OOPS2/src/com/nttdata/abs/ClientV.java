package com.nttdata.abs;

public class ClientV {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e=new Engine("2000CC","2440hp");
		Capacity cap=new Capacity("229kg");
		Car c=new Car("BMW","Black",79999.0,e);
		c.startVehicle(c);
		c.carDetails();
		c.stopVehicle(c);
		Bus b=new Bus("Volvo","Luxury",89999.0,cap);
		b.startVehicle(b);
		b.busDetails();
		b.stopVehicle(b);


		}


}
