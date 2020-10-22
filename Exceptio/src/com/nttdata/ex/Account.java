package com.nttdata.ex;

public class Account {
	
	private String accName;
	private double accBalance;

	public Account(String accName, double accBalance) {
	this.accName = accName;
	this.accBalance = accBalance;
	}

	public String getAccName() {
	return accName;
	}

	public void setAccName(String accName) {
	this.accName = accName;
	}

	public double getAccBalance() {
	return accBalance;
	}

	public void setAccBalance(double accBalance) {
	this.accBalance = accBalance;
	}


}
