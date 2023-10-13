package com.tnsif.dayfourteen.threadsynchronization;

public class Account implements Bank{
	
	private int accNo;
	private String name;
	private int balance;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

	public Account(int accNo, String name, int balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	 

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(int amount) throws DepositLimitExceedsException {
		 
		if(amount>Bank.DEPOSIT_LIMIT) {
			throw new DepositLimitExceedsException("Deposit limit exceed...");
		}
		else {
			balance+=amount;
			System.out.println("Balance after deposit"+amount+":"+balance);
		}
	}

	@Override
	public synchronized void withdraw(int amount) throws InsufficientBalanceException {
		 
		if(balance-Bank.MINIMUM_BALANCE<amount) {
			throw new InsufficientBalanceException("Minimum balance for withdraw...");
		}
		else {
			balance-=balance;
			System.out.println("Balance after withdraw"+amount+":"+balance);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
