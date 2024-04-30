package LeetCode.Coin_Change_II;

import java.util.Arrays;

public class Memoization {

	public int change(int amount, int[] coins) {
		int[][] memo = new int[coins.length][amount + 1];
		for (int[] arr : memo) {
			Arrays.fill(arr, -1);
		}
		return calculateChange(amount, coins, coins.length - 1, memo);
	}

	private int calculateChange(int amount, int[] coins, int currentIndex, int[][] memo) {
		if (amount == 0) {
			return 1;
		}
		if (amount < 0 || currentIndex < 0) {
			return 0;
		}

		if (memo[currentIndex][amount] != -1) {
			return memo[currentIndex][amount];
		}

		int include = 0;
		if (coins[currentIndex] <= amount) {
			include = calculateChange(amount - coins[currentIndex], coins, currentIndex, memo);
		}

		int exclude = calculateChange(amount, coins, currentIndex - 1, memo);

		return memo[currentIndex][amount] = include + exclude;
	}
}
