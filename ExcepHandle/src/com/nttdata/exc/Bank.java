package com.nttdata.exc;
import java.util.Scanner;


public class Bank {
	
	private String bName;
	private String bIFSC;
	Account account;

	Scanner sc = new Scanner(System.in);

	public Bank(String bName, String bIFSC, Account account) {
	super();
	this.bName = bName;
	this.bIFSC = bIFSC;
	this.account = account;
	}

	public String getbName() {
	return bName;
	}
	public void setbName(String bName) {
	this.bName = bName;
	}

	public String getbIFSC() {
	return bIFSC;
	}
	public void setbIFSC(String bIFSC) {
	this.bIFSC = bIFSC;
	}

	public Account getAccount() {
	return account;
	}
	public void setAccount(Account account) {
	this.account = account;
	}

	public void transferAmount(User u_a, User u_t, double withDraw) throws Exception
	{
	if(u_a.account.getAccBalance() < withDraw)
	{
	throw new InValidAmount("You have Insufficent funds to withdraw amount. Please try for Lesser Amount!!!");
	}
	else
	{
	u_a.account.setAccBalance(u_a.account.getAccBalance() - withDraw);
	u_t.account.setAccBalance(u_t.account.getAccBalance() + withDraw);
	}
	u_a.displayBankDetails(u_a);
	System.out.println();
	u_t.displayBankDetails(u_t);
	}


	void displayBankDetails(User u)
	{
	if (u instanceof User)
	{
	User u1 = (User)u;
	System.out.println("Detials of Bank are: ");
	System.out.println("Bank Name is: "+bName);
	System.out.println("Bank IFSC Code is: "+bIFSC);
	System.out.println("User Id is: "+u1.getUserId());
	System.out.println("User Age is: "+u1.getUserAge());
	System.out.println("Bank Account Name is: "+u1.account.getAccName());
	System.out.println("Bank Account Balance is: "+u1.account.getAccBalance());

	}
	}

}
