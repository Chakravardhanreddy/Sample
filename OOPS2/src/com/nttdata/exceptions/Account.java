package com.nttdata.exceptions;

public class Account {
	
	private int accNo;
	private double accBal;
	public Account(int accNo, double accBal) {
	super();
	this.accNo = accNo;
	this.accBal = accBal;
	}
	public int getAccNo() {
	return accNo;
	}
	public void setAccNo(int accNo) {
	this.accNo = accNo;
	}
	public double getAccBal() {
	return accBal;
	}
	public void setAccBal(double accBal) {
	this.accBal = accBal;
	}
	@Override
	public String toString() {
	return "Account [Account Number is =" + accNo + ", Account Balance is=" + accBal + "]";
	}


}
