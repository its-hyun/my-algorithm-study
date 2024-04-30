package LeetCode.Coin_Change_II;

import java.util.Arrays;

public class Recursion {
	public int change(int amount, int[] coins) {
		return calculateChange(amount, coins, coins.length - 1);
	}

	private int calculateChange(int amount, int[] coins, int currentIndex) {
		if (currentIndex == -1) {
			if (amount == 0) {
				return 1;
			}
			return 0;
		}

		int include = 0;
		if (coins[currentIndex] <= amount) {
			include = calculateChange(amount - coins[currentIndex], coins, currentIndex);
		}

		int exclude = calculateChange(amount, coins, currentIndex - 1);

		return include + exclude;
	}
}
