package LeetCode.Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero;

import java.util.*;

class DFS {

    private int count = 0;

    public int minReorder(int n, int[][] connections) {

        Map<Integer, List<List<Integer>>> adj = new HashMap<>();
        for (int[] connection : connections) {
            adj.computeIfAbsent(connection[0], k -> new ArrayList<List<Integer>>()).add(
                    Arrays.asList(connection[1], 1));
            adj.computeIfAbsent(connection[1], k -> new ArrayList<List<Integer>>()).add(
                    Arrays.asList(connection[0], 0));
        }
        dfs(0, -1, adj);
        return count;
    }

    private void dfs(int current, int parent, Map<Integer, List<List<Integer>>> adj) {
        if (!adj.containsKey(current)) {
            return;
        }

        for (List<Integer> n : adj.get(current)) {
            int neighbor = n.get(0);
            int sign = n.get(1);
            if (neighbor != parent) {
                count += sign;
                dfs(neighbor, current, adj);
            }
        }
    }
}
