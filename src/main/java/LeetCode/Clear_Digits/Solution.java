package LeetCode.Clear_Digits;

import java.util.Stack;

class Solution {
	public String clearDigits(String s) {
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 97) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
				continue;
			}
			stack.push(String.valueOf(s.charAt(i)));
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
	}
}
