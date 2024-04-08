package LeetCode.Palindrome_Number;

public class TestCases {

	private final int[] x = {121, -121, 10};
	private final boolean[] expectedAnswer = {true, false, false};

	public int getX(int testCase) {
		return x[testCase];
	}

	public boolean getAnswer(int testCase) {
		return expectedAnswer[testCase];
	}

}
