package LeetCode.Beautiful_Arrangement;

public class Bitmask {

	public int countArrangement(int n) {
		return dfs(n, 0, 1);
	}

	private int dfs(int n, int mask, int idx) {
		if (idx == n + 1)
			return 1;
		int count = 0;
		for (int j = 1; j <= n; j++) {
			if (((mask >> j) & 1) == 0 && (j % idx == 0 || idx % j == 0)) {
				count += dfs(n, mask | (1 << j), idx + 1);
			}
		}
		return count;
	}
}
