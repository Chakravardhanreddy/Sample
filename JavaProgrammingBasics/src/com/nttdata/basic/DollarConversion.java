package com.nttdata.basic;
import java.util.Scanner;

public class DollarConversion {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double a=scan.nextDouble();
		
		double french=6.85062;
		double us;
	 us=french*a;
		System.out.println("result is " +us);
	}

}
