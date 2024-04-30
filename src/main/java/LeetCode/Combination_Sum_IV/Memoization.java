package LeetCode.Combination_Sum_IV;

import java.util.Arrays;

public class Memoization {

	public int combinationSum4(int[] nums, int target) {
		int[] memo = new int[target + 1];
		Arrays.fill(memo, -1);
		return combinationSum(nums, target, memo);
	}

	private int combinationSum(int[] nums, int target, int[] memo) {
		if (target == 0) {
			return 1;
		}

		if (memo[target] != -1) {
			return memo[target];
		}

		int result = 0;
		for (int num : nums) {
			if (num <= target) {
				result += combinationSum(nums, target - num, memo);
			}
		}

		return memo[target] = result;
	}
}
