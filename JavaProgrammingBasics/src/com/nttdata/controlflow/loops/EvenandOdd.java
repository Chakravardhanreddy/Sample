package com.nttdata.controlflow.loops;

import java.util.Scanner;

public class EvenandOdd {
	public static void main(String[] args) {
		
		System.out.println("even numbers are");
		for (int i = 1; i <= 100; i++) {
		
			if( i%2==0)
			
				System.out.println(i);
		}
		System.out.println("odd numbers are");
			for(int j=1;j<=100;j++) {
				
			if(j%2!=0)
			
				System.out.println(j);
				
			}
	

}
}
