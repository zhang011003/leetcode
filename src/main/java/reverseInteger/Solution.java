package reverseInteger;

public class Solution {
    public int reverse(int x) {
    	int result = 0;
    	int quotient = x;
    	int remainder = 0;
    	do {
    		remainder = quotient % 10;
    		quotient = quotient / 10;
    		if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
				return -1;
			}
    		result = result * 10 + remainder;
    	} while (quotient != 0);
        return result;
    }
}