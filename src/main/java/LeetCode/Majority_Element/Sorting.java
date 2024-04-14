package LeetCode.Majority_Element;

import java.util.Arrays;

public class Sorting {

	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		return nums[n / 2];
	}
}
