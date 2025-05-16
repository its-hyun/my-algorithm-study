package LeetCode.Palindrome_Linked_List;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public boolean isPalindrome(ListNode head) {
		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}

		int left = 0;
		int right = list.size() - 1;
		while (left < right && list.get(left).equals(list.get(right))) {
			left++;
			right--;
		}
		return left >= right;
	}
}