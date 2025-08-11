package com.example.UnitTestApplication.UnitTestsApplication;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UnitTestsApplicationTests {

	
	// automatically generated test method using JUnit
	@Test
	void testAddition() {
		// Logic
		int result = 5+2;
		
		// Assertion
		assertEquals(7, result); // assertEquals(expected_result, actual_result);
		// assertEquals is used to check if the expected value is equal to the actual value
		// This is positive test case, meaning the expected value is equal to the actual value
		
		/*
		assertNotEquals(10, result); // assertNotEquals(expected_result, actual_result);
		// This is negative test case, meaning the expected value is not equal to the actual value
		 */
	}

}
