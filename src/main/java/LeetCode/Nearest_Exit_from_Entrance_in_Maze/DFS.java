package LeetCode.Nearest_Exit_from_Entrance_in_Maze;

// Time Limit Exceeded...
public class DFS {
	public int nearestExit(char[][] maze, int[] entrance) {
		int m = maze.length;
		int n = maze[0].length;
		boolean[][] visited = new boolean[m][n];

		return dfs(maze, entrance, entrance[0], entrance[1], visited);
	}

	private int dfs(char[][] maze, int[] entrance, int i, int j, boolean[][] visited) {
		if (i < 0 || i >= maze.length || j < 0 || j >= maze[0].length || maze[i][j] == '+')
			return -1;

		if ((i == 0 || i == maze.length - 1 || j == 0 || j == maze[0].length - 1) && (i != entrance[0]
			|| j != entrance[1]))
			return 0;

		if (visited[i][j])
			return -1;

		visited[i][j] = true;

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		int minSteps = Integer.MAX_VALUE;

		for (int k = 0; k < 4; k++) {
			int ni = i + dx[k];
			int nj = j + dy[k];
			int steps = dfs(maze, entrance, ni, nj, visited);
			if (steps >= 0)
				minSteps = Math.min(minSteps, steps + 1);
		}

		visited[i][j] = false;

		return minSteps == Integer.MAX_VALUE ? -1 : minSteps;
	}
}
