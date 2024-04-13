package LeetCode.Longest_Increasing_Subsequence;

public class TestCases {

	private final int[][] nums = {
		{10, 9, 2, 5, 3, 7, 101, 18},
		{0, 1, 0, 3, 2, 3},
		{7, 7, 7, 7, 7, 7, 7}
	};

	private final int[] expectedAnswer = {4, 4, 1};

	public int[] getNums(int testCase) {
		return nums[testCase];
	}

	public int getExpectedAnswer(int testCase) {
		return expectedAnswer[testCase];
	}
}
