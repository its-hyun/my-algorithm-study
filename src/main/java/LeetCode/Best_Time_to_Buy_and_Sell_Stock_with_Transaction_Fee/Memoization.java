package LeetCode.Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee;

import java.util.Arrays;

public class Memoization {
	public int maxProfit(int[] prices, int fee) {
		int n = prices.length;
		int[][] memo = new int[n][2];

		for (int[] arr : memo) {
			Arrays.fill(arr, -1);
		}

		return getMaxProfit(memo, prices, fee, 0, -1);
	}

	private int getMaxProfit(int[][] memo, int[] prices, int fee, int i, int holding) {

		if (i == prices.length)
			return 0;

		if (memo[i][holding] != -1)
			return memo[i][holding];

		int maxProfit = getMaxProfit(memo, prices, fee, holding, i + 1);

		if (holding == 0) {
			maxProfit = Math.max(maxProfit, getMaxProfit(memo, prices, fee, 1, i + 1) - prices[i]);
		} else {
			maxProfit = Math.max(maxProfit, getMaxProfit(memo, prices, fee, 0, i + 1) + prices[i] - fee);
		}
		return memo[i][holding] = maxProfit;
	}
}
