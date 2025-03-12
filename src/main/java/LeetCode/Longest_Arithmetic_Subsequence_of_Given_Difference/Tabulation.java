package LeetCode.Longest_Arithmetic_Subsequence_of_Given_Difference;

public class Tabulation {
	public int longestSubsequence(int[] arr, int difference) {
		int offset = 10000;
		int[] dp = new int[2 * offset + 1];
		int res = 1;

		for (int num : arr) {
			int index = num + offset;
			int prevIndex = num - difference + offset;
			if (prevIndex >= 0 && prevIndex < dp.length) {
				dp[index] = dp[prevIndex] + 1;
			} else {
				dp[index] = 1;
			}
			res = Math.max(res, dp[index]);
		}

		return res;
	}
}
