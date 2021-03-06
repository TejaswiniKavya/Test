/**
 * 
 */
package JavaBrains._1_JUnit5Basics;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 * @author Tousif
 * 
 */

public class _10_RepeatedTestAnnotationTest {

	_1_MathUtils mathUtils;
	
	@BeforeEach
	void init() {
		mathUtils = new _1_MathUtils();
	}

	@Nested
	@DisplayName("addTest Methods")
	class AddTest {
		
		@RepeatedTest(3) //Number of times to repeat
		@DisplayName("Adding")
		void testAdd1() {
			
			int expected = 4;
			int actual = mathUtils.add(2, 2);
			assertEquals(expected, actual ,"Should return sum " + expected + " but returned " + actual);
		}
		
		@RepeatedTest(3)
		@DisplayName("Adding")
		void testAdd2( RepetitionInfo repetitionInfo ) { //RepetitionInfo Object
			
//			repetitionInfo.getTotalRepetitions()
//			repetitionInfo.getCurrentRepetition()
			
			int expected = 4;
			int actual = mathUtils.add(2, 2);
			assertEquals(expected, actual , () -> "Should return sum " + expected + " but returned " + actual);
		}
		
		@Test
		@DisplayName("Adding Positive")
		void testAddPositive() {
			assertEquals(2, mathUtils.add(1, 1),"Should return sum");
		}
		
		@Test
		@DisplayName("Adding Negative")
		void testAddNegative() {
			assertEquals(-2, mathUtils.add(-1, -1),"Should return sum");
		}
		
	}
	
	@Test
	@DisplayName("Multiply Method")
	void testMultiply() {
//		assertEquals(4, mathUtils.multiply(2, 2),"Should return product");
		
		assertAll(
				() -> assertEquals(4, mathUtils.multiply(2, 2),"Should return product"),
				() -> assertEquals(0, mathUtils.multiply(4, 0),"Should return product"),
				() -> assertEquals(-16, mathUtils.multiply(8, -2),"Should return product")
				);
	}
	
	@Test
	@DisabledOnOs(OS.WINDOWS)
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),"Divide by zero throws ArithmeticException");
	}
	
	
	@Test
	@EnabledOnOs(OS.LINUX)
	void testComputeCircleArea() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return circle area");
	}
	
}
