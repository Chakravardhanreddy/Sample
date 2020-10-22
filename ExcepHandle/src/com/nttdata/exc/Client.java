package com.nttdata.exc;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Amount to withdraw..");
		// double withdraw = sc.nextDouble();
		Account account_anu = new Account("Anu", 25000);
		User user_anu = new User("SBI", "SBI2020", account_anu, "505", 25);
		user_anu.displayBankDetails(user_anu);

		System.out.println("--------------------------------------------------");
		Account account_tanu = new Account("Tanu", 10000);
		User user_tanu = new User("CITI Bank", "CITI777", account_tanu, "510", 20);
		user_tanu.displayBankDetails(user_tanu);
		System.out.println("----------------------------------------------------");

		System.out.println("Enter the Amount to withdraw from Anu...");
		double withDraw = sc.nextDouble();
		try {
		user_anu.transferAmount(user_anu,user_tanu,withDraw);
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

}
