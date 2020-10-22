package com.nttdata.collections.List;

public class Customer {
	
	
	private int custId;
	private String custName;
	private String address;
	public Customer(int custId, String custName, String address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + "]";
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	

}
