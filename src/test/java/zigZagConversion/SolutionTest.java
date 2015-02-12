package zigZagConversion;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		Solution solution = new Solution();
		String convert = solution.convert("PAYPALISHIRING", 3);
		assertEquals("PAHNAPLSIIGYIR", convert);
	}

}
