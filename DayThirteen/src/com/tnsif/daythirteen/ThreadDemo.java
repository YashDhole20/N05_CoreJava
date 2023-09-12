package com.tnsif.daythirteen;

public class ThreadDemo {
	static void printHello() {
		System.out.println("printHello : "+Thread.currentThread());
		for(int i=0;i<2;i++)
		{
			System.out.println("Hello World!");			
		}
	}
	static void printOdd() {
		for(int i=1;i<=10;i+=2) 
			System.out.println(i);
		System.out.println(" printOdd: "+Thread.currentThread());
		
	}
	public static void main(String[] args) {
//		//  In every java program their is always a one thread running in background known as a main thread or background thread
//		Thread t= Thread.currentThread();
//		System.out.println(t.getName());
//		//when we print directly object that time toString() method is executed by default.
//		System.out.println(t);
//		printHello(); 
//		System.out.println(Thread.currentThread());
//		printOdd();
		ChildThread t1=new ChildThread();
		t1.start();
		ChildThread t2=new ChildThread();
		t2.start();
		ChildThread t3=new ChildThread();
		t3.start();
		// we can't call start method multiple time it throw an exceptions 
	}
}
 