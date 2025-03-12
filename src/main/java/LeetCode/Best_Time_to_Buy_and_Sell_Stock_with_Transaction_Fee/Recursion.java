package LeetCode.Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee;

public class Recursion {

	public int maxProfit(int[] prices, int fee) {
		return getMaxProfit(prices, fee, 0, -1);
	}

	private int getMaxProfit(int[] prices, int fee, int i, int stock) {

		// 기저 조건
		if (i >= prices.length) {
			return 0;
		}

		int buyOrSell = 0;
		if (stock == -1) {
			// 매매
			buyOrSell = getMaxProfit(prices, fee, i + 1, prices[i]);
		} else {
			// 매각
			int benefit = prices[i] - stock - fee;
			buyOrSell = getMaxProfit(prices, fee, i + 1, -1) + benefit;
		}

		// 넘기기
		int pass = getMaxProfit(prices, fee, i + 1, stock);

		return Math.max(buyOrSell, pass);
	}
}
