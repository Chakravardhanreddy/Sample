package com.nttdata;

public class Customer {

	int customerId;
	String customerName;
	String customerAddress;
	
	
	void inputCustomerdetails(int id,String name,String address)
	{
		customerId=id;
		customerName=name;
		customerAddress=address;
		
	}
	void displayCustomerdetails()
	{
		System.out.println("The details of customer :");
		System.out.println("Customer Id :"+customerId+ "\t "+"Customer Name :"+customerName+ "\t "+"Customer Address :"+customerAddress);
	}



}
