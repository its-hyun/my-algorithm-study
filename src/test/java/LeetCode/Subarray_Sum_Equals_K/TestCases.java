package LeetCode.Subarray_Sum_Equals_K;

public class TestCases {
	private final int[] k = {2, 3, 2, 2};
	private final int[][] nums = {
		{1, 1, 1},
		{1, 2, 3},
		{1, 1, 1, -1},
		{1, 1, -1, 1}};
	private final int[] answer = {2, 2, 3, 2};

	public int getK(int i) {
		return k[i];
	}

	public int[] getNums(int i) {
		return nums[i];
	}

	public int getAnswer(int i) {
		return answer[i];
	}
}
