package LeetCode.Longest_Arithmetic_Subsequence_of_Given_Difference;

import java.util.Arrays;

// TLE...
public class Memization {
	int[][] memo;

	public int longestSubsequence(int[] arr, int difference) {
		memo = new int[arr.length + 1][arr.length + 1];
		for (int[] i : memo) {
			Arrays.fill(i, -1);
		}
		return solve(0, arr, difference, -1);
	}

	public int solve(int i, int[] arr, int diff, int prev) {
		if (i >= arr.length) {
			return 0;
		}
		if (prev != -1 && memo[i][prev] != -1)
			return memo[i][prev];

		int exclude = solve(i + 1, arr, diff, prev);

		int include = 0;
		if (prev == -1 || arr[i] - arr[prev] == diff) {
			include = 1 + solve(i + 1, arr, diff, i);
		}

		if (prev != -1) {
			return memo[i][prev] = Math.max(include, exclude);
		}
		return Math.max(include, exclude);
	}
}
