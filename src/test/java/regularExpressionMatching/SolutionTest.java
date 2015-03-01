package regularExpressionMatching;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertFalse(solution.isMatch("aa","a"));
		assertTrue(solution.isMatch("aa","aa"));
		assertFalse(solution.isMatch("aaa","aa"));
		assertTrue(solution.isMatch("aa", "a*"));
		assertTrue(solution.isMatch("aa", ".*"));
		assertTrue(solution.isMatch("ab", ".*"));
		assertTrue(solution.isMatch("aab", "c*a*b"));
		assertFalse(solution.isMatch("adb", "c*.b"));
	}

}
