package com.nttdata.ex;

public class User extends Bank {
	
	private String userId;
	private int userAge;

	public User(String bName, String bIFSC, Account account, String userId, int userAge) {
	super(bName, bIFSC, account);
	this.userId = userId;
	this.userAge = userAge;
	}

	public String getUserId() {
	return userId;
	}

	public void setUserId(String userId) {
	this.userId = userId;
	}

	public int getUserAge() {
	return userAge;
	}

	public void setUserAge(int userAge) {
	this.userAge = userAge;
	}

}
