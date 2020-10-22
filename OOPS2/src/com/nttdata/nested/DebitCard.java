package com.nttdata.nested;

public class DebitCard {
	
	private int cardNumber;
	private String holderName;
	private int CVV;
	
	public DebitCard(int cardNumber, String holderName, int cVV) {
		super();
		this.cardNumber = cardNumber;
		this.holderName = holderName;
		CVV = cVV;
	}

	class Account
	{
		private int accountNo;
		private double balance;
		private int pin;
		
		
		
		public Account(int accountNo, double balance, int pin) {
			super();
			this.accountNo = accountNo;
			this.balance = balance;
			this.pin = pin;
		}



		boolean validateDebitCard(int pin, String ac)
		{
			if(this.pin==pin && holderName.equals(ac))
			{
				return true;
				
			}
			else
			{
				return false;
			}
		}
	}

}
