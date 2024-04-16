package LeetCode.Kth_Largest_Element_in_an_Array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
		int ans = 0;

		for (int num : nums) {
			priorityQueue.offer(num);
		}

		for (int i = 0; i < k; i++) {
			int num = priorityQueue.poll();
			if (i == k - 1) {
				ans = num;
			}
		}
		return ans;
	}
}
