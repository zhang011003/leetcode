package longestPalindromicSubstring;


/**
 * Given a string S, find the longest palindromic substring in S. 
 * You may assume that the maximum length of S is 1000,
 * and there exists one unique longest palindromic substring.
 * @author zhang011003
 *
 */
public class Solution {
	
    public String longestPalindrome(String s) {
    	int begin = -1;
    	int length = -1;
    	int maxBegin = 0;
    	int maxLength = 0;
    	boolean allSame = true;
    	for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(0)) {
				allSame = false;
				break;
			}
		}
    	// 全部相同，则直接返回
    	if (allSame) {
			return s;
		} else {
			for (int i = 1; i < s.length(); i++) {
				if (i == 1) {
					if (s.charAt(i) == s.charAt(0)) {
						maxBegin = 0;
						maxLength = 2;
					}
				} else {
					if (begin > 0) {
						if (s.charAt(i) == s.charAt(begin - 1)) {
							begin = begin - 1;
							length = length + 2;
						}
					}
					else if (s.charAt(i) == s.charAt(i - 1)) {
						begin = i - 1;
						length = 2;
					} else if (s.charAt(i) == s.charAt(i - 2)) {
						begin = i - 2;
						length = 3;
					} 
					
					if (length > maxLength) {
						maxBegin = begin;
						maxLength = length;
					}
				}
			}
		}
        return s.substring(maxBegin, maxBegin + maxLength);
    }
}