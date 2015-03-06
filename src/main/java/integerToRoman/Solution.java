package integerToRoman;

/**
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * @author zhang011003
 *
 */
public class Solution {
    public String intToRoman(int num) {
    	String[] romanChar = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    	int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
        	if (num < nums[i]) {
				continue;
			}
        	if (i % 4 == 0) {
        		while (num >= nums[i]) {
        			num = num - nums[i];
        			sBuilder.append(romanChar[i]);
        		}
			} else {
				sBuilder.append(romanChar[i]);
				num = num - nums[i];
			}
		}
    	return sBuilder.toString();
    }
}