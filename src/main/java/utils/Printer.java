package utils;

import java.util.ArrayList;

public class Printer {

	/**
	 * 2차원 배열을 출력하는 메서드
	 * @param array 출력할 2차원 배열
	 */
	public static void print2DArray(int[][] array) {
		// 각 열의 최대 너비 계산
		int[] columnWidths = new int[array[0].length];
		for (int[] row : array) {
			for (int j = 0; j < row.length; j++) {
				int width = String.valueOf(row[j]).length(); // 요소의 길이 계산
				if (width > columnWidths[j]) {
					columnWidths[j] = width; // 최대 너비 갱신
				}
			}
		}

		// 배열 출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// 각 열의 너비에 맞게 요소 출력
				System.out.printf("%-" + (columnWidths[j] + 2) + "s", array[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * 2차원 boolean 배열을 출력하는 메서드
	 * @param array 출력할 2차원 boolean 배열
	 */
	public static void print2DArray(boolean[][] array) {
		// 배열 출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// true 또는 false를 출력
				System.out.print(array[i][j] ? "true  " : "false ");
			}
			// 행이 끝나면 줄 바꿈
			System.out.println();
		}
	}

	public static void printAdjList(ArrayList<ArrayList<int[]>> adjList) {
		for (int i = 0; i < adjList.size(); i++) {
			System.out.print("Node " + i + ": ");
			for (int j = 0; j < adjList.get(i).size(); j++) {
				int[] edge = adjList.get(i).get(j);
				int dest = edge[0];
				int weight = edge[1];
				System.out.print("(" + dest + ", " + weight + ") ");
			}
			System.out.println();
		}
	}
}
