package LeetCode.Is_Graph_Bipartite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;
        int color[] = new int[n];
        Arrays.fill(color, -1);

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!bfs(graph, i, color)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean bfs(int[][] graph, int i, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        color[i] = 1;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            for (int it : graph[node]) {
                if (color[it] == -1) {
                    q.add(it);
                    color[it] = 1 - color[node];
                } else {
                    if (color[it] == color[node]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
