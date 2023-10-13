package com.tnsif.dayfourteen.threadsynchronization;


public class Executor {

	/*int n;
	static int n1;
	final int n2;
	public Executor() {
		n2=10;
	}
	
	static final int n3;
	static
	{
		n3=5;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac=new Account(101, "Anit", 10000);
		System.out.println("Original Balance :"+10000);
		AccountThread t1=new AccountThread(ac, 5000);
		AccountThread t2=new AccountThread(ac, 200);
		
		//with thread
		t1.start();
		t2.start();
		
		//without Thread
//		try {
//			a.deposit(5000);
//			a.withdraw(500);
//		}
//		catch(InsufficientBalanceException e) {
//			 e.printStackTrace();
//		}
//		catch(DepositLimitExceedsException e) {
//			e.printStackTrace();
//		}
		
	}

}
