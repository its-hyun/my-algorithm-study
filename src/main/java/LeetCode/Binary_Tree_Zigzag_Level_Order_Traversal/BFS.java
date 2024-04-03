package LeetCode.Binary_Tree_Zigzag_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BFS {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();

		if (root == null) {
			return ans;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int level = ans.size();
			int size = queue.size();
			List<Integer> currentLevelNodes = new ArrayList<>();

			for (int i = 0; i < size; i++) {
				TreeNode currentNode = queue.poll();

				if (level % 2 == 0) {
					currentLevelNodes.add(currentNode.val);
				} else {
					currentLevelNodes.add(0, currentNode.val);
				}

				if (currentNode.left != null) {
					queue.add(currentNode.left);
				}

				if (currentNode.right != null) {
					queue.add(currentNode.right);
				}
			}
			ans.add(currentLevelNodes);
		}

		return ans;
	}
}
