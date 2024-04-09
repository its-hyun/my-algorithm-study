package LeetCode.Min_Cost_Climbing_Stairs;

public class Tabulation {
	public int minCostClimbingStairs(int[] cost) {
		int[] dp = new int[cost.length + 1];
		dp[0] = 0;
		dp[1] = 0;

		for (int i = 2; i < dp.length; i++) {
			dp[i] = (dp[i - 1] + cost[i - 1] > dp[i - 2] + cost[i - 2]) ? dp[i - 2] + cost[i - 2] : dp[i - 1] + cost[i - 1];
		}

		return dp[cost.length];
	}
}
