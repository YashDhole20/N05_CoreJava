package org.tnsif.queue;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> aque=new ArrayDeque<Integer>();
		
		aque.add(10);
		aque.add(50);
		aque.add(45);
		aque.add(98);
		aque.add(75);
		aque.add(5);
		System.out.println(aque);
		
		aque.addFirst(61);
		aque.addLast(15);
		System.out.println(aque);
		
		System.out.println("Queue size : "+aque.size());
		System.out.println("Is queue is empty : "+aque.isEmpty());
		System.out.println("Remove element(Normally): "+aque.remove());
		System.out.println("Remove element(First): "+aque.removeFirst());
		System.out.println("Remove element(Last): "+aque.removeLast());
		System.out.println("To check which is peek(Normal peek): "+aque.peek());
		System.out.println("To check which is peek(First peek): "+aque.peekFirst());
		System.out.println("To check which is peek(Last peek): "+aque.peekLast());
		
		System.out.println(aque);
		
		while(!aque.isEmpty()) {
			System.out.println("Remove element(Normally): "+aque.remove());
		}
	}
}
