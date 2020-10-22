package com.nttdata.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> list=new ArrayList<>();
		ListIterator<User> itr=list.listIterator();
		Scanner scan=new Scanner (System.in);
		System.out.println("welcome to SBI");
		System.out.println("print yes to continue");
		String s=scan.next();
		while(s.compareTo("yes")==0)
		{
		System.out.println("To start the process select"+"\n"+"1.Enter details of users "+"\n"+"2. Display details of users"+"\n"+
		"3. Enter transaction details " +"\n"+"4. Exit the simulation");

		int n=scan.nextInt();
		switch (n) {
		case 1:
		{
		System.out.println("Enter user name");
		String uname=scan.next();
		System.out.println("Enter user age");
		int age=scan.nextInt();
		System.out.println("Enter account number ");
		int accNo=scan.nextInt();
		System.out.println("Enter acc bal");
		double bal=scan.nextDouble();
		System.out.println("enter address");
		String add=scan.next();
		System.out.println("enter bank name");
		String bname=scan.next();
		System.out.println("enter bank code");
		int bcode=scan.nextInt();
		Account a=new Account(accNo,bal);
		list.add(new User(bname,bcode,add,uname,age,a));
		// System.out.println("User name :"+uname+"\t"+" User age :"+age+"\t"+"Bank Name: "+bname+"\n"+
		// " Bank code: "+bcode+" Account number: "+accNo+"Account bal: "+bal);

		break;
		}
		case 2:
		{

		for(User u1:list)
		{
		System.out.println(u1);
		}

		break;
		}
		case 3:
		{
		System.out.println("Enter amount to transer");
		double b=scan.nextDouble();
		// User u=new User(bname,bcode,add,uname,age,a);
		double da=list.get(0).getAccount().getAccBal()-b;
		System.out.println("User A balance updated "+da);
		double db=list.get(1).getAccount().getAccBal()+b;
		System.out.println("User b updated balcnce is"+db);

		break;
		}
		default:
		System.out.println("Thank You for banking");
		break;
		}
		if(n==4)
		{
		System.out.println("Simulation Ends");
		break;
		}

		} 

	}

}
