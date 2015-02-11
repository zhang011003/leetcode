package longestPalindromicSubstring;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		Solution solution = new Solution();
		
		String s = "abcdce";
		assertEquals("cdc", solution.longestPalindrome(s));
		
		s = "abbab";
		assertEquals("abba", solution.longestPalindrome(s));
		
		s = "bbbbbb";
		assertEquals("bbbbbb", solution.longestPalindrome(s));
		
		s = "abacdfgdcaba";
		assertEquals("aba", solution.longestPalindrome(s));
		
		// 这个测试用例，怎么编出来的啊！！！
		s = "321012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210123210012321001232100123210123";
		System.out.println(solution.longestPalindrome(s));
	}

}
