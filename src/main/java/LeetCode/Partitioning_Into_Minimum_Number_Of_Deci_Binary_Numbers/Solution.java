package LeetCode.Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers;

import java.util.stream.Stream;

public class Solution {

	public static void main(String[] args) {
		String n = "32";
		Solution solution = new Solution();
		int result = solution.minPartitions(n);
		System.out.println("result = " + result);
	}

	public int minPartitions(String n) {
		int[] nArr = Stream.of(n.split(""))
			.mapToInt(Integer::parseInt)
			.toArray();

		int ans = 0;
		for (int i : nArr) {
			if (i > ans) {
				ans = i;
			}
		}

		return ans;
	}
}
