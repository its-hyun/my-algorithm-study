package LeetCode.Binary_Tree_Zigzag_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.List;

public class TestCases {

	private List<TreeNode> roots = new ArrayList<>();
	private List<List<List<Integer>>> expectedAnswer = new ArrayList<>();

	public TestCases() {
		// TestCase1
		// root = [3,9,20,null,null,15,7]
		TreeNode root1 = new TreeNode(3);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(20);
		TreeNode node3 = new TreeNode(15);
		TreeNode node4 = new TreeNode(7);
		root1.left = node1;
		root1.right = node2;
		node2.left = node3;
		node2.right = node4;
		roots.add(root1);

		List<List<Integer>> case1 = new ArrayList<>();
		case1.add(List.of(3));
		case1.add(List.of(20, 9));
		case1.add(List.of(15, 7));
		expectedAnswer.add(case1);

		// TestCase2
		// root = [1]
		TreeNode root2 = new TreeNode(1);
		roots.add(root2);
		List<List<Integer>> case2 = new ArrayList<>();
		case2.add(List.of(1));
		expectedAnswer.add(case2);

		// TestCase3
		// root = []
		TreeNode root3 = null;
		roots.add(root3);
		List<List<Integer>> case3 = new ArrayList<>();
		expectedAnswer.add(case3);
	}

	public TreeNode getRoot(int i) {
		return roots.get(i);
	}

	public boolean isAnswer(int testCase, List<List<Integer>> result) {

		List<List<Integer>> expected = expectedAnswer.get(testCase);

		if (expected.size() != result.size()) {
			return false;
		}

		for (int i = 0; i < expected.size(); i++) {
			List<Integer> outputList = result.get(i);
			List<Integer> expectedList = expected.get(i);

			// 만약 두 리스트가 다르다면 false를 반환
			if (!outputList.equals(expectedList)) {
				return false;
			}
		}

		return true;
	}
}

