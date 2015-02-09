package twoSum;

import static org.junit.Assert.*;

import org.junit.Test;

import twoSum.Solution;

public class SolutionTest {

	@Test
	public void testTwoSum() {
		Solution sol = new Solution();
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		int[] index = sol.twoSum(numbers, target);
		assertEquals(1, index[0]);
		assertEquals(2, index[1]);
		numbers = new int[]{2, 7, -11, 15};
		target = -4;
		index = sol.twoSum(numbers, target);
		assertEquals(3, index[0]);
		assertEquals(2, index[1]);
	}

}
