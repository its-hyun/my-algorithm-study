package LeetCode.Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	public List<List<Integer>> levelOrder(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> ans = new ArrayList<>();

		if (root == null) {
			return ans;
		}

		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> level = new ArrayList<>();
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				level.add(node.val);

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}
			}

			ans.add(level);
		}

		return ans;
	}
}
