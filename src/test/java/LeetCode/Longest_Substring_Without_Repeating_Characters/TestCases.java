package LeetCode.Longest_Substring_Without_Repeating_Characters;

public class TestCases {
	private final String[] s = {
		"abcabcbb",
		"bbbbb",
		"pwwkew"
	};

	private final int[] expectedAnswer = {3, 1, 3};

	public String getS(int testCase) {
		return s[testCase];
	}

	public int getExpectedAnswer(int testCase) {
		return expectedAnswer[testCase];
	}
}
