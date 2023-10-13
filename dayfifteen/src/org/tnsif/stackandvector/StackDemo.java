package org.tnsif.stackandvector;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		 
		Stack<Integer> st=new Stack<Integer>();
		
		st.add(20);
		st.add(40);
		st.add(35);
		st.add(80);
		st.add(15);
		System.out.println(st);
		
		
		
		System.out.println("Stack size :"+st.size());
		System.out.println("Is stack is empty : "+st.isEmpty());
		System.out.println("Remove element :"+st.pop());
		System.out.println("To check which no is peek :"+st.peek());

		System.out.println(st);
		
		while(!st.isEmpty()) {
			System.out.println("Removed element :"+st.pop());
		}
	}

}
