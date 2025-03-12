package LeetCode.Longest_Substring_Without_Repeating_Characters;

import java.util.Arrays;

public class DP {
	public int deleteAndEarn(int[] nums) {
		int[] arr = new int[10001];
		int[] memo = new int[10001];
		Arrays.fill(memo, -1);
		for (int num : nums) {
			arr[num]++;
		}
		return getMaximumPoint(arr, memo, 0);
	}

	private int getMaximumPoint(int[] arr, int[] memo, int i) {
		if (i >= 10001) {
			return 0;
		}

		if (memo[i] != -1) {
			return memo[i];
		}

		int include = (i * arr[i]) + getMaximumPoint(arr, memo, i + 2);
		int exclude = getMaximumPoint(arr, memo, i + 1);

		return memo[i] = Math.max(include, exclude);
	}
}
