package com.tnsif.daythirteen;

public class MyThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThreadChild t1,t2;
		t1=new MyThreadChild();
		t2=new MyThreadChild();
		//t1.start(); cannnot be start again
		t1.join();
		t2.join();
		System.out.println("-----------------------------------");
		System.out.println(Thread.currentThread().getName()+" "+t1.isAlive());
	}

}
