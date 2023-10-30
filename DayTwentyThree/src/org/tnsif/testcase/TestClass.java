package org.tnsif.testcase;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.tnsif.businesslogic.Operations;
public class TestClass {

	@Test
	public void testForNull() {
		assertNull(Operations.getName());
	}
	@Test
	public void testForNotNull() {
		assertNotNull(Operations.getName());
	}
	
	@Test
	public void testForException() {
		Assertions.assertThrows(ArithmeticException.class,() ->Operations.performDivision(2, 0));
	}
	@TestFactory
	public Collection<DynamicTest> performTestCase(){
		return Arrays.asList(dynamicTest("FirstDynamicTest",()->Assertions.assertTrue(10>2)),
				dynamicTest("SecondDynamicTest", ()->Assertions.assertEquals(5, Operations.add(3, 2))),
				dynamicTest("Throw Exception",  ()->new ArithmeticException())
				);
	}
	
}
