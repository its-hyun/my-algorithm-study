package LeetCode.Word_Break;

import java.util.ArrayList;
import java.util.List;

public class TestCases {
	private String[] Strings = {
		"leetcode",
		"applepenapple",
		"catsandog",
	};

	private List<List<String>> wordDicts = new ArrayList<>();

	private boolean[] expectedAnswer = {true, true, false};

	public TestCases() {
		wordDicts.add(new ArrayList<>());
		wordDicts.get(0).add("leet");
		wordDicts.get(0).add("code");

		wordDicts.add(new ArrayList<>());
		wordDicts.get(1).add("apple");
		wordDicts.get(1).add("pen");

		wordDicts.add(new ArrayList<>());
		wordDicts.get(2).add("cat");
		wordDicts.get(2).add("dog");
		wordDicts.get(2).add("sand");
		wordDicts.get(2).add("and");
		wordDicts.get(2).add("cat");
	}

	public String getS(int testCase) {
		return Strings[testCase];
	}

	public List<String> getWordDict(int testCase) {
		return wordDicts.get(testCase);
	}

	public boolean getAnswer(int testCase) {
		return expectedAnswer[testCase];
	}
}
