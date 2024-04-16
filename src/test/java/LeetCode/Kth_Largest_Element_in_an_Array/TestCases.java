package LeetCode.Kth_Largest_Element_in_an_Array;

public class TestCases {
	private final int[][] nums = {
		{3, 2, 1, 5, 6, 4},
		{3, 2, 3, 1, 2, 4, 5, 5, 6},
	};

	private final int[] k = {2, 4};

	private final int[] expectedAnswer = {5, 4};

	public int[] getNums(int testCase) {
		return nums[testCase];
	}

	public int getK(int testCase) {
		return k[testCase];
	}

	public int getExpectedAnswer(int testCase) {
		return expectedAnswer[testCase];
	}
}
