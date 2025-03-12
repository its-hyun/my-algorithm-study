package LeetCode.Cheapest_Flights_Within_K_Stops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

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

		BFS bfs = new BFS();
		System.out.println(bfs.findCheapestPrice(n, flights, src, dst, k));
		// expected = 700
	}

	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
		List<List<int[]>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++)
			adj.add(new ArrayList<>());
		for (int[] flight : flights) {
			adj.get(flight[0]).add(new int[] {flight[1], flight[2]});
		}
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {src, 0});
		int[] minCost = new int[n];
		Arrays.fill(minCost, Integer.MAX_VALUE);
		int stops = 0;
		while (!q.isEmpty() && stops <= k) {
			int size = q.size();
			while (size-- > 0) {
				int[] curr = q.poll();
				for (int[] neighbour : adj.get(curr[0])) {
					int price = neighbour[1], neighbourNode = neighbour[0];
					if (price + curr[1] >= minCost[neighbourNode])
						continue;
					minCost[neighbourNode] = price + curr[1];
					q.offer(new int[] {neighbourNode, minCost[neighbourNode]});
				}
			}
			stops++;
		}
		return minCost[dst] == Integer.MAX_VALUE ? -1 : minCost[dst];
	}
}
