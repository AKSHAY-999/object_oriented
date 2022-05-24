                                         package com.ibm.bank;

public abstract class Accounts implements Bank{
	private int actNo;
	private String holder;
	protected double balance;
	private static int counter=10;
	
	
	//Application constants
//	public static int INIT_ACT_NO=1001;
//	public static final double MIN_SAVINGS_BAL=1000;
//	public static final double INIT_CURRENT_BAL=5000;
//	public static final double MIN_CURRENT_BAL=0;
//	public static final double OVERDRAFT_LIMIT=10000;
	
	
	public Accounts() {
		// TODO Auto-generated constructor stub
	}

	public Accounts(String holder, double balance) {
		super();
		this.actNo = counter++;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void summary() {
		System.out.println("A/C No: " + actNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	
	///Buisness logicmethods
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public abstract void withdraw(double amount); 
//	{
//		if(amount<=balance)
//			balance-=amount;
//		else
//			System.out.println("Insufficient Balnace");
//	}

}
