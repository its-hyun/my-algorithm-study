package LeetCode.Word_Break;

import java.util.List;

public class Memoization {

	public boolean wordBreak(String s, List<String> wordDict) {
		Boolean[] memo = new Boolean[s.length()];
		return wordBreak(s, wordDict, 0, memo);
	}

	private boolean wordBreak(String s, List<String> wordDict, int index, Boolean[] memo) {
		if (index >= s.length()) {
			return true;
		}

		if (memo[index] != null) {
			return memo[index];
		}

		for (int i = index; i < s.length(); i++) {
			if (wordDict.contains(s.substring(index, i + 1))) {
				if (wordBreak(s, wordDict, i + 1, memo)) {
					return memo[index] = true;
				}
			}
		}
		
		return memo[index] = false;
	}
}
