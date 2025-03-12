package LeetCode.Cheapest_Flights_Within_K_Stops;

import java.util.Arrays;

public class BellmanFord {

	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
		int[] nodeCosts = new int[n];
		Arrays.fill(nodeCosts, Integer.MAX_VALUE);
		nodeCosts[src] = 0;

		for (int i = 0; i <= k; i++) {
			int[] nextNodeCosts = Arrays.copyOf(nodeCosts, n);
			for (int[] flight : flights) {
				int startNode = flight[0];
				int nextNode = flight[1];
				int weight = flight[2];
				if (nodeCosts[startNode] != Integer.MAX_VALUE
					&& nodeCosts[startNode] + weight < nextNodeCosts[nextNode]) {
					nextNodeCosts[nextNode] = nodeCosts[startNode] + weight;
				}
			}
			nodeCosts = nextNodeCosts;
		}
		return nodeCosts[dst] != Integer.MAX_VALUE ? nodeCosts[dst] : -1;
	}
}
