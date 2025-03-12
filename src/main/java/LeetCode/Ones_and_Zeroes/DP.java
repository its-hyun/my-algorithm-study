package LeetCode.Ones_and_Zeroes;

public class DP {
    public int findMaxForm(String[] strs, int m, int n) {

        int ans = 0;
        int[][][] memo = new int[m + 1][n + 1][strs.length];

        ans = getSubset(strs, m, n, 0, memo);
        return ans;
    }

    private int getSubset(String[] strs, int m, int n, int current, int[][][] memo) {

        if (current >= strs.length) {
            return 0;
        }

        if (m == 0 && n == 0) {
            return 0;
        }


        if (memo[m][n][current] != 0) {
            return memo[m][n][current];
        }

        int zeroCount = getZeroCount(strs[current]);
        int oneCount = strs[current].length() - zeroCount;

        int include = 0;
        if (zeroCount <= m && oneCount <= n) {
            include = 1 + getSubset(strs, m - zeroCount, n - oneCount, current + 1, memo);
        }

        int exclude = getSubset(strs, m, n, current + 1, memo);

        return memo[m][n][current] = Integer.max(include, exclude);
    }

    private int getZeroCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count++;
            }
        }

        return count;
    }
}
