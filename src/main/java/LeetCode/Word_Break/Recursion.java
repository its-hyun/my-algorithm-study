package LeetCode.Word_Break;

import java.util.List;

// Time Limit Exceeded
public class Recursion {
	public boolean wordBreak(String s, List<String> wordDict) {
		return wordBreak(s, wordDict, 0);
	}

	private boolean wordBreak(String s, List<String> wordDict, int index) {

		if (index >= s.length()) {
			return true;
		}
		for (int i = index; i < s.length(); i++) {
			if (wordDict.contains(s.substring(index, i + 1))) {
				if (wordBreak(s, wordDict, i + 1)) {
					return true;
				}
			}
		}
		return false;
	}
}
