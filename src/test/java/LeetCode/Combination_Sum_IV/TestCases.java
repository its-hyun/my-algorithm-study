package LeetCode.Combination_Sum_IV;

public class TestCases {

	private int[][] nums = {
		{1, 2, 3},
		{9}
	};

	private int[] target = {4, 3};

	private int[] expectedAnswer = {7, 0};

	public int[] getNums(int testCase) {
		return nums[testCase];
	}

	public int getTarget(int testCase) {
		return target[testCase];
	}

	public int getExpectedAnswer(int testCase) {
		return expectedAnswer[testCase];
	}
}
