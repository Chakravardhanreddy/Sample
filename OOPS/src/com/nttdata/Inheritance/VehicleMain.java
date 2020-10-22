package com.nttdata.Inheritance;

public class VehicleMain {
	

		public static void main(String[] args) {


		Engine e=new Engine(101,"225cc");
		Car c=new Car(12,"car",141,e,2);
		c.start();
		c.stop();
		c.size();
		c.display();

		Bus b=new Bus(101,"Bus",104,e,"BMW");
		b.start();
		b.stop();
		b.size();
		b.display();




		}

		}


