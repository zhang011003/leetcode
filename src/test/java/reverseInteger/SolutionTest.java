package reverseInteger;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(321, solution.reverse(123));
		assertEquals(1, solution.reverse(10000));
		assertEquals(-1, solution.reverse(1000000003));
	}

}
