package LeetCode.Longest_Arithmetic_Subsequence_of_Given_Difference;

// TLE...
public class Recursion {
	public int longestSubsequence(int[] arr, int difference) {
		return recursion(0, arr, difference, Integer.MIN_VALUE);
	}

	public int recursion(int i, int[] arr, int diff, int prev) {
		if (i >= arr.length) {
			return 0;
		}

		int exclude = recursion(i + 1, arr, diff, prev);

		int include = 0;
		if (prev == Integer.MIN_VALUE || arr[i] - prev == diff) {
			include = 1 + recursion(i + 1, arr, diff, arr[i]);
		}
		return Math.max(include, exclude);
	}
}
