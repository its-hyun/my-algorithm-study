package LeetCode.Fair_Distribution_of_Cookies;

public class TestCases {
	private int[][] cookies = {
		{8, 15, 10, 20, 8},
		{6, 1, 3, 2, 2, 4, 1, 2},
		{941, 797, 1475, 638, 191, 712}
	};

	private int[] k = {2, 3, 3};
	private int[] expectedAnswer = {31, 7, 1653};

	public int[] getCookies(int testCase) {
		return cookies[testCase];
	}

	public int getK(int testCase) {
		return k[testCase];
	}

	public int getExpectedAnswer(int testCase) {
		return expectedAnswer[testCase];
	}
}
