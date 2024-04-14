package LeetCode.Majority_Element;

public class TestCases {

	private final int[][] nums = {
		{3, 2, 3},
		{2, 2, 1, 1, 1, 2, 2}
	};

	private final int[] expectedAnswer = {3, 2};

	public int[] getNums(int testCase) {
		return nums[testCase];
	}

	public int getExpectedAnswer(int testCase) {
		return expectedAnswer[testCase];
	}
}
