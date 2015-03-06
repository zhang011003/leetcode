package threeSumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] num, int target) {
    	Arrays.sort(num);
    	int sum = 0;
    	int closestSum = Integer.MAX_VALUE;
    	int begin;
    	int end = num.length - 1;
        for (int i = 0; i < num.length - 2; i++) {
        	begin = i + 1;
        	while (begin < end) {
        		sum = num[i] + num[begin] + num[end];
        		if (sum == 0) {
					return sum;
				}
        		if (Math.abs(sum) < closestSum) {
        			closestSum = sum;
        		}
        		
        		begin++;
			}
			
		}
    	return sum;
    }
}