package LeetCode.Simplify_Path;

public class TestCases {
	private String[] path = {
		"/home/",
		"/../",
		"/home//foo/",
		"/home/..",
		"/home/."
	};

	private String[] expectedAnswer = {
		"/home",
		"/",
		"/home/foo",
		"/",
		"/home"
	};

	public String getPath(int testCase) {
		return path[testCase];
	}

	public String getExpectedAnswer(int testCase) {
		return expectedAnswer[testCase];
	}
}
