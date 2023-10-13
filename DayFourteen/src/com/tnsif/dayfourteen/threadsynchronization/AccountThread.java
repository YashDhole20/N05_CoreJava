package com.tnsif.dayfourteen.threadsynchronization;

public class AccountThread extends Thread{
	
	Account acc;
	int amount;
	public AccountThread(Account acc, int amount) {
		super();
		this.acc = acc;
		this.amount = amount;
	}
	public AccountThread() {
		
	}
	
	public void run() {
		try {
			synchronized (acc) {
				acc.withdraw(amount);
			}
			//acc.deposit(amount);
		}
//		catch(DepositLimitExceedException e) {
//			e.printStackTrace();
//		}
		catch(InsufficientBalanceException e) {
			e.printStackTrace();
		}
	}
	
}
