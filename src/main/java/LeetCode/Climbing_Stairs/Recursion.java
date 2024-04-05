package LeetCode.Climbing_Stairs;

// Time Limit Exceeded...
public class Recursion {

	public int climbStairs(int n) {
		if (n == 0) {
			return 1;
		}

		int count = 0;

		if (n - 1 >= 0) {
			count += climbStairs(n - 1);
		}

		if (n - 2 >= 0) {
			count += climbStairs(n - 2);
		}

		return count;
	}
}
