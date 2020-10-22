package com.nttdata.exceptions;
import java.util.Scanner;

public class AssertionEx {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("enter number");
			int value=scan.nextInt();
			assert value<=0: "its invalid no";
			System.out.println(value);




	}

}
