package Programmers.같은_숫자는_싫어;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

	public int[] solution(int[] arr) {
		Deque<Integer> stack = new ArrayDeque<>();

		for (int num : arr) {
			if (stack.isEmpty() || stack.peek() != num) {
				stack.addLast(num);
			}
		}

		int[] answer = new int[stack.size()];
		for (int i = 0; i < stack.size(); i++) {
			answer[i] = stack.poll();
		}
		return answer;
	}
}