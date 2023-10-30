package org.tnsif.testcase;

 
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class TestCaseMethod {

	@BeforeAll
	public void  beforeAll() {
		System.out.println("Test before all");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Test before each");
	}
	@Test
	public void testOne() {
		System.out.println("Test One");
	}
	@Test
	public void testTwo() {
		System.out.println("Test Two");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("Test after each");
	}
	@AfterAll
	public void afterAll() {
		System.out.println("Test after all");
	}
}
