package org.tnsif.testcase;

 
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class TestCaseMethod {

	@AfterEach
	public void testAfterEach() {
		System.out.println("Test after each");
	}
	@AfterAll
	public void testAfterAll() {
		System.out.println("Test after all");
	}
	@BeforeEach
	public void testBeforeEach() {
		System.out.println("Test before each");
	}
	@BeforeAll
	public void testBeforeAll() {
		System.out.println("Test before all");
	}
	
	
	
}
