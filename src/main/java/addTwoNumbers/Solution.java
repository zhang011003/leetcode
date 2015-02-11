package addTwoNumbers;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode firstNode = null;
		while (l1 != null && l2 != null) {
			if (result.next == null) {
				result.next = new ListNode(0);
				if (firstNode == null) {
					firstNode = result.next;
				}
			}
			result = result.next;
			result.val = l1.val + l2.val + result.val;
			if (result.val >= 10) {
				result.val = result.val - 10;
				result.next = new ListNode(1);
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			if (result.next == null) {
				result.next = new ListNode(0);
			}
			result = result.next;
			result.val = l1.val + result.val;
			l1 = l1.next;
		}
		while (l2 != null) {
			if (result.next == null) {
				result.next = new ListNode(0);
			}
			result = result.next;
			result.val = l2.val + result.val;
			l2 = l2.next;
		}
		return firstNode;
	}
}