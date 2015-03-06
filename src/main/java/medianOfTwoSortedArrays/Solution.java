package medianOfTwoSortedArrays;

public class Solution {
	/**
	 * 对于一组有限个数的数据来说，它们的中位数是这样的一种数：这群数据里的一半的数据比它大，而另外一半数据比它小。
	 * 计算有限个数的数据的中位数的方法是：把所有的同类数据按照大小的顺序排列
	 * 。如果数据的个数是奇数，则中间那个数据就是这群数据的中位数；如果数据的个数是偶数，则中间那2个数据的算术平均值就是这群数据的中位数。
	 * 运行的时间复杂度O(log (m+n))
	 * @param a
	 * @param b
	 * @return
	 */
	public double findMedianSortedArrays(int a[], int b[]) {
//		int middleIndex = (a.length + b.length) / 2;
//		boolean even = (a.length + b.length) % 2 == 0;
//		double median;
//		// 是否a数组都大于b数组
//		if (a[0] >= b[b.length - 1]) {
//			if (even) {
//				if (a.length > b.length) {
//					median = (a[middleIndex] + a[middleIndex + 1])/2;
//				} else if (a.length < b.length) {
//					median = (b[middleIndex] + b[middleIndex + 1])/2;
//				} else {
//					median = (a[a.length - 1] + b[0]) / 2;
//				}
//			}
//		} else if (a[a.length - 1] < b[0]) {
//			
//		} else {
//			
//		}
		return 0;
	}
}