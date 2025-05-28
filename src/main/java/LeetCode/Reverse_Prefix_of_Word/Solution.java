package LeetCode.Reverse_Prefix_of_Word;

import java.util.Stack;

public class Solution {

	public String reversePrefix(String word, char ch) {
		int idx = word.indexOf(ch);
		if (idx == -1)
			return word; // ch가 없으면 그대로 반환

		Stack<Character> stack = new Stack<>();
		// 0부터 idx까지 스택에 push
		for (int i = 0; i <= idx; i++) {
			stack.push(word.charAt(i));
		}

		StringBuilder sb = new StringBuilder();
		// 스택에서 pop하여 뒤집은 부분 추가
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		// 나머지 부분 추가
		sb.append(word.substring(idx + 1));
		return sb.toString();
	}
}
