package com.nttdata.abstrac;
import java.util.Scanner;

public abstract class Bank {
	
	
	private String bName;
	private int bCode;
	Account account;

	public Bank(String bName, int bCode, Account account) {
	super();
	this.bName = bName;
	this.bCode = bCode;
	this.account = account;
	}

	public String getbName() {
	return bName;
	}

	public void setbName(String bName) {
	this.bName = bName;
	}

	public int getbCode() {
	return bCode;
	}

	public void setbCode(int bCode) {
	this.bCode = bCode;
	}

	public Account getAccount() {
	return account;
	}

	public void setAccount(Account account) {
	this.account = account;
	}

	public void displayBankTypeDetails(Bank bank)
	{
	if(bank instanceof PublicBank)
	{
	PublicBank p=(PublicBank)bank;
	System.out.println("Details of bank are");
	System.out.println("Bannk name is "+p.getbName());
	System.out.println("bank Type is "+p.getBankType());
	System.out.println("Loan percentage rate of Public is "+p.getLoanInt());

	}
	else
	{
	PrivateBank pri=(PrivateBank)bank;
	System.out.println("Details of bank are");
	System.out.println("Bannk name is "+pri.getbName());
	System.out.println("bank Type is "+pri.getBankType());
	System.out.println("Loan percentage rate is "+pri.getLoanInt());
	}
	}



	}


