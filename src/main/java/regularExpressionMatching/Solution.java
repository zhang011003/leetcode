package regularExpressionMatching;

public class Solution {
    public boolean isMatch(String s, String p) {
    	boolean asterisk = false;
    	boolean dot = false;
    	boolean match = true;
    	int nextMatchIndex = 0;
    	for (int j = 0; j < s.length(); j++) {
    		if (nextMatchIndex >= p.length()) {
				match = false;
				break;
			}
	    	for (int i = nextMatchIndex; i < p.length(); i++) {
	    		if (p.charAt(i) == '*') {
	    			continue;
	    		} else if ((i + 1) < p.length() && p.charAt(i + 1) == '*') {
	    			asterisk = true;
	    		} 
	    		if (p.charAt(i) == '.') {
					dot = true;
				}
	    		
	    		// 不匹配时，如果非点非星，则直接退出，否则继续匹配下一个字符
	    		if (s.charAt(j) != p.charAt(i)) {
	    			if (!dot && !asterisk) {
    					match = false;
    					break;
					}
	    			nextMatchIndex = i + 1;
	    		} else {
	    			// 如果为星，下次从当前位置继续匹配，否则从下一个位置继续匹配
	    			if (asterisk) {
		    			nextMatchIndex = i;
					} else {
						nextMatchIndex = i + 1;
					}
	    			break;
	    		}
	    	}
	    	
	    	if (!match) {
				break;
			}
		}
        return match;
    }
}