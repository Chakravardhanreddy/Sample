package com.nttdata.abstrac;
import java.util.Scanner;

public class Account {
	
	
	int acc;
	double accbal;
	public Account(int acc, double accbal) {
	super();
	this.acc = acc;
	this.accbal = accbal;
	}
	public int getAcc() {
	return acc;
	}
	public void setAcc(int acc) {
	this.acc = acc;
	}
	public double getAccbal() {
	return accbal;
	}
	public void setAccbal(double accbal) {
	this.accbal = accbal;
	}




}
