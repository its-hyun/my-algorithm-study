package LeetCode.Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		recursion(root, 0, ans);
		return ans;
	}

	private void recursion(TreeNode root, int level, List<List<Integer>> ans) {
		if (root == null) {
			return;
		}

		if (level == ans.size()) {
			List<Integer> currentLevel = new ArrayList<>();
			currentLevel.add(root.val);
			ans.add(currentLevel);
		} else {
			ans.get(level).add(root.val);
		}

		recursion(root.left, level + 1, ans);
		recursion(root.right, level + 1, ans);
	}
}
