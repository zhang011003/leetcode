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
	 * 递归方式解决。
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
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append(s.charAt(mid));
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
	
	/**
	 * 非递归方式解决。
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring2(String s) {
		int length = 0;
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int index = sBuilder.indexOf(s.charAt(i) + "");
			if (index >= 0) {
				if (length < sBuilder.length()) {
					length = sBuilder.length();
				}
				//包含有下一个字符时，需要删除从开始位置到下一个字符位置之间的内容
				sBuilder.delete(0, index + 1);
			}
			sBuilder.append(s.charAt(i));
		}
		if (length < sBuilder.length()) {
			length = sBuilder.length();
		}
		return length;
	}
}