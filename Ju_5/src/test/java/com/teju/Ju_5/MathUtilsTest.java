package com.teju.Ju_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;



/*@Tag
* Tags are used to filter which tests are executed for a given test plan.
* a development team may tag tests with values and then supply a list of tags
* to be included in or excluded from the current test plan.
* */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	
	
	
	TestInfo testInfo;
	TestReporter testReporter;
	
	
	/*public MathUtilsTest()
	{
		System.out.println("instance");
	}
	
	*/

	/*@BeforeEach
	void beforeEach() {
		System.out.println("executes before each test case");
	}

	@AfterEach
	void afterEach() {
		System.out.println("executes after each test case");
	}

	@BeforeAll
	 void beforeAll() {
		System.out.println("executes once before all test case");
	}

	@AfterAll
	 void afterAll() {
		System.out.println("executes once after all test cases");
	}
*/
	@Tag("Math add")
	@Nested
	@DisplayName("ADDITION")
	class AddTest{
		
		
		
		/**
		 * @EnabledOnOs is used to signal that the annotated test class or test method 
		 * is only enabled on one or more specified operating systems. 
		 * 
		 * @DisplayName is used to declare a custom display name for the annotated test class or test method.
		 */
		
		@Test
		@DisplayName("Adding two posuitive numbers")   
		void testAdd1() {
			//System.out.println("Adding two positive numbers");
			MathUtils m = new MathUtils();
			assertEquals(4, m.add(2, 2), "should return 4");
		}
		
		@RepeatedTest(4)   // to repeat how many times we want
		@DisplayName("Adding two Negative numbers")   
		void testAdd2( RepetitionInfo repetitionInfo ) {
			repetitionInfo.getTotalRepetitions();
			repetitionInfo.getCurrentRepetition();
			//System.out.println("Adding two Negative numbers");
			MathUtils m = new MathUtils();
			assertEquals(-3, m.add(-2, -1), "should return -3");
		}

		
		@Test 
		@DisplayName("Adding Positive Negative number")   
		void testAdd3() {
			//System.out.println("Adding Positive Negative number");
			MathUtils m = new MathUtils();
			assertEquals(1, m.add(2, -1), "should return 1");
		}

		
		
		
	}
	
	
	
	
	/**
	 * @EnabledOnOs is used to signal that the annotated test class or test method 
	 * is only enabled on one or more specified operating systems. 
	 * 
	 * @DisplayName is used to declare a custom display name for the annotated test class or test method.
	 */
	
	@Test
	@Tag("Math")
	/*@EnabledOnOs(OS.LINUX)*/
	@DisplayName("Adding two  numbers")   
	void testAdd() {
		//System.out.println("add");
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
		MathUtils m = new MathUtils();
		assertEquals(4, m.add(2, 2), "should return 4");
	}
	
	
	
	
	
	
	/*@Test
	@Disabled   //@Disable annotation used to not to execute this test case
	@DisplayName("Multiplying two numbers")
	void testMul() {
		System.out.println("multiplication");
		MathUtils m = new MathUtils();
		assertEquals(8, m.mul(4, 2), "should return 8");
	}*/
	
	
	/**
	 * @assertAll
	 * 
	 */

	@Test
	@Tag("Math mul")
	@DisplayName("Multiply methods")
	void testMul() {
		System.out.println("multiplication");
		MathUtils m = new MathUtils();
		assertAll(
				()->assertEquals(8, m.mul(4, 2), "should return 8"),
				()->assertEquals(6, m.mul(3, 2), "should return 6"),
				()->assertEquals(5, m.mul(1, 5), "should return 5"),
				()->assertEquals(16, m.mul(8, 2), "should return 16")
				
				
				);
	}
	
	
	
	
	/**
	 * @DisabledOnOs is used to signal that the annotated test class or test method
	 * is disabled on one or more specified operating systems.
	 */
	@Test
	@Tag("Math div")
	/*@DisabledOnOs(OS.LINUX)*/
	@DisplayName("Dividing two numbers")
	void testDiv() {
		System.out.println("divide");
		MathUtils m = new MathUtils();
		// assertEquals(2, m.divide(4,2),"should return 2");
		// assertEquals(3, m.divide(4,2),"should return 2");// prints the failure
		// message "should return 2"
		assertThrows(ArithmeticException.class, () -> m.divide(1, 0), "divide by 0 throws arithematic expression");
	}


}
