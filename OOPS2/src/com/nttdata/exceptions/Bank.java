package com.nttdata.exceptions;

public class Bank {
	
	private String bName;
	private int bCode;
	private String badd;
	public Bank(String bName, int bCode, String badd) {
	super();
	this.bName = bName;
	this.bCode = bCode;
	this.badd = badd;
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
	public String getBadd() {
	return badd;
	}
	public void setBadd(String badd) {
	this.badd = badd;
	}




}
