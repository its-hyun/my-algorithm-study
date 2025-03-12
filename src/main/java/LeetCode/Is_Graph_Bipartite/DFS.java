package LeetCode.Is_Graph_Bipartite;

import java.util.Arrays;

public class DFS {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!dfs(graph, i, color)) return false; //dfs
            }
        }

        System.out.println(Arrays.toString(color));
        return true;
    }

    private boolean dfs(int[][] graph, int node, int[] color) {
        if (color[node] == -1) {
            color[node] = 1;
        }

        for (int it : graph[node]) {
            if (color[it] == -1) {
                color[it] = 1 - color[node];
                if (!dfs(graph, it, color)) return false;
            } else {
                if (color[it] == color[node]) return false;
            }
        }
        return true;
    }
}
