package twoSum;


/**
  * Given an array of integers, find two numbers such that they add up to a specific target number.
  * 
  * The function twoSum should return indices of the two numbers such that they add up to the target, 
  * where index1 must be less than index2. 
  * Please note that your returned answers (both index1 and index2) are not zero-based.
  * 
  * You may assume that each input would have exactly one solution.
  * 
  * Input: numbers={2, 7, 11, 15}, target=9
  * Output: index1=1, index2=2
 *
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int[] index = new int[2];
        for (int i = 0; i < numbers.length; i++) {
			int diff = target - numbers[i];
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] == diff) {
					if (numbers[i] > numbers[j]) {
						index[0] = j + 1;
						index[1] = i + 1;
					} else {
						index[0] = i + 1;
						index[1] = j + 1;
					}
					return index;
				}
			}
		}
        return index;
    }
}