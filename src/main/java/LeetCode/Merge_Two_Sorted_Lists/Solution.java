package LeetCode.Merge_Two_Sorted_Lists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		ListNode result = new ListNode();
		ListNode temp = result;
		while (list1 != null && list2 != null) {
			if (list1.val > list2.val) {
				temp.next = list2;
				list2 = list2.next;
			} else {
				temp.next = list1;
				list1 = list1.next;
			}
			temp = temp.next;
		}

		if (list1 == null) {
			temp.next = list2;
		} else {
			temp.next = list1;
		}

		return result.next;
	}
}