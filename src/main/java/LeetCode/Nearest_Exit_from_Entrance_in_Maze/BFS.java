package LeetCode.Nearest_Exit_from_Entrance_in_Maze;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public int nearestExit(char[][] maze, int[] entrance) {
		int m = maze.length;
		int n = maze[0].length;

		Queue<int[]> queue = new LinkedList<>();
		queue.offer(entrance);
		maze[entrance[0]][entrance[1]] = '+';

		int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
		int distance = 0;

		while (!queue.isEmpty()) {
			distance += 1;

			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] current = queue.poll();

				for (int[] direction : directions) {
					int x = current[0] + direction[0];
					int y = current[1] + direction[1];

					if (x < 0 || x >= m || y < 0 || y >= n) {
						continue;
					}

					if (maze[x][y] == '+') {
						continue;
					}

					if (x == 0 || x == m - 1 || y == 0 || y == n - 1) {
						return distance;
					}

					maze[x][y] = '+';
					queue.offer(new int[] {x, y});
				}
			}
		}
		return -1;
	}

}
