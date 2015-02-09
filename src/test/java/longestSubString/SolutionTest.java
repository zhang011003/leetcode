package longestSubString;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		Solution solution = new Solution();
		String s = "abcabcbb";
		assertEquals(3, solution.lengthOfLongestSubstring(s));
		s = "bbbbbbb";
		assertEquals(1, solution.lengthOfLongestSubstring(s));
		s = "bbabcdb";
		assertEquals(4, solution.lengthOfLongestSubstring(s));
		s = "abcdcbae";
		assertEquals(5, solution.lengthOfLongestSubstring(s));
	}
	
	@Test
	public void test2() {
		Solution solution = new Solution();
		String s = "abcabcbb";
		assertEquals(3, solution.lengthOfLongestSubstring2(s));
		s = "bbbbbbb";
		assertEquals(1, solution.lengthOfLongestSubstring2(s));
		s = "bbabcdb";
		assertEquals(4, solution.lengthOfLongestSubstring2(s));
		s = "abcdcbae";
		assertEquals(5, solution.lengthOfLongestSubstring2(s));
	}

}
