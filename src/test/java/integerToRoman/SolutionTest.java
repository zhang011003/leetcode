package integerToRoman;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals("MCDXXXVII", solution.intToRoman(1437));
		assertEquals("MMMCCCXXXIII", solution.intToRoman(3333));
		assertEquals("CII", solution.intToRoman(102));
		assertEquals("VIII", solution.intToRoman(8));
	}

}
