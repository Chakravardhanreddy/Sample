package com.nttdata.nested;

public class Product implements Cloneable {
	
	int pid;
	String pname;
	String padd;

	public Product(int pid, String pname, String padd) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.padd = padd;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
	}
	}

