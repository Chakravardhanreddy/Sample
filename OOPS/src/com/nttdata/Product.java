package com.nttdata;
import java.util.Scanner;

public class Product {
	Scanner scan=new Scanner(System.in);

	int pid;
	String pname;
	String paddress;


	public  void pr() {
	System.out.println("enter product id");
	pid=scan.nextInt();
	System.out.println("enter product name");
	pname=scan.next();
	System.out.println("enter product address");
	paddress=scan.next();


	}
	public void displayProductDetails()
	{
	System.out.println("Product Details:");
	System.out.println("Product Id: "+ pid );
	System.out.println("Product name: "+ pname);
	System.out.println("Product Address :"+paddress);
	}

	}

