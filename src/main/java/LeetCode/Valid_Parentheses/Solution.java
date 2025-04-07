package LeetCode.Valid_Parentheses;

import java.util.Stack;

class Solution {
	public boolean isValid(String s) {
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			}

			if (stack.size() == 0) {
				return false;
			}

			switch (c) {
				case ')' -> {
					if (stack.pop() != '(')
						return false;
				}
				case '}' -> {
					if (stack.pop() != '{')
						return false;
				}
				case ']' -> {
					if (stack.pop() != '[')
						return false;
				}
			}
		}

		return (stack.size() == 0);
	}
}