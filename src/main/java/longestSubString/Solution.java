package longestSubString;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters for
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 * 
 * @author Administrator
 *
 */
public class Solution {
	
	/**
	 * 将指定字符串从中间分隔，则最长的字符串或者在指定字符串左侧， 或者在指定字符串右侧，或者部分在左侧，部分在右侧
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 1) {
			return 1;
		} else {
			int mid = s.length() / 2;
			int lengthLeft = lengthOfLongestSubstring(s.substring(0, mid));
			StringBuilder sBuilder = new StringBuilder(s.charAt(mid));
			for (int i = mid - 1; i >= 0; i--) {
				if (sBuilder.indexOf(s.charAt(i) + "") < 0) {
					sBuilder.append(s.charAt(i));
				} else {
					break;
				}
			}
			for (int i = mid + 1; i < s.length(); i++) {
				if (sBuilder.indexOf(s.charAt(i) + "") < 0) {
					sBuilder.append(s.charAt(i));
				} else {
					break;
				}
			}
			int lengthMid = sBuilder.length();
			int lengthRight = lengthOfLongestSubstring(s.substring(mid));
			int length = lengthLeft;
			if (lengthLeft < lengthMid) {
				length = lengthMid;
			} else if (lengthLeft < lengthRight) {
				length = lengthRight;
			}
			return length;
		}
	}
}