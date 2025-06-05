package LeetCode.Network_Delay_Time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
	public static int networkDelayTime(int[][] times, int n, int k) {
		// 그래프를 인접 리스트로 생성
		Map<Integer, List<int[]>> graph = new HashMap<>();
		for (int[] edge : times) {
			int source = edge[0];
			int target = edge[1];
			int weight = edge[2];
			graph.putIfAbsent(source, new ArrayList<>());
			graph.get(source).add(new int[] {target, weight});
		}

		// 모든 노드에 도달하는 최소 시간을 저장하는 배열
		int[] minTimes = new int[n + 1];
		Arrays.fill(minTimes, Integer.MAX_VALUE);
		minTimes[k] = 0; // 시작 노드의 최소 시간은 0

		// 다익스트라 알고리즘을 사용하여 최소 시간 계산
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
		pq.offer(new int[] {k, 0});

		while (!pq.isEmpty()) {
			int[] node = pq.poll();
			int currentNode = node[0];
			int currentCost = node[1];

			if (currentCost > minTimes[currentNode]) {
				continue;
			}

			if (graph.containsKey(currentNode)) {
				for (int[] neighbor : graph.get(currentNode)) {
					int neighborNode = neighbor[0];
					int neighborCost = neighbor[1];
					int newCost = currentCost + neighborCost;
					if (newCost < minTimes[neighborNode]) {
						minTimes[neighborNode] = newCost;
						pq.offer(new int[] {neighborNode, newCost});
					}
				}
			}
		}

		// 최대 소요 시간 반환
		int maxTime = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			if (minTimes[i] == Integer.MAX_VALUE) {
				return -1; // 모든 노드에 도달할 수 없는 경우 -1 반환
			}
			maxTime = Math.max(maxTime, minTimes[i]);
		}
		return maxTime;
	}
}