package com.nttdata.abstrac;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter private bank Name: ");
		String name=scan.next();
		System.out.println("Enter bank Code: ");
		int bCode=scan.nextInt();
		System.out.println("Enter acc. no ");
		int ano=scan.nextInt();
		System.out.println("Enter acc. bal ");
		double balance=scan.nextDouble();
		System.out.println("Enter bank Type");
		String btype=scan.next();
		System.out.println("Enter loan Int ");
		double loan=scan.nextDouble();
		Account account=new Account(ano,balance);
		PrivateBank p=new PrivateBank(name,bCode,account,btype,loan);
		p.displayBankTypeDetails(p);
		p.loanInterestCalc(p);


		System.out.println("Enter Public bank Name: ");
		String name1=scan.next();
		System.out.println("Enter bank Code: ");
		int bCode1=scan.nextInt();
		System.out.println("Enter acc. no ");
		int ano1=scan.nextInt();
		System.out.println("Enter acc. bal ");
		double balance1=scan.nextDouble();
		System.out.println("Enter bank Type");
		String btype1=scan.next();
		System.out.println("Enter loan Int ");
		double loans=scan.nextDouble();
		Account account1=new Account(ano1,balance);
		PublicBank p1=new PublicBank(name1,bCode1,account1,btype1,loans);
		p1.displayBankTypeDetails(p1);
		p1.loanInterestCalc(p1);
		}

		}

	
	


