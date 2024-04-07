package LeetCode.Fibonacci_Number;

public class Memoization {
	public int fib(int n) {
		int[] memo = new int[n + 1];
		return calculateFib(n, memo);
	}

	private int calculateFib(int n, int[] memo) {
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		if (memo[n] != 0) {
			return memo[n];
		}

		return memo[n] = calculateFib(n - 1, memo) + calculateFib(n - 2, memo);
	}
}
