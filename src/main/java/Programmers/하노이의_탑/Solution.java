package Programmers.하노이의_탑;

import java.util.ArrayList;
import java.util.List;

class Solution {
	private final List<int[]> result = new ArrayList<>();

	public int[][] solution(int n) {
		hanoi(n, 1, 2, 3);
		int[][] answer = new int[result.size()][2];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}

	private void hanoi(int n, int from, int temp, int to) {
		if (n == 1) {
			result.add(new int[] {from, to});
			return;
		}
		hanoi(n - 1, from, to, temp);
		result.add(new int[] {from, to});
		hanoi(n - 1, temp, from, to);
	}
}
