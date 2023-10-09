package com.tnsif.daythirteen;

public class RunnableDemo {

	public static void main(String[] args) throws InterruptedException {
		//  
		ThreadImpl imp=new ThreadImpl();
		Thread t1=new Thread(imp,"First");
		t1.start();
//		imp.show();
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				char ch='a';
				for(int i=1;i<=26;i++,ch++) {
					System.out.print(Thread.currentThread().getName()+"-"+ch+"\t");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2=new Thread(r1,"Second");
		t2.start();
		//Third way -> with the help of lambda expression
		Runnable r2=()->
		{
			for(int i=1;i<=50;i+=2) {
				System.out.print(Thread.currentThread().getName()+"-"+i+"\t");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t3=new Thread(r2,"Third");
		t3.start();
		Thread.sleep(2500);
		System.out.println(" ------------------");
	}

}
