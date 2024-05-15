package LeetCode.Number_of_Provinces;

public class DFS {

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] visited = new boolean[n];

        int ans = 0;
        for (int i = 0; i < n; i++) { // i == 도시
            if (!visited[i]) {
                ans++;
                visitCity(isConnected, visited, i);
            }
        }

        return ans;
    }

    private void visitCity(int[][] isConnected, boolean[] visited, int currentCity) {

        if (visited[currentCity]) {
            return;
        }

        visited[currentCity] = true;
        for (int i = 0; i < visited.length; i++) {
            if (isConnected[currentCity][i] == 1) {
                visitCity(isConnected, visited, i);
            }
        }
    }
}
