package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		assertEquals(1, FactorialNoBaseCase.factorial(0));
		assertEquals(1, FactorialNoBaseCase.factorial(1));
		assertEquals(6, FactorialNoBaseCase.factorial(3));
	}
}
