package threeSum;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		Solution solution = new Solution();
		int[] num = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> result = solution.threeSum(num);
		assertEquals("[-1, -1, 2]", result.get(0).toString());
		assertEquals("[-1, 0, 1]", result.get(1).toString());
	}

}
