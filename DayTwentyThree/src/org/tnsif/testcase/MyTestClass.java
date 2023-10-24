package org.tnsif.testcase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.tnsif.businesslogic.Operations;

 
public class MyTestClass {
	//@Test -> used for unit testing(Only for the method level not for class)
	//Test methods
	 
	@Test 
	public void testFactorial() {
		long result=Operations.getFactorial(4);
		long answer=24;
		Assertions.assertEquals(answer, result);
	}
	@Test
	public void testFactorialForZero() {
		long actual=Operations.getFactorial(0);
		long expected=1;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void testFactorialForNegativeNumbers() 
	{
		long actual=Operations.getFactorial(-6);
		long expected=-1;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testPrimePositive() 
	{
		Assertions.assertTrue(Operations.isPrime(13));
	}
	@Test
	public void testPrimeNegative() 
	{
		Assertions.assertFalse(Operations.isPrime(12));
	}
	
	@Test
	public void testNon_PrimePositive() 
	{
		Assertions.assertTrue(Operations.isPrime(13));
	}
	
	@Test
	public void testNon_PrimeNegative() 
	{
		Assertions.assertFalse(Operations.isPrime(13));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,3,7,1})
	public void testForPrime(int no)
	{
		assertTrue(Operations.isPrime(no));
	}	
	
	@ParameterizedTest
	@CsvSource({"3,6","0,1","-7,-1","6,720"})
	public void testForFractorial(int no,int fact) 
	{
		assertEquals(fact,Operations.getFactorial(no));
	}
	
	@ParameterizedTest
	@CsvSource({"3,6","0,1","-4,-1","7,5040"})
	public void testForFractorialOne(int no,long fact) 
	{
		long actual=Operations.getFactorial(no);
		assertEquals(fact,actual);
	}
	
	@Test
	public void testForNumberPalindrome() {
		assertTrue(Operations.isNumberPalindrome(121));
	}

	@ParameterizedTest
	@CsvSource({"1221,true","159,false","45654,true"})
	public void testForNumberPalindromeC(int no,boolean actual) {
		assertEquals(actual,Operations.isNumberPalindrome(no));
	}
	@Test
	public void testForNotNumberPalindrome() {
		assertFalse(Operations.isNumberPalindrome(123));
	}
	
	@Test
	public void testForStringPalindrome() {
		assertTrue(Operations.isStringPalindrome("racecar"));
	}
	
	@ParameterizedTest
	@CsvSource({"car,false","racecar,true","madam,true"})
	public void testForStringPalindromeP(String s,boolean expecte) {
		assertEquals(expecte,Operations.isStringPalindrome(s));
	}

	@Test
	public void testForNotStringPalindrome() {
		assertFalse(Operations.isStringPalindrome("Hello"));
	}
	
}
