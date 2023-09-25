package org.tnsif.assignmentone;
import java.util.*;
public class ReverseOrder {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the value of n :");
		 int n=sc.nextInt();
		 int temp=0;
		 int pinky[]=new int[n];
		 int mary[]=new int[n];
		 System.out.println("Numbers said by Pinky :");
		 for(int i=0;i<n;i++) {
			 pinky[i]=sc.nextInt();
		 }
		 System.out.println("Numbers said by Mary : ");
		 for(int i=0;i<n;i++) {
			 mary[i]=sc.nextInt();
		 }
		 for(int i=0 ,j=n-1;i<n;i++,j--) {
			 if(pinky[i]!=mary[j]) {
				 temp=1;
				 break;
			 }
		 }
		 if(temp==0) {
			 System.out.println("Yes.it is in reverse order..");
		 }
		 else {
			 System.out.println("Not.it is not in reverse order..");
		 }
	}

}
