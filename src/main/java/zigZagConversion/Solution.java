package zigZagConversion;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * 
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * 
 * @author zhang011003
 *
 */
public class Solution {
    public String convert(String s, int nRows) {
    	StringBuilder sBuilder = new StringBuilder();
    	// 间隔
    	int interval = (nRows - 1) * 2;
    	int column = 0;
    	for (int i = 0; i < nRows; i++) {
    		int index = i + interval * column;
			while (s.length() > index) {
    			sBuilder.append(s.charAt(index));
    			if (i > 0) {
    				// 下一个索引
    				int nextIndex = index + interval - 2 * i;
    				if ((s.length() > nextIndex) && (nextIndex != index)) {
    					sBuilder.append(s.charAt(nextIndex));
    				} 
				}
    			column++;
    			index = i + interval * column;
    		}
    		column = 0;
		}
        return sBuilder.toString();
    }
}