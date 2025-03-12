package LeetCode.Cheapest_Flights_Within_K_Stops;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DFS {

	public static void main(String[] args) {
		int n = 4; // 공항 갯수
		int[][] flights = {
			{0, 1, 100},
			{1, 2, 100},
			{2, 0, 100},
			{1, 3, 600},
			{2, 3, 200}
		}; // {출발, 도착, 가격}
		int src = 0; // 시작 공항
		int dst = 3; // 목적 공항
		int k = 1; // 최대로 경유할 수 있는 공항 갯수

		DFS dfs = new DFS();
		System.out.println(dfs.findCheapestPrice(n, flights, src, dst, k));
		// expected = 700
	}

	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
		Map<String, Integer> memo = new HashMap<>();
		int ans = dfs(flights, k, dst, src, memo);
		return ans == Integer.MAX_VALUE ? -1 : ans;
	}

	private int dfs(int[][] flights, int k, int dst, int i, Map<String, Integer> memo) {

		if (i == dst) {
			return 0;
		}

		if (k < 0) {
			return Integer.MAX_VALUE;
		}

		String key = i + "," + k;
		if (memo.containsKey(key)) {
			return memo.get(key);
		}

		int minPrice = Integer.MAX_VALUE;
		for (int[] flight : flights) {
			if (flight[0] == i) {
				System.out.println(Arrays.toString(flight));
				int nextPrice = dfs(flights, k - 1, dst, flight[1], memo);
				if (nextPrice != Integer.MAX_VALUE) {
					minPrice = Math.min(minPrice, flight[2] + nextPrice);
				}
			}
		}

		memo.put(key, minPrice);
		return minPrice;
	}
}
