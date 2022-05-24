package com.ibm.bank;
public class Current extends Accounts {
	private double overdraft;
	public Current() {
		// TODO Auto-generated constructor stub
	}
	public Current(String holder) {
		super(holder,INIT_CURRENT_BAL);
		overdraft=OVERDRAFT_LIMIT;
	}
	@Override
	public void summary() {
		// TODO Auto-generated method stub
		super.summary();
		System.out.println("overdraft: "+overdraft);
	}
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		overdraft+=amount;
		if(overdraft>OVERDRAFT_LIMIT) {
			balance+= overdraft-OVERDRAFT_LIMIT;
			overdraft=OVERDRAFT_LIMIT;
		}
		
		
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount<=(balance+overdraft)) {
			balance-=amount;
			if(balance<0) {
				overdraft+=balance;
				balance=0;
			}
			
		}
		else
			System.out.println("Insufficient balance");
		
	}
	
	
	
	

}
