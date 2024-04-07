package LeetCode.Binary_Tree_Zigzag_Level_Order_Traversal;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Binary Tree Zigzag Level Order Traversal - BFS Solution")
class BFSTest {

	private final BFS bfs = new BFS();
	private final TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void zigzagLevelOrderTest(int testCase) {
		List<List<Integer>> result = bfs.zigzagLevelOrder(testCases.getRoot(testCase));
		assertThat(testCases.isAnswer(testCase, result)).isTrue();
	}
}