package LeetCode.Two_Sum;

public class TestCases {

	private final int[][] nums = {
		{2, 7, 11, 15},
		{3, 2, 4},
		{3, 3}
	};

	private final int[] targets = {9, 6, 6};

	private final int[][] expectedAnswer = {
		{0, 1},
		{1, 2},
		{0, 1}
	};

	public int[] getNums(int testCase) {
		return nums[testCase];
	}

	public int getTarget(int testCase) {
		return targets[testCase];
	}

	public int[] getExpectedAnswer(int testCase) {
		return expectedAnswer[testCase];
	}
}
