package com.nttdata.exceptions;

public class User extends Bank {
	
	private String uname;
	private int uage;
	private Account account;
	public User(String bName, int bCode, String badd, String uname, int uage, Account account) {
	super(bName, bCode, badd);
	this.uname = uname;
	this.uage = uage;
	this.account = account;
	}
	public String getUname() {
	return uname;
	}
	public void setUname(String uname) {
	this.uname = uname;
	}
	public int getUage() {
	return uage;
	}
	public void setUage(int uage) {
	this.uage = uage;
	}
	public Account getAccount() {
	return account;
	}
	public void setAccount(Account account) {
	this.account = account;
	}

	public void transaction(User ua,User ub,double amount)
	{
	double d=ua.getAccount().getAccBal();
	double d1=ub.getAccount().getAccBal();
	if(ua.getAccount().getAccBal()>amount)
	{
	double u1=d-amount;
	ua.account.setAccBal(u1);
	double u2=d1+amount;
	ub.account.setAccBal(u2);


	}
	else
	System.out.println("Insuuficient funds");
	}
	@Override
	public String toString() {
	return "User [User Name is =" + uname + ", User Age is=" + uage + ", account=" + account +  ",User Bank Name =" + getbName()
	+ ", Bank Code is =" + getbCode() + ", Bank Address=" + getBadd()  + "]";
	}

}
