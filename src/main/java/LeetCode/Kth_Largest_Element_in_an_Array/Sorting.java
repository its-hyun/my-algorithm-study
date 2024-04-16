package LeetCode.Kth_Largest_Element_in_an_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {

	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
}
