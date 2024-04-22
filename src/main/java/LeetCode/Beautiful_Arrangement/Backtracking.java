package LeetCode.Beautiful_Arrangement;

public class Backtracking {

	public int countArrangement(int n) {
		if (n == 1) {
			return 1;
		}
		boolean[] visited = new boolean[n];
		return createCombination(visited, 0);
	}

	private int createCombination(boolean[] visited, int currentIndex) {

		if (currentIndex == visited.length) {
			return 1;
		}

		int count = 0;
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				visited[i] = true;

				if ((currentIndex + 1) % (i + 1) == 0 || (i + 1) % (currentIndex + 1) == 0) {
					count += createCombination(visited, currentIndex + 1);
				}

				visited[i] = false;
			}
		}

		return count;
	}
}
