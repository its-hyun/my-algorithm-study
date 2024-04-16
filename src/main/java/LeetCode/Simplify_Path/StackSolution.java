package LeetCode.Simplify_Path;

import java.util.Stack;

public class StackSolution {

	public String simplifyPath(String path) {
		Stack<String> stack = new Stack<>();
		String[] splitArr = path.substring(1).split("/");
		String ans = "/";
		for (String s : splitArr) {
			if (s.equals("..") && !stack.isEmpty()) {
				stack.pop();
				continue;
			} else if (s.equals("") || s.equals("..") || s.equals(".")) {
				continue;
			}
			stack.push(s);
		}

		while (!stack.isEmpty()) {
			if (ans.length() == 1) {
				ans += stack.pop();
				continue;
			}

			ans = "/" + stack.pop() + ans;
		}

		return ans;
	}
}
