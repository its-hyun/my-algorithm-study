package LeetCode.Climbing_Stairs;

import java.util.Arrays;

public class Memoization {
	public int climbStairs(int n) {
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		memo[1] = 1;
		return climb(n, memo);
	}

	private int climb(int n, int[] memo) {
		if (n == 0) {
			return 1;
		}

		if (memo[n] != -1) {
			return memo[n];
		}

		int count = 0;

		if (n - 1 >= 0) {
			count += climb(n - 1, memo);
		}

		if (n - 2 >= 0) {
			count += climb(n - 2, memo);
		}

		return memo[n] = count;
	}
}
