package com.nttdata.nested;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DebitCard obj=new DebitCard(12,"chakri",144);
		DebitCard.Account acc=obj.new Account(147,47956.0,30);
		boolean b=acc.validateDebitCard(30,"chakri");
				if(b==true)
				{
					System.out.println("your details are validated successfully");
					
				}
				else
				{
					System.out.println("your details are not validated");
				}

	}

}
