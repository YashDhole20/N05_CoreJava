package org.tnsif.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	// Add first and last in feature of dequeue
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(70);
		pq.add(10);
		pq.add(20);
		pq.add(40);
		pq.add(35);
		pq.add(61);
		
		System.out.println(pq);
		
		System.out.println("Priority Queue size :"+pq.size());
		System.out.println("Is Priority Queue is empty :"+pq.isEmpty());
		System.out.println("Remove element(Normally) :"+pq.remove());
		System.out.println("To check which no is peek :"+pq.peek());
		
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
			System.out.println("Remove element :"+pq.remove());
		}
		

	}

}
