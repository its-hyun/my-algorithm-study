package LeetCode.Longest_Increasing_Subsequence;

import java.util.Arrays;

public class DP {
	public int lengthOfLIS(int[] nums) {
		int[][] memo = new int[nums.length][nums.length + 1];
		for (int[] arr : memo) {
			Arrays.fill(arr, -1);
		}
		return getLengthOfLIS(nums, 0, -1, memo);
	}

	private int getLengthOfLIS(int[] nums, int currentIndex, int prevIndex, int[][] memo) {
		if (currentIndex == nums.length) {
			return 0;
		}

		if (memo[currentIndex][prevIndex + 1] != -1) {
			return memo[currentIndex][prevIndex + 1];
		}

		int include = 0;
		if (prevIndex == -1 || nums[currentIndex] > nums[prevIndex]) {
			include = 1 + getLengthOfLIS(nums, currentIndex + 1, currentIndex, memo);
		}

		int exclude = getLengthOfLIS(nums, currentIndex + 1, prevIndex, memo);

		return memo[currentIndex][prevIndex + 1] = Math.max(include, exclude);
	}
}
