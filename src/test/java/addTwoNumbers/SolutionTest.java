package addTwoNumbers;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import addTwoNumbers.Solution.ListNode;

public class SolutionTest {

	@Test
	public void test() {
		List<Object[]> list = Arrays.asList(new Object[][] { 
        		{ "7->0->8", new int[]{2,4,3}, new int[]{5,6,4}}, 
        		{ "1->3->5", new int[]{6,6}, new int[]{5,6,4}}
        });
		for (Object[] value : list) {
			String expected = (String) value[0];
			int[] value1 = (int[]) value[1];
			int[] value2 = (int[]) value[2];
			ListNode l1 = new ListNode(value1[0]);
			ListNode first1 = l1;
			for (int i = 1; i < value1.length; i++) {
				l1.next = new ListNode(value1[i]);
				l1 = l1.next;
			}
			ListNode l2 = new ListNode(value2[0]);
			ListNode first2 = l2;
			for (int i = 1; i < value2.length; i++) {
				l2.next = new ListNode(value2[i]);
				l2 = l2.next;
			}
			
			Solution solution = new Solution();
			ListNode result = solution.addTwoNumbers(first1, first2);
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append(result.val);
			while (result.next != null) {
				sBuilder.append("->");
				result = result.next;
				sBuilder.append(result.val);
			}
			assertEquals(expected, sBuilder.toString());
		}
	}

}
