package org.tnsif.lambdaexpression;
//Program to demonstrate Functional interfaces
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		 
		Supplier<String> mySupl;
		mySupl=()->"Hello";
		System.out.println(mySupl.get());
		
		mySupl=()->"Yash Raghunath Dhole";
		System.out.println(mySupl.get());

		Consumer<Integer> con;
		con=(n)->{
			if(n>0)System.out.println("Positive");
		else
			System.out.println("Negative");
		};
			 
			con.accept(10);
			con.accept(-11);
			

		Predicate<Integer> pre;
		pre=(no)->no%2==0;
		
		System.out.println(pre.test(11)?"Even":"Odd");
		System.out.println(pre.test(12)?"Even":"Odd");
		
		Function<Integer, String> fun;
		
		fun=(no)->no>0?"positive":"negative";
		System.out.println(fun.apply(10));
		
		BiFunction<Integer, Integer, Integer> bifun;
		
		bifun=(a,b)->a>b?a:b;
		System.out.println("Maximum is "+bifun.apply(15,21));
		
		
		bifun=(a,b)->a<b?a:b;
		System.out.println("Minimum is "+bifun.apply(15,21));
		
		BiFunction<String, String, String> strBifun;
		
		strBifun=(s1,s2)->s1.equals(s2)?"same":"not same";
		
		System.out.println(strBifun.apply("Hello","Hello"));

		System.out.println(strBifun.apply("Hello","Helo"));
		
	}

}
