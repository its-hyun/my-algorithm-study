package LeetCode.Number_of_Provinces;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected[0].length;
        int ans = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans++;
                bfs(isConnected, visited, i);
            }
        }

        return ans;
    }

    private void bfs(int[][] isConnected, boolean[] visited, int currentCity) {
        Queue<Integer> queue = new LinkedList();
        queue.offer(currentCity);
        visited[currentCity] = true;

        while (!queue.isEmpty()) {
            int city = queue.poll();

            for (int i = 0; i < isConnected.length; i++) {
                if (isConnected[city][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}
