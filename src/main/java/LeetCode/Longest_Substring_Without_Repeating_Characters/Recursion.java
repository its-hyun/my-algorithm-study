package LeetCode.Longest_Substring_Without_Repeating_Characters;

import java.util.ArrayList;

public class Recursion {
	public int lengthOfLongestSubstring(String s) {
		int ans = 0;
		ArrayList<Character> list = new ArrayList<>();
		return getLengthOfLongestSubstring(s, 0, list, ans);
	}

	private int getLengthOfLongestSubstring(String s, int i, ArrayList<Character> list, int ans) {
		if (i == s.length()) {
			return Math.max(ans, list.size());
		}

		char ch = s.charAt(i);

		if (list.contains(ch)) {
			ans = Math.max(ans, list.size());
			int index = list.indexOf(ch);
			for (int j = 0; j <= index; j++) {
				list.remove(0);
			}
			list.add(ch);
			return getLengthOfLongestSubstring(s, i + 1, list, ans);
		} else {
			list.add(ch);
			return getLengthOfLongestSubstring(s, i + 1, list, ans);
		}
	}
}
