package com.nttdata.abstrac;

public class PrivateBank extends Bank implements Rbi {
	private String bankType;
	private double loanInt;
	public PrivateBank(String bName, int bCode, Account account, String bankType, double loanInt) {
	super(bName, bCode, account);
	this.bankType = bankType;
	this.loanInt = loanInt;
	}
	public String getBankType() {
	return bankType;
	}
	public void setBankType(String bankType) {
	this.bankType = bankType;
	}
	public double getLoanInt() {
	return loanInt;
	}
	public void setLoanInt(double loanInt) {
	this.loanInt = loanInt;
	}
	@Override
	public void loanInterestCalc(Rbi r) {
	// TODO Auto-generated method stub
	double bal=account.getAccbal()* (loanInt/100);
	System.out.println("loan intrest amount is"+bal);

	}


	}  
	


