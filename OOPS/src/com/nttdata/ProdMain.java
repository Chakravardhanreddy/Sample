package com.nttdata;
import java.util.Scanner;
public class ProdMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Product p=new Product();
		for(int i=0;i<50;i++)
		{
		System.out.println("Do you want to continue: yes or no");
		String res=scan.next();
		if(res.compareTo("yes")==0)
		{
		System.out.println("1. enter product details ");
		p.pr();
		System.out.println("2. display product details");
		p.displayProductDetails();
		}
		else
		{

		System.out.println("No details available");
		break;
		}
		}


		}

		}





