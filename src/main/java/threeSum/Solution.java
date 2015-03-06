package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
    	List<Integer> integerList;
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        int j = num.length - 1;
        for (int index = 0; index < num.length - 2; index++) {
        	int i = index + 1;
			while (i < j) {
				int sum = num[i] + num[j] + num[index];
				if (sum > 0) {
					j--;
					// 如果当前数与上一个数相同，则跳过
					while(num[j] == num[j + 1] && j > i) {
						j--;
					}
				} else if (sum < 0) {
					i++;
					// 如果当前数与上一个数相同，则跳过
					while(num[i] == num[i - 1] && i < j) {
						i++;
					}
				} else {
					integerList = new ArrayList<Integer>();
					integerList.add(num[index]);
					integerList.add(num[i]);
					integerList.add(num[j]);
					result.add(integerList);
					break;
				}
			}
        	
		}
       
        return result;
    }
}