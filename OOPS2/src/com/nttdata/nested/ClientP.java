package com.nttdata.nested;

public class ClientP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product(197,"Samsung","hyd");


		try {
		Product p1=(Product)p.clone();
		System.out.println("Cloned product id: "+p1.pid);
		System.out.println("Cloned product name: "+p1.pname);
		System.out.println("Cloned product address: "+p1.padd);
		Product p2=(Product)p.clone();
		System.out.println("Cloned product id: "+p2.pid);
		System.out.println("Cloned product name: "+p2.pname);
		System.out.println("Cloned product address: "+p2.padd);
		} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
}




		}


