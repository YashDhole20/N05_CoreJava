package com.tnsif.daythirteen;

public class MyThreadChild  extends Thread{
	public MyThreadChild(){
		start();
	}
	public void run() {
		System.out.println("start with the constructor "+Thread.currentThread().getName().toString());
		System.out.println(Thread.currentThread().getName()+" "+isAlive());
	}
	
}
