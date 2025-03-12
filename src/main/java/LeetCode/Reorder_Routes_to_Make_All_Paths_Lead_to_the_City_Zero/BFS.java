package LeetCode.Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero;

import java.util.*;

class BFS {
    /**
     * 트리의 구조적 특징
     * 1. 사이클이 없다.
     * 2. 모든 노드가 직간접적으로 루트노트와 연결되어있다.
     */
    int count = 0;

    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<List<Integer>>> adj = new HashMap<>();
        for (int[] connection : connections) {
            adj.computeIfAbsent(connection[0], k -> new ArrayList<List<Integer>>()).add(
                    Arrays.asList(connection[1], 1));
            adj.computeIfAbsent(connection[1], k -> new ArrayList<List<Integer>>()).add(
                    Arrays.asList(connection[0], 0));
        }
        bfs(0, n, adj);
        return count;
    }

    public void bfs(int current, int n, Map<Integer, List<List<Integer>>> adj) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[n];
        q.offer(current);
        visit[current] = true;

        while (!q.isEmpty()) {
            current = q.poll();
            if (!adj.containsKey(current)) {
                continue;
            }
            for (List<Integer> nei : adj.get(current)) {
                int neighbor = nei.get(0);
                int sign = nei.get(1);
                if (!visit[neighbor]) {
                    count += sign;
                    visit[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }
    }
}
