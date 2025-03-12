package Programmers.아이템_줍기;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) {
		int[][] rectangle = {
			{1, 1, 7, 4},
			{3, 2, 5, 5},
			{4, 3, 6, 9},
			{2, 6, 8, 8}
		};

		int characterX = 1;
		int characterY = 3;
		int itemX = 7;
		int itemY = 8;

		Solution solution = new Solution();
		System.out.println(solution.solution(rectangle, characterX, characterY, itemX, itemY));
	}

	public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {

		int[][] map = drawMap(rectangle);

		// bfs
		int[] yy = {-1, 1, 0, 0};
		int[] xx = {0, 0, -1, 1};

		Queue<Integer[]> queue = new LinkedList<>();
		queue.add(new Integer[] {characterY * 2, characterX * 2, 0});
		boolean[][] visited = new boolean[101][101];

		while (!queue.isEmpty()) {
			Integer[] current = queue.poll();
			int currentY = current[0];
			int currentX = current[1];
			int distance = current[2];

			if (currentY == itemY * 2 && currentX == itemX * 2) {
				return distance / 2;
			}

			for (int i = 0; i < 4; i++) {
				int nextY = currentY + yy[i];
				int nextX = currentX + xx[i];
				if (nextY < 0 || nextX < 0 || nextY >= map.length || nextX >= map[0].length) {
					continue;
				}

				if (visited[nextY][nextX] || map[nextY][nextX] != 2) {
					continue;
				}

				visited[nextY][nextX] = true;
				queue.add(new Integer[] {nextY, nextX, distance + 1});
			}
		}

		return 0;
	}

	private int[][] drawMap(int[][] rectangle) {
		int[][] map = new int[101][101];
		for (int[] terrain : rectangle) {
			int y1 = terrain[1] * 2;
			int x1 = terrain[0] * 2;
			int y2 = terrain[3] * 2;
			int x2 = terrain[2] * 2;

			for (int i = y1; i <= y2; i++) {
				for (int j = x1; j <= x2; j++) {

					if (map[i][j] == 1) {
						continue;
					}

					map[i][j] = 1;

					if (i == y1 || i == y2 || j == x1 || j == x2)
						map[i][j] = 2;
				}
			}
		}

		return map;
	}
}
